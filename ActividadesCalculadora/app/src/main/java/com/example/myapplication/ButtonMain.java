package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonMain extends AppCompatActivity {
    private EditText et11,et22;
    private TextView tv33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatoractivity);

        et11=(EditText)findViewById(R.id.et1);
        et22=(EditText)findViewById(R.id.et2);
        tv33=(TextView)findViewById(R.id.tv3);
    }

    public void sumar(View view) {
        String valor1=et11.getText().toString();
        String valor2=et22.getText().toString();
        int et11=Integer.parseInt(valor1);
        int et22=Integer.parseInt(valor2);
        int suma=et11+et22;
        String resu=String.valueOf(suma);
        tv33.setText(resu);
    }

    public void restar (View view) {
        String valor1=et11.getText().toString();
        String valor2=et22.getText().toString();
        int et11=Integer.parseInt(valor1);
        int et22=Integer.parseInt(valor2);
        int resta=et11-et22;
        String resu=String.valueOf(resta);
        tv33.setText(resu);
    }

    public void multiplicar(View view) {
        String valor1=et11.getText().toString();
        String valor2=et22.getText().toString();
        int et11=Integer.parseInt(valor1);
        int et22=Integer.parseInt(valor2);
        int multi=et11*et22;
        String resu=String.valueOf(multi);
        tv33.setText(resu);
    }

    public void dividir(View view) {
        String valor1=et11.getText().toString();
        String valor2=et22.getText().toString();
        float et11=Integer.parseInt(valor1);
        float et22=Integer.parseInt(valor2);
        double div=et11/et22;
        if(et22==0){
            System.out.println();
            tv33.setText("NO ES POSIBLE DIVIRI EN 0");
        }else {
            String resu = String.valueOf(div);
            tv33.setText(resu);
        }
    }

    public void Volver(View view){
        finish();
    }
}
