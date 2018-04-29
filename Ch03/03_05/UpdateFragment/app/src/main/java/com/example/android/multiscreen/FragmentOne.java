package com.example.android.multiscreen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    // Declare a TextView
    TextView textView;

    public FragmentOne() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        // Get a reference to the TextView of the Fragment, and
        // save it as a field of the class
        textView = view.findViewById(R.id.fragment_text);

        // Return the view
        return view;
    }

    // This method updates the TextView of the Fragment
    public void updateFragment(String newText) {

        // Set the text of the Fragment using the String parameter passed into
        // the method
        textView.setText(newText);
    }
}
