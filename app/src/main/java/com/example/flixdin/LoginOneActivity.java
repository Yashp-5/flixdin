package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginOneActivity extends AppCompatActivity {

    EditText email;
    TextView forgotPass;

    EditText password;
    Button LoginButton;
    Button SignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_one);
        getSupportActionBar().hide();
        email = findViewById(R.id.email);
        password = findViewById(R.id.username);
        LoginButton = findViewById(R.id.login_button);
        SignUpButton = findViewById(R.id.signup_button);
        forgotPass = findViewById(R.id.forgot_pass);

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginOneActivity.this,ResetCredentialActivity.class);
                startActivity(i);
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("")||password.getText().toString().equals(""))
                {
                    Toast.makeText(LoginOneActivity.this, "Incomplete Credentials", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i =new Intent(LoginOneActivity.this,MobileNumberActivity.class);
                    ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(LoginOneActivity.this,SignUpButton, ViewCompat.getTransitionName(SignUpButton));

                    startActivity(i,optionsCompat.toBundle());
                }
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

    @Override
    public void onBackPressed() {

    }
}