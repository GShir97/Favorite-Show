package com.example.favshow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customAdapter extends RecyclerView.Adapter<customAdapter.MyViewHolder> {

    ArrayList<CharactersData> dataSet;
    public customAdapter(ArrayList<CharactersData> dataSet) {
        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nameView;
        TextView descView;
        ImageView imageView;
        public MyViewHolder (View itemView){
            super (itemView);

            nameView = itemView.findViewById(R.id.textView);
            descView = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public customAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull customAdapter.MyViewHolder holder, int position) {

        TextView nameView = holder.nameView;
        TextView descView = holder.descView;
        ImageView imageView = holder.imageView;

        nameView.setText(dataSet.get(position).getName());
        descView.setText(dataSet.get(position).getDescription());
        imageView.setImageResource(dataSet.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
