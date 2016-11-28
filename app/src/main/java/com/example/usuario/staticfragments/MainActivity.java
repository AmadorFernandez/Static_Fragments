package com.example.usuario.staticfragments;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import layout.FragmentA;
import layout.FragmentB;
import layout.FragmentC;

public class MainActivity extends Activity implements FragmentA.FragmentsIterationListener {

    private FragmentB fragmentB;
    private FragmentC fragmentC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentB = (FragmentB)getFragmentManager().findFragmentById(R.id.frb);


    }


    @Override
    public void onFramentInteradionListener(String args, float size) {


        fragmentB.modificar(args, size);
    }


}
