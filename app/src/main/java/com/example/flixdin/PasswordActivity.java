package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class PasswordActivity extends AppCompatActivity {

    ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        getSupportActionBar().hide();
        Button NextButton = findViewById(R.id.next_button);
        EditText pass = findViewById(R.id.username);
        EditText re_pass=findViewById(R.id.repass);

        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pass.getText().toString().equals("")||re_pass.getText().toString().equals(""))
                {
                    Toast.makeText(PasswordActivity.this, "Please fill both fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (pass.getText().toString().equals(re_pass.getText().toString()))
                    {
                        Intent intent = new Intent(PasswordActivity.this,NameActivity.class);
                        Intent i = getIntent();
                        String cred = i.getStringExtra("email");

                        intent.putExtra("email",cred);
                        intent.putExtra("password",pass.getText().toString());
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(PasswordActivity.this, "Both Passwords should be same", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });



        Back = findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasswordActivity.this,MobileNumberActivity.class);
                startActivity(intent);
            }
        });





    }
    @Override
    public void onBackPressed() {

    }

}