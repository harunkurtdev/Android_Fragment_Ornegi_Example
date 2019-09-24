package com.serifgungor.tabfragmentkullanimi.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.serifgungor.tabfragmentkullanimi.R;

public class HolderBaslangic extends RecyclerView.ViewHolder {

    public TextView tvBaslik;

    public HolderBaslangic(View itemView) {
        super(itemView);
        tvBaslik = itemView.findViewById(R.id.tvBaslangicText);
    }

}
