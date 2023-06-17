package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;

public class LandingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        getSupportActionBar().hide();
        final ImageView flixdinText=findViewById(R.id.flixdin_text);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(LandingActivity.this,LoginOneActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(LandingActivity.this,flixdinText, ViewCompat.getTransitionName(flixdinText));

                startActivity(i,optionsCompat.toBundle());

            }
        }, 1000);


        flixdinText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(LandingActivity.this,LoginOneActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(LandingActivity.this,flixdinText, ViewCompat.getTransitionName(flixdinText));

                startActivity(i,optionsCompat.toBundle());

            }
        });
    }
}