package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Toolbar homePageToolbar;
    Toolbar connectionCallToolbar;

    HomeFragment homeFragment = new HomeFragment();
    SearchFragment searchFragment = new SearchFragment();
    ConnectionCallFragment connectionCallFragment = new ConnectionCallFragment();
    FlixFragment flixFragment = new FlixFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        bottomNavigationView = findViewById(R.id.bottom_nav);
        homePageToolbar = findViewById(R.id.home_page_toolbar);


        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,homeFragment).commit();
                    return true;
                case R.id.search:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,searchFragment).commit();
                    return true;
                case R.id.connectioncall:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,connectionCallFragment).commit();
                    return true;
                case R.id.flix:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,flixFragment).commit();
                    return true;
                case R.id.profile:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,profileFragment).commit();
                    return true;
            }
            return false;
        });

        
    }
}