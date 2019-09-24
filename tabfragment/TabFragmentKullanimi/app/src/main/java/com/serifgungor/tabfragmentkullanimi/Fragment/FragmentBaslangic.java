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

public class FragmentBaslangic extends Fragment {

    ArrayList<Konu> konular = new ArrayList<>();
    RecyclerViewBaslangic adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_baslangic,null);

        RecyclerView recyclerViewBaslangic = v.findViewById(R.id.recyclerViewBaslangic);
        konular.add(new Konu(1,"Hello World !"));
        konular.add(new Konu(1,"Toast Kullanımı"));
        konular.add(new Konu(1,"Button Kullanımı"));
        konular.add(new Konu(1,"TextView Kullanımı"));
        konular.add(new Konu(1,"WebView Kullanımı"));
        konular.add(new Konu(1,"Click Events"));

        adapter = new RecyclerViewBaslangic(konular,getContext(),R.layout.holder_baslangic);
        recyclerViewBaslangic.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewBaslangic.setAdapter(adapter);

        return v;
    }
}
