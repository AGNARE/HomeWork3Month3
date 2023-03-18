package com.agn.homework3month3.reciclerView;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.agn.homework3month3.R;

public class ResturantsViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public ResturantsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String dishNames){
        textView = itemView.findViewById(R.id.dishNameTextView);
        textView.setText(dishNames);

    }
}
