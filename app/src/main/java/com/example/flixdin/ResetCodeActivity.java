package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResetCodeActivity extends AppCompatActivity {
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_code);
        Next = findViewById(R.id.next_button);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ResetCodeActivity.this, "Reset Successfull" , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ResetCodeActivity.this,LoginOneActivity.class);
                startActivity(intent);
                Toast.makeText(ResetCodeActivity.this, "Login Again", Toast.LENGTH_SHORT).show();
            }
        });

    }
}