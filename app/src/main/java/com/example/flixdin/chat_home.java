package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class chat_home extends AppCompatActivity {


    EditText searchButton;
    Button primary, general, requests;

    ChatFragment chatFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatFragment = new ChatFragment();
        searchButton = findViewById(R.id.search_bar);
        searchButton.setOnClickListener((v)->{
            startActivity(new Intent(this,SearchUserActivity.class));
        });
        general= findViewById(R.id.general_button);
        primary=findViewById(R.id.primary_button);
        requests= findViewById(R.id.request_btn);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new generalChat_fragment());
            }
        });
        primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new primaryChat_fragment());
            }
        });
        requests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new requestChat_frag());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.chat_list,fragment);
        fragmentTransaction.commit();
    }
}

