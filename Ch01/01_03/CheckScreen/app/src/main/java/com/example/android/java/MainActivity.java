package com.example.android.java;

import android.content.res.Configuration;
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

        // This code tests to see a device's screen bucket category

        // This screenSize value represents one of the size buckets
        int screenSize = getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;

        // Use a switch statement to evaluate the screenSize
        switch (screenSize) {

            // If the device has a normal screen size...
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                // Display normal screen message
                displayMessage("Normal screen");
                // Break
                break;

            // If the device has a large screen size...
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                // Display large screen message
                displayMessage("Large screen");
                // Break
                break;

            // If the device has a extra large screen size...
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                // Display extra large message
                displayMessage("Extra Large screen");
                // Break
                break;
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