package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_three);
        getSupportActionBar().hide();
    }
}