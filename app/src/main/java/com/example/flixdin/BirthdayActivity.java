package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class BirthdayActivity extends AppCompatActivity {
    DatePickerDialog datePickerDialog;
    EditText BdayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        getSupportActionBar().hide();
        Button NextButton = findViewById(R.id.next_button);
        BdayText = findViewById(R.id.creden);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                FirebaseAuth auth = FirebaseAuth.getInstance();
                FirebaseUser userFB = auth.getCurrentUser();
                firebaseDatabase.getReference().child("users").child(userFB.getDisplayName()).child("birthday").setValue(BdayText.getText().toString());
                Intent intent = new Intent(BirthdayActivity.this,TermsActivity.class);
                startActivity(intent);
            }
        });


        BdayText = findViewById(R.id.creden);
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);

        BdayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               datePickerDialog = new DatePickerDialog(BirthdayActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                       BdayText.setText(dayOfMonth+"-"+(month+1)+"-"+year);
                   }
               },year,month,day);
                datePickerDialog.show();
            }
        });

        ImageView Back =findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BirthdayActivity.this,LoginSaveActivity.class);
                startActivity(i);
            }
        });



    }
    @Override
    public void onBackPressed() {

    }

}