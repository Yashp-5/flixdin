package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProductionVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_verification);
        getSupportActionBar().hide();
    }
}