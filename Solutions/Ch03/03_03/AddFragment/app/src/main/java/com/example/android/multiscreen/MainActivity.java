package com.example.android.multiscreen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragment(View view) {
        FragmentOne fragment = new FragmentOne();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.placeholder, fragment)
                .commit();

    }
}
