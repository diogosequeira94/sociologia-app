package com.example.sociologiaapp.Activity;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sociologiaapp.Fragmentos.FragmentHome;
import com.example.sociologiaapp.R;


public class MainActivity extends AppCompatActivity implements FragmentHome.OnFragmentInteractionListener {


    private FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();




        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container,new FragmentHome());
        fragmentTransaction.commit();


    }


    @Override
    public void onFragmentInteraction(Uri uri) {



    }
}
