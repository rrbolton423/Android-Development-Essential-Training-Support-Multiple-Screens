package com.example.android.multiscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragmentOne(View view) {
        FragmentOne fragment = new FragmentOne();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment, FRAGMENT_TAG)
                .commit();
    }

    public void updateFragment(View view) {
        FragmentOne fragment = (FragmentOne) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG);
        if (fragment != null) {
            fragment.updateFragment("Hello from the activity!");
        } else {
            Toast.makeText(this, "Couldn't find the fragment", Toast.LENGTH_SHORT).show();
        }

    }
}
