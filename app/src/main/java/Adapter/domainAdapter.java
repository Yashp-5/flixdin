package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flixdin.R;

import java.util.ArrayList;

import models.domainNames;

public class domainAdapter extends RecyclerView.Adapter<domainAdapter.Viewholder>
{
    ArrayList<domainNames> list;
    Context context;

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

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            priority = itemView.findViewById(R.id.priority);

        }
    }
}
