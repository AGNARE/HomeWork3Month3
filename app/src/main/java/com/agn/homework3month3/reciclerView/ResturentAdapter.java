package com.agn.homework3month3.reciclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agn.homework3month3.R;

import java.util.ArrayList;

public class ResturentAdapter extends RecyclerView.Adapter<ResturantsViewHolder> {

    ArrayList<String>arrayListFirst;

    public ResturentAdapter(ArrayList<String> arrayList){
        this.arrayListFirst = arrayList;
    }

    @NonNull
    @Override
    public ResturantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ResturantsViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_resturant,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ResturantsViewHolder holder, int position) {
        holder.onBind(arrayListFirst.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayListFirst.size();
    }
}
