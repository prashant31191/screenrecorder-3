package com.azteam.screenrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DeepLinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: Add firebase dynamic linking
        startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }
}
