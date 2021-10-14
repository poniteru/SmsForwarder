package com.idormy.sms.forwarder.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;

@SuppressWarnings("SynchronizeOnNonFinalField")
public class InitUtil {
    static Boolean hasInit = false;
    private static String TAG = "InitUtil";

    public static void init() {
        Log.d(TAG, "SmsForwarder init");
        //noinspection SynchronizeOnNonFinalField
        synchronized (hasInit) {
            if (hasInit) return;
            hasInit = true;
            Log.d(TAG, "init context");
            SettingUtil.init();
        }


    }

}
