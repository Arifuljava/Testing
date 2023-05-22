package com.grozziie.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.multidex.MultiDex;


import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiDex.install(this);
        startActivity(new Intent(getApplicationContext(),TestingTestActivity.class));
    }
}