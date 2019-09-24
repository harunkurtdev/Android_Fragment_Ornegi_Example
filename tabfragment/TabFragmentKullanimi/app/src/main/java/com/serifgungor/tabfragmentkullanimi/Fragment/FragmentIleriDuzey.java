package com.serifgungor.tabfragmentkullanimi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.serifgungor.tabfragmentkullanimi.Adapter.RecyclerViewBaslangic;
import com.serifgungor.tabfragmentkullanimi.Model.Konu;
import com.serifgungor.tabfragmentkullanimi.R;

import java.util.ArrayList;

public class FragmentIleriDuzey extends Fragment {

    ArrayList<Konu> konular = new ArrayList<>();
    RecyclerViewBaslangic adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ileri_seviye,null);

        RecyclerView recyclerViewBaslangic = v.findViewById(R.id.recyclerViewIleriSeviye);
        konular.add(new Konu(1,"Recycler View"));
        konular.add(new Konu(1,"Volley"));
        konular.add(new Konu(1,"Retrofit"));
        konular.add(new Konu(1,"NodeJS"));
        konular.add(new Konu(1,"Fragment"));
        konular.add(new Konu(1,"Background Services"));

        adapter = new RecyclerViewBaslangic(konular,getContext(),R.layout.holder_baslangic);
        recyclerViewBaslangic.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewBaslangic.setAdapter(adapter);

        return v;
    }
}
