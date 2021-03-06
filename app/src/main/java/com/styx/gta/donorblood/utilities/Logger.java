package com.styx.gta.donorblood.utilities;

import android.util.Log;

import com.styx.gta.donorblood.constants.Constants;

/**
 * Created by amalg on 26-11-2016.
 */

public class Logger {
    private static boolean isLogEnabled = Constants.enableLog;

    public static void e(String TAG, String message) {
        if (isLogEnabled)
            Log.e(TAG, message);
    }
}
