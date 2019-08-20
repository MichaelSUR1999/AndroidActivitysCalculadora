package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiarabutton (View view){
        Intent i = new Intent(this, ButtonMain.class);
        startActivity(i);
    }
    public void cambiararadio(View view){
        Intent r = new Intent(this, RadioMain.class);
        startActivity(r);
    }
    public void cambiaracheck(View view){
        Intent j = new Intent(this, CheckMain.class);
        startActivity(j);
    }
    public void cambiaraspinner(View view){
        Intent s = new Intent(this, SpinnerMain.class);
        startActivity(s);
    }
    public void cambiaralist(View view){
        Intent l = new Intent(this, ListMain.class);
        startActivity(l);
    }

}
