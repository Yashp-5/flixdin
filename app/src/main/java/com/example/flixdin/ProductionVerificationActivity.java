package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProductionVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production_verification);
        getSupportActionBar().hide();
        ImageView Back =findViewById(R.id.back_button);

        Button Done = findViewById(R.id.button3);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductionVerificationActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductionVerificationActivity.this,DomainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}