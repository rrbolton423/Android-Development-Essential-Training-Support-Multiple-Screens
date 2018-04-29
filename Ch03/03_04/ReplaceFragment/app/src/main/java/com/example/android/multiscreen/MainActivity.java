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

    // When the user clicks the button, this method is called and adds
    // FragmentOne programmatically
    public void addFragmentOne(View view) {

        // Create an instance of FragmentOnt
        FragmentOne fragment = new FragmentOne();

        // Create a FragmentTransaction that replaces the previous
        // fragment with FragmentOne in the placeholder view
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment)
                .commit();
    }

    // When the user clicks the button, this method is called and adds
    // FragmentTwo programmatically
    public void addFragmentTwo(View view) {

        // Create an instance of FragmentTwo
        FragmentTwo fragment = new FragmentTwo();

        // Create a FragmentTransaction that replaces the previous
        // fragment with FragmentTwo in the placeholder view
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment)
                .commit();
    }
}
