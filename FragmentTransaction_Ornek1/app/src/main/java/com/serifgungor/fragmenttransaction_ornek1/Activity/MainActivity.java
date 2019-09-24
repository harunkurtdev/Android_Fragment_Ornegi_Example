package com.serifgungor.fragmenttransaction_ornek1.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.serifgungor.fragmenttransaction_ornek1.Fragment.FragmentAlisveris;
import com.serifgungor.fragmenttransaction_ornek1.Fragment.FragmentEglence;
import com.serifgungor.fragmenttransaction_ornek1.Fragment.FragmentFotografcilik;
import com.serifgungor.fragmenttransaction_ornek1.Fragment.FragmentMuzikVeSes;
import com.serifgungor.fragmenttransaction_ornek1.Fragment.FragmentOyunlar;
import com.serifgungor.fragmenttransaction_ornek1.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;


    public void islemYap(int i) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        if(i==0){
            ft.replace(R.id.frameLayout,new FragmentOyunlar());
        }else if(i==1){
            ft.replace(R.id.frameLayout,new FragmentEglence());
        }else if(i==2){
            ft.replace(R.id.frameLayout,new FragmentFotografcilik());
        }else if(i==3){
            ft.replace(R.id.frameLayout,new FragmentMuzikVeSes());
        }else if(i==4){
            ft.replace(R.id.frameLayout,new FragmentAlisveris());
        }

        ft.commit();
    }


    public void nesneEkle(String baslik, final int id) {
        Button button = new Button(MainActivity.this);
        button.setText(baslik);
        button.setId(id);
        button.setBackgroundResource(R.drawable.custom_button_border);
        button.setPadding(50, 0, 50, 0);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                islemYap(id);
            }
        });

        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        button.setHeight(60);
        lParams.bottomMargin = 50;
        lParams.topMargin = 50;
        lParams.rightMargin = 10;
        lParams.leftMargin = 10;
        button.setLayoutParams(lParams);

        linearLayout.addView(button);
        //LinearLayout içerisine programatik olarak nesne eklemek
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linear1);

        String[] butonlar = {"Oyunlar", "Eğlence", "Fotoğrafçılık", "Müzik ve Ses", "Alışveriş"};

        for (int i = 0; i < butonlar.length; i++) {
            nesneEkle(butonlar[i], i);
        }
        
        islemYap(0);


    }

}
