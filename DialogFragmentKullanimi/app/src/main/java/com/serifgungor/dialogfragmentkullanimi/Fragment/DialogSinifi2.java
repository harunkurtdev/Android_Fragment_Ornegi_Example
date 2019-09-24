package com.serifgungor.dialogfragmentkullanimi.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.serifgungor.dialogfragmentkullanimi.Adapter.ViewPagerAdapter;
import com.serifgungor.dialogfragmentkullanimi.R;

import java.util.ArrayList;
import java.util.List;

public class DialogSinifi2 extends DialogFragment {

    ViewPagerAdapter adapter;
    List<Fragment> fragments;
    ViewPager viewPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Sınıf üretildiğinde
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //sınıf layout'a bağlandığında
        View v =  inflater.inflate(R.layout.viewpagerdialog_layout,null);
        viewPager = v.findViewById(R.id.viewPager);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // layout tanımlandığında

        fragments = new ArrayList<>();
        fragments.add(new FragmentLayout1());
        fragments.add(new FragmentLayout2());
        adapter = new ViewPagerAdapter(getChildFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
    }

}
