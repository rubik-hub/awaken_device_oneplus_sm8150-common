/*
 * Copyright (C) 2021 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

#include <android-base/properties.h>
#include <libinit_utils.h>

#include <libinit_variant.h>

using android::base::GetProperty;

#define PRJ_NAME  "ro.boot.project_name"
#define RF_VER "ro.boot.rf_version"

void search_variant(const std::vector<variant_info_t> variants) {
    std::string prjn_value = GetProperty(PRJ_NAME, "");
    std::string rf_value   = GetProperty(RF_VER, "");

    for (const auto& variant : variants) {
        if ((variant.prjn_value == "" || variant.prjn_value == prjn_value) &&
            (variant.rf_value == "" || variant.rf_value == rf_value)) {
            set_variant_props(variant);
            break;
        }
    }
}

void set_variant_props(const variant_info_t variant) {
    set_ro_build_prop("model", variant.model, true);
    set_ro_build_prop("name", variant.name, true);

    set_ro_build_prop("fingerprint", variant.build_fingerprint);
    property_override("ro.bootimage.build.fingerprint", variant.build_fingerprint);
    property_override("ro.build.description", variant.build_description);
}
