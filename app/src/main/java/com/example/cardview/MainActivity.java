package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//here is the reference between this file and main_layout file
        setContentView(R.layout.main_layout);
    }
}