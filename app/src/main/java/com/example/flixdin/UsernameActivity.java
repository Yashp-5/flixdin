package com.example.flixdin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.flixdin.model.UserModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class UsernameActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        getSupportActionBar().hide();

        auth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();


        EditText username = findViewById(R.id.username);

        Button NextButton = findViewById(R.id.next_button);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!username.getText().toString().equals(""))
                {
                    Intent intent = new Intent(UsernameActivity.this,MobileConfirmationActivity.class);

                    Intent i = getIntent();
                    String email = i.getStringExtra("email");
                    String password = i.getStringExtra("password");
                    String name = i.getStringExtra("name");
                    intent.putExtra("email",email);
                    intent.putExtra("password",password);
                    intent.putExtra("name",name);
                    i.putExtra("username",username.getText().toString());

                    //login->email->password->name->username->confirmation->login save->bday->terms->profile

                    //firebaseDatabase.getReference().child("users").has

                                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if(task.isSuccessful())
                                        {
                                            UserModel user = new UserModel(email,name,username.getText().toString());
                                            String id =task.getResult().getUser().getUid();
                                            firebaseDatabase.getReference().child("users").child(username.getText().toString()).setValue(user);

                                            FirebaseUser userFB = auth.getCurrentUser();
                                            UserProfileChangeRequest userProfileChangeRequest = new UserProfileChangeRequest.Builder().setDisplayName(username.getText().toString()).build();
                                            userFB.updateProfile(userProfileChangeRequest);




                                            startActivity(intent);

                                        }
                                        else
                                        {
                                            Toast.makeText(UsernameActivity.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                                        }

                                    }
                                });

                }
                else
                {
                    Toast.makeText(UsernameActivity.this, "Please type a Username", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ImageView Back =findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UsernameActivity.this,NameActivity.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onBackPressed() {

    }
}