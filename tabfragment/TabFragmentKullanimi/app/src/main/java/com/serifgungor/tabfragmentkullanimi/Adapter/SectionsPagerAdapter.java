package com.serifgungor.tabfragmentkullanimi.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.serifgungor.tabfragmentkullanimi.Fragment.FragmentBaslangic;
import com.serifgungor.tabfragmentkullanimi.Fragment.FragmentIleriDuzey;
import com.serifgungor.tabfragmentkullanimi.Fragment.FragmentMaterialDesign;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private int tabSayisi;

    public SectionsPagerAdapter(FragmentManager fm,int tabSayisi) {
        super(fm);
        this.tabSayisi = tabSayisi;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if(position==0){
            fragment = new FragmentBaslangic();
        }else if(position==1){
            fragment = new FragmentIleriDuzey();
        }else if(position==2){
            fragment = new FragmentMaterialDesign();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabSayisi;
    }
}
