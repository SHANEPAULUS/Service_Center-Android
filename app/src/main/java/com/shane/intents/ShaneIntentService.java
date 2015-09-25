package com.shane.intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by SHANE on 2015/09/25.
 */
public class ShaneIntentService extends IntentService{

    public static final String TAG="com.shane.intents";

    public ShaneIntentService() {
        super("ShaneIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //What the service is responsible for..
        Log.i(TAG,"The service has started...");

    }
}
