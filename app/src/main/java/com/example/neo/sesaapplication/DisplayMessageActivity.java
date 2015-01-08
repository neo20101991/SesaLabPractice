package com.example.neo.sesaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends MainActivity {
    public final static String LOGTAG = "neo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Log.d(LOGTAG, "OnCreate Error");

// get the Intent
        Intent intent = getIntent();
// get the message we placed in
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
// Create a TextView and fill it with the message
        TextView textView = (TextView) findViewById(R.id.view_message) ;
        textView.setText(message);

    }
}