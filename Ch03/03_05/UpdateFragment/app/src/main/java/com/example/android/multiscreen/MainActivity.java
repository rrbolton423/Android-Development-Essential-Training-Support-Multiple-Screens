package com.example.android.multiscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Create a TAG constant to identify a specific Fragment
    public static final String FRAGMENT_TAG = "fragment_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // When the user clicks the button, this method is called and adds
    // a fragment programmatically
    public void addFragmentOne(View view) {

        // Create an instance of FragmentOnt
        FragmentOne fragment = new FragmentOne();

        // Create a FragmentTransaction that replaces the previous
        // fragment with FragmentOne in the placeholder view.
        // Also, provide a TAG to identify the Fragment, so it can be
        // updated later
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, fragment, FRAGMENT_TAG)
                .commit();
    }

    // This method updates an existing Fragment by calling
    // one of it's methods
    public void updateFragment(View view) {

        // Create a reference to the Fragment you want to update,
        // finding it by it's specific TAG
        FragmentOne fragment = (FragmentOne) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG);

        // If the fragment isn't null...
        if (fragment != null) {

            // Update the Fragment's text
            fragment.updateFragment("Hello from the activity");

            // If the fragment is null...
        } else {

            // Display error Toast
            Toast.makeText(this, "Couldn't find the fragment", Toast.LENGTH_SHORT).show();
        }
    }
}
