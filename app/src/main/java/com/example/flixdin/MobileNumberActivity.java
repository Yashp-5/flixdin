package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MobileNumberActivity extends AppCompatActivity {

    ImageView BackButton;
    Button NextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number);
        getSupportActionBar().hide();

        BackButton = findViewById(R.id.back_button);
        NextButton = findViewById(R.id.next_button);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MobileNumberActivity.this,LoginOneActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MobileNumberActivity.this,NextButton, ViewCompat.getTransitionName(NextButton));

                startActivity(i,optionsCompat.toBundle());
            }
        });
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MobileNumberActivity.this,MobileConfirmationActivity.class);
                startActivity(i);
            }
        });

    }
}