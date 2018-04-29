package com.example.android.java;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScrollView mScroll;
    private TextView mLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      Initialize the logging components
        mScroll = (ScrollView) findViewById(R.id.scrollLog);
        mLog = (TextView) findViewById(R.id.tvLog);
        mLog.setText("");

    }

    public void onRunBtnClick(View v) {
        // This code tests to see a device's current API level

        // Get the API Level of the Device
        int apiLevel = Build.VERSION.SDK_INT;

        // Display the API Level of the Device
        displayMessage("API Level = " + apiLevel);

        // If the API Level is Marshmallow...
        if (apiLevel >= Build.VERSION_CODES.M) {

            // Display Marshmallow message
            displayMessage("working on Marshmallow or later");

            // If the API Level is Marshmallow...
        } else {

            // Display pre-Marshmallow message
            displayMessage("working on pre-Marshmallow version");
        }
    }

    public void onClearBtnClick(View v) {

        // Clear the logging components
        mLog.setText("");
        mScroll.scrollTo(0, mScroll.getBottom());
    }

    public void displayMessage(String message) {

        // Display the logging components
        mLog.append(message + "\n");
        mScroll.scrollTo(0, mScroll.getBottom());
    }
}