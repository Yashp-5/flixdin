package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResetCredentialActivity extends AppCompatActivity {
    Button next;
    ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_credential);
        getSupportActionBar().hide();
        next = findViewById(R.id.next_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResetCredentialActivity.this,ResetPassActivity.class);
                startActivity(intent);

            }
        });

        Back = findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResetCredentialActivity.this,LoginOneActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {

    }
}