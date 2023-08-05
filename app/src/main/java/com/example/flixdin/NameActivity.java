package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        getSupportActionBar().hide();
        ImageView BackButton =findViewById(R.id.back_button);
        Button NextButton = findViewById(R.id.next_button);
        EditText name = findViewById(R.id.creden);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(NameActivity.this,PasswordActivity.class);
                startActivity(i);



            }
        });
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NameActivity.this,UsernameActivity.class);


                if(!name.getText().toString().equals(""))
                {

                    Intent i = getIntent();
                    String email = i.getStringExtra("email");
                    String password = i.getStringExtra("password");
                    intent.putExtra("email",email);
                    intent.putExtra("password",password);
                    intent.putExtra("name",name.getText().toString());
                    Log.i("values",email+password+name.getText().toString());
                    startActivity(intent);

                }

                else
                {
                    Toast.makeText(NameActivity.this, "Please enter full name", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    @Override
    public void onBackPressed() {

    }

}