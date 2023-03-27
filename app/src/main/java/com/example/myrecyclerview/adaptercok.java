package com.example.myrecyclerview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adaptercok extends RecyclerView.Adapter<piewHolder> {


    public adaptercok(Context defin, List<item> items) {
        this.defin = defin;
        this.items = items;
    }

    Context defin;
    List<item> items;
    @NonNull
    @Override
    public piewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new piewHolder(LayoutInflater.from(defin).inflate(R.layout.item_piew,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull piewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
