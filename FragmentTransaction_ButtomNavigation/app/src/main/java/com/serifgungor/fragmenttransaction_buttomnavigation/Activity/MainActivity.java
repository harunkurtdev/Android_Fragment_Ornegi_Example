package com.serifgungor.fragmenttransaction_buttomnavigation.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.serifgungor.fragmenttransaction_buttomnavigation.Fragment.FragmentAnasayfa;
import com.serifgungor.fragmenttransaction_buttomnavigation.Fragment.FragmentArama;
import com.serifgungor.fragmenttransaction_buttomnavigation.Fragment.FragmentBegeniler;
import com.serifgungor.fragmenttransaction_buttomnavigation.Fragment.FragmentProfil;
import com.serifgungor.fragmenttransaction_buttomnavigation.R;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.item_anasayfa:
                    icerigiDegistir(new FragmentAnasayfa());
                    break;
                case R.id.item_arama:
                    icerigiDegistir(new FragmentArama());
                    break;
                case R.id.item_begeniler:
                    icerigiDegistir(new FragmentBegeniler());
                    break;
                case R.id.item_fotograf:

                    break;
                case R.id.item_profil:
                    icerigiDegistir(new FragmentProfil());
                    break;
            }
            return true;
        }
    };

    BottomNavigationView navigation;
    FrameLayout frameLayout;


    public void icerigiDegistir(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Fragment Transaction sınıfı üretebilmek için manager oluşturduk
        FragmentTransaction ft = fragmentManager.beginTransaction();
        //Sayfa içeriğini FrameLayout nesnesine Fragment tipinde
        //ekleyebilmek ve gösterebilmek için kullanılır.
        ft.replace(R.id.frameLayout,fragment);
        //Hangi framelayout nesnesini, hangi fragment ile doldurmam gerektiğini
        //temsil eder.
        ft.commit();
        //değişikliği sağlar.


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.navigation);
        frameLayout = findViewById(R.id.frameLayout);
        icerigiDegistir(new FragmentAnasayfa());
        //Açılan ilk sayfanın tanımlanması

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
