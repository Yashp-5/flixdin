package Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flixdin.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import models.domainNames;

public class domainAdapter extends RecyclerView.Adapter<domainAdapter.Viewholder>
{
    ArrayList<domainNames> list;
    Context context;

    int count = 0;
    ArrayList<String> SKILLS = new ArrayList<>();


    public domainAdapter(ArrayList<domainNames> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public domainAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.domain_item,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder( domainAdapter.Viewholder holder, int position) {
        domainNames domainNames = list.get(position);
        holder.title.setText(domainNames.getTitle());
        holder.priority.setText(domainNames.getPriority());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        TextView title;
        Boolean Checked;
        TextView priority;

        FirebaseDatabase database;
        FirebaseAuth auth;
        FirebaseUser user;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            priority = itemView.findViewById(R.id.priority);
            Checked=false;


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(!Checked && count<2)
                    {
                        Checked=true;
                        priority.setBackgroundResource(R.drawable.gold_circle_text);
                        count++;
                        SKILLS.add(title.getText().toString());
                    }
                    else if (Checked)
                    {
                        priority.setBackgroundResource(R.drawable.circle_text);
                        Checked=false;
                        count--;
                        SKILLS.remove(title.getText().toString());
                    }

                    Log.i("skills :", SKILLS.toString());
                    database= FirebaseDatabase.getInstance();
                    auth= FirebaseAuth.getInstance();
                    user=auth.getCurrentUser();
                    database.getReference().child("users").child(user.getDisplayName()).child("otherskills").setValue(SKILLS);

                }
            });

        }
    }
}
