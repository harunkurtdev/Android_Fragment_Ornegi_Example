package com.serifgungor.fragmenttransaction_navigationdrawer.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.serifgungor.fragmenttransaction_navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHaberler extends Fragment {


    public FragmentHaberler() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_haberler, container, false);

        return v;
    }

}
