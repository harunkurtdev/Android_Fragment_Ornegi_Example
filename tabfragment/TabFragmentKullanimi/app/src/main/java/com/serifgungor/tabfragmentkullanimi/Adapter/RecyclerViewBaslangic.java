package com.serifgungor.tabfragmentkullanimi.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.serifgungor.tabfragmentkullanimi.Holder.HolderBaslangic;
import com.serifgungor.tabfragmentkullanimi.Model.Konu;
import com.serifgungor.tabfragmentkullanimi.R;

import java.util.ArrayList;

public class RecyclerViewBaslangic extends RecyclerView.Adapter<HolderBaslangic> {
    ArrayList<Konu> konular;
    Context context;
    int layout;

    public RecyclerViewBaslangic(ArrayList<Konu> konular,Context context,int layout){
        this.konular = konular;
        this.context = context;
        this.layout = layout;
    }

    @NonNull
    @Override
    public HolderBaslangic onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout,null);
        return new HolderBaslangic(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBaslangic holder, final int position) {
        holder.tvBaslik.setText(konular.get(position).getKonuAdi());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,konular.get(position).getKonuAdi(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return konular.size();
    }
}
