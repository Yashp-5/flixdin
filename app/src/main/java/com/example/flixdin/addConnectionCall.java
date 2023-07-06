package com.example.flixdin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class addConnectionCall extends AppCompatActivity {

    String[] item = {"Actor", "Director", "Cinematographer"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_connection_call);

       autoCompleteTextView = findViewById(R.id.auto_complete_txt);
       adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, item);

       autoCompleteTextView.setAdapter(adapterItems);
       autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String item = adapterItems.getItem(position).toString();
               Toast.makeText(addConnectionCall.this, "Item: "+item, Toast.LENGTH_SHORT).show();

           }



       });

    }
}