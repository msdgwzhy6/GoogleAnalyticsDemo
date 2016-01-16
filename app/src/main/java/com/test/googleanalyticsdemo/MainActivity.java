package com.test.googleanalyticsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends Activity {

    private Tracker mTracker;
    private String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Setting screen name: " + "MainActivity onResume");
        mTracker.setScreenName("Image~" + "MainActivity onResume");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }


}
