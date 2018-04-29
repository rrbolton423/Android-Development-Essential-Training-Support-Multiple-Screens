package com.example.android.multiscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragmentOne(View view) {
        FragmentOne fragment = new FragmentOne();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment)
                .commit();
    }

    public void addFragmentTwo(View view) {
        FragmentTwo fragment = new FragmentTwo();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment)
                .commit();
    }
}
