package com.fruitsandrobots.androidpushdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.parse.ParsePushBroadcastReceiver;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by w0160 on 15.09.15.
 */
public class PushReceiver extends ParsePushBroadcastReceiver {


    @Override
    protected void onPushReceive(Context context, Intent intent) {
        JSONObject pushData = null;
        try {
            pushData = new JSONObject(intent.getStringExtra("com.parse.Data"));
        } catch (JSONException var7) {
        }
        Log.e("PUSH", pushData.toString());
    }
}
