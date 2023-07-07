package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().hide();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(WelcomeActivity.this,MainActivity.class);
              //  ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(WelcomeActivity.this.this,flixdinText, ViewCompat.getTransitionName(flixdinText));

                startActivity(i);

            }
        }, 1000);




    }
}