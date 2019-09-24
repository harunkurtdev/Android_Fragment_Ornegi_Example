package com.serifgungor.fragmenttransaction_buttomnavigation.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.serifgungor.fragmenttransaction_buttomnavigation.R;

public class FragmentAnasayfa extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_anasayfa,null);

        final EditText etAdSoyad = v.findViewById(R.id.etAdSoyad);
        Button btnGonder = v.findViewById(R.id.btnGonder);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),etAdSoyad.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }

}
