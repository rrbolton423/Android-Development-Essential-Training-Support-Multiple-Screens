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
        int apiLevel = Build.VERSION.SDK_INT;
        displayMessage("API Level = " + apiLevel);

        if (apiLevel >= Build.VERSION_CODES.M) {
            displayMessage("working on Marshmallow or later");
        } else {
            displayMessage("working on pre-Marshmallow version");
        }
        int screenSize = getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;
        switch (screenSize) {
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                displayMessage("Normal screen");
                break;
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                displayMessage("Large screen");
                break;
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                displayMessage("Extra large screen");
                break;
        }
    }

    public void onClearBtnClick(View v) {
        mLog.setText("");
        mScroll.scrollTo(0, mScroll.getBottom());
    }

    public void displayMessage(String message) {
        mLog.append(message + "\n");
        mScroll.scrollTo(0, mScroll.getBottom());
    }
}