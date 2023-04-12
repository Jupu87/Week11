package com.example.listaaja;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    //ImageView studentImage;
    TextView itemName;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.txtItemName);
    }
}