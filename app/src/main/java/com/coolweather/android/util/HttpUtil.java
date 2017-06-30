package com.coolweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ada on 2017-06-29.
 */

public class HttpUtil {

    private static final String TAG = "HttpUtil";

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {

        Log.d(TAG, "sendOkHttpRequest: ");

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
