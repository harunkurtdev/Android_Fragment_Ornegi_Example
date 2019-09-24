package com.serifgungor.dialogfragmentkullanimi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.serifgungor.dialogfragmentkullanimi.Fragment.DialogSinifi;
import com.serifgungor.dialogfragmentkullanimi.Fragment.DialogSinifi2;
import com.serifgungor.dialogfragmentkullanimi.R;

public class MainActivity extends AppCompatActivity {

    Button btnScrollViewDialog,btnViewPagerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScrollViewDialog = findViewById(R.id.btnScrollViewDialog);
        btnScrollViewDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogSinifi ds = new DialogSinifi();
                ds.show(getSupportFragmentManager(),"");
            }
        });

        btnViewPagerDialog = findViewById(R.id.btnViewPager);
        btnViewPagerDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogSinifi2 ds = new DialogSinifi2();
                ds.show(getSupportFragmentManager(),"");
            }
        });
    }
}
