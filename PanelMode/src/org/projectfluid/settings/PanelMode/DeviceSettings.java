/*
* Copyright (C) 2021 Yet Another AOSP Project
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*
*/
package org.projectfluid.settings.PanelMode;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragment;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;

public class PanelMode extends PreferenceFragment
        implements Preference.OnPreferenceChangeListener {

    private static final String KEY_CATEGORY_GRAPHICS = "graphics";
    public static final String KEY_SRGB_SWITCH = "srgb";
    public static final String KEY_DCI_SWITCH = "dci";
    public static final String KEY_WIDECOLOR_SWITCH = "widecolor";
    public static final String KEY_NATURAL_SWITCH = "natural";
    public static final String KEY_VIVID_SWITCH = "vivid";

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {
        return super.onPreferenceTreeClick(preference);
    }

}
