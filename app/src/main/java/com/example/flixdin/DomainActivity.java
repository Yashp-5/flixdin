package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DomainActivity extends AppCompatActivity {
    Spinner spinner;
    RadioGroup radioGroup;
    Boolean isClicked = false;

    String selectedDomain="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domain);
        getSupportActionBar().hide();
        Button NextButton = findViewById(R.id.next_button);
        RelativeLayout domainSelect = findViewById(R.id.domain_select);
        ImageView arrow = findViewById(R.id.down_arrow);
        ScrollView scrollView = findViewById(R.id.scroll_view);
        radioGroup = findViewById(R.id.radio_group);

        domainSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isClicked)
                {
                    scrollView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                    isClicked=true;
                }

                else {
                    scrollView.setVisibility(View.INVISIBLE);
                    arrow.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                    isClicked=false;
                }
            }
        });





        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(selectedDomain.equals(""))
                {
                    Toast.makeText(DomainActivity.this, "Please select a domain", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    if (selectedDomain.equals("Production House"));
                    {
                        Intent i = new Intent(DomainActivity.this,ProductionVerificationActivity.class);
                        startActivity(i);
                    }
                    if(!selectedDomain.equals("Production House"))
                     {
                    Intent intent = new Intent(DomainActivity.this,WelcomeActivity.class);
                    startActivity(intent);
                     }
                }


            }
        });
    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        TextView domain = findViewById(R.id.domain_text);

        RadioButton radioButton = findViewById(radioId);

        domain.setText(radioButton.getText());
        selectedDomain=radioButton.getText().toString();

       // Toast.makeText(this, "Selected Radio Button: " + radioButton.getText(),
        //        Toast.LENGTH_SHORT).show();
    }




}