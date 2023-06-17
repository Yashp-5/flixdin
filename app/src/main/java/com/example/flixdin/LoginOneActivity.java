package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginOneActivity extends AppCompatActivity {

    EditText password;
    Button LoginButton;
    Button SignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_one);
        getSupportActionBar().hide();
        password = findViewById(R.id.passText);
        LoginButton = findViewById(R.id.login_button);
        SignUpButton = findViewById(R.id.signup_button);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOneActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(LoginOneActivity.this,MobileNumberActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(LoginOneActivity.this,SignUpButton, ViewCompat.getTransitionName(SignUpButton));

                startActivity(i,optionsCompat.toBundle());
            }
        });


        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    password.setText("");
                }
                else {
                    password.setText("Password");
                }
            }
        });

    }
}