package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MobileConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_confirmation);
        getSupportActionBar().hide();

        ImageView BackButton = findViewById(R.id.back_button);
        Button NextButton = findViewById(R.id.next_button);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MobileConfirmationActivity.this,UsernameActivity.class);

                startActivity(i);
            }
        });
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileConfirmationActivity.this,LoginSaveActivity.class);
                startActivity(intent);
            }
        });
    }
}