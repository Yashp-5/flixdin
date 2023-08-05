package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import Adapter.domainAdapter;
import models.DomainList;
import models.domainNames;

public class PreferenceActivity extends AppCompatActivity
{
    ArrayList<domainNames> list = new ArrayList<>();
    RecyclerView domainRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        getSupportActionBar().hide();


        domainAdapter adapter = new domainAdapter(DomainList.getDomainList(),this);
        domainRecycler = findViewById(R.id.domain_recycler);
        domainRecycler.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        domainRecycler.setLayoutManager(linearLayoutManager);



        Button NextButton = findViewById(R.id.next_button);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreferenceActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });

        ImageView Back = findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PreferenceActivity.this,DomainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}