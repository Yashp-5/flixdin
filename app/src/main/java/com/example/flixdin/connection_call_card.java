package com.example.flixdin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.flixdin.model.ConnectionCallModel;
import com.example.flixdin.model.UserModel;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Date;
import java.util.UUID;

public class connection_call_card extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ImageView profile_imageView;
    TextView username_textView;
    TextView domain_textView;
    CardView connectionCall_CardView;
    Button add_button;
    CardView confirmation_CardView;
    Button confirmationYes_button;
    Button confirmationNo_button;

    EditText location_editText;
    EditText description_editText;

    ArrayAdapter<String> adapterItems ;

    FirebaseAuth mAuth;
    FirebaseUser mUser;

    String userID;
    String userName;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference_user;
    DatabaseReference databaseReference_connection;

    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_call_card);


        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        profile_imageView = findViewById(R.id.profile_imageView);
        username_textView = findViewById(R.id.username_textView);
        domain_textView = findViewById(R.id.domain_textView);
        add_button = findViewById(R.id.add_button);
        confirmation_CardView = findViewById(R.id.confirmation_CardView);
        confirmationYes_button = findViewById(R.id.confirmYes_button);
        confirmationNo_button = findViewById(R.id.confirmNo_button);
        connectionCall_CardView = findViewById(R.id.connectionCallCard);
        location_editText = findViewById(R.id.location_editText);
        description_editText = findViewById(R.id.description_editText);

        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = adapterItems.getItem(position).toString();
                Toast.makeText(connection_call_card.this, "Item: "+item, Toast.LENGTH_SHORT).show();

            }

        });

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        userID = mUser.getUid();
        userName = mUser.getDisplayName();

        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();
        databaseReference_user = firebaseDatabase.getReference("users").child(userID);
        databaseReference_connection = firebaseDatabase.getReference("ConnectionCalls");
        storageReference = firebaseStorage.getReference("profile/"+userID+"/.jpeg");

        fetchDetails();
        fetchProfile();

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmation_CardView.setVisibility(View.VISIBLE);
                connectionCall_CardView.setVisibility(View.INVISIBLE);
            }
        });

        confirmationNo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmation_CardView.setVisibility(View.INVISIBLE);
                connectionCall_CardView.setVisibility(View.VISIBLE);
            }
        });

        confirmationYes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadConnectionCall();
            }
        });



    }

    void fetchDetails(){
        databaseReference_user.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserModel user = snapshot.getValue(UserModel.class);
                username_textView.setText(user.getUsername());
                domain_textView.setText(user.getDomain());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    void fetchProfile(){
        storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String add = uri.toString();
                Glide.with(getApplicationContext()).load(add).into(profile_imageView);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }

    void uploadConnectionCall(){

        // Get details of the connection call from the activity
        ConnectionCallModel connectionCallModel = new ConnectionCallModel();

        Date date = new Date();
        long time = date.getTime();
        String timestamp = String.valueOf(time);
        String connectionCallID = timestamp + UUID.randomUUID().toString();
        String ownerId = userID;
        String ownerName = userName;
        String jobDesc = description_editText.getText().toString();
        String location = location_editText.getText().toString();
        String need = autoCompleteTextView.getText().toString();
        connectionCallModel.setConnectionCallID(connectionCallID);
        connectionCallModel.setUserID(ownerId);
        connectionCallModel.setUsername(ownerName);
        connectionCallModel.setJobDesc(jobDesc);
        connectionCallModel.setLocation(location);
        connectionCallModel.setDomain(need);

        // Upload the connection call to firebase
        databaseReference_connection.child(connectionCallID).setValue(connectionCallModel);

        // Add the connection call ID to user's connection call list
        databaseReference_user.child("connectionCalls").setValue(connectionCallID);

    }

}