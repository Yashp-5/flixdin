package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class LoginSaveActivity extends AppCompatActivity {
    ImageView Back;


    FirebaseAuth auth;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_save);
        getSupportActionBar().hide();
        Button SaveButton = findViewById(R.id.save_button);



        auth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();


        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser user = auth.getCurrentUser();
                Toast.makeText(LoginSaveActivity.this, ""+ user.getDisplayName(), Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(LoginSaveActivity.this,BirthdayActivity.class);
                startActivity(intent);
            }
        });
        Back = findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSaveActivity.this,MobileConfirmationActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {

    }

}