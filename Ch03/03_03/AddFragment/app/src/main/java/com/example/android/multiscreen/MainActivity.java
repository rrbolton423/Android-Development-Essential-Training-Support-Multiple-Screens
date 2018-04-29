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
    // a fragment programmatically
    public void addFragment(View view) {

        // Create an instance of my Fragment class
        FragmentOne fragment = new FragmentOne();

        // Create a Fragment Transaction
        getSupportFragmentManager().beginTransaction()
                .add(R.id.placeholder, fragment) // Add the fragment to the placeholder
                .commit(); // commit the transaction
    }
}
