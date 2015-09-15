package com.fruitsandrobots.androidpushdemo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParsePush;

/**
 * Created by w0160 on 15.09.15.
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "bUjWmN7oRm6n9whPee5rV9hI4PPEM4lb7HGcHssn", "ikmv62QPSURZZXbLLqu52ARbEhBYfjIeQhAioyh4");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
