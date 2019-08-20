package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SpinnerMain extends AppCompatActivity {

    private Spinner Spinner1;
    private EditText et1,et2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.spinneractivity);

    et1=(EditText)findViewById(R.id.et1);
    et2=(EditText)findViewById(R.id.et2);
    tv3=(TextView)findViewById(R.id.tv3);

    Spinner1 = (Spinner) findViewById(R.id.Spinner1);
    String []opciones={"SUMAR","RESTAR","MULTIPLICAR","DIVIDIR"};
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        Spinner1.setAdapter(adapter);
    }

    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        float nro11=Integer.parseInt(valor1);
        float nro12=Integer.parseInt(valor2);
        String selec=Spinner1.getSelectedItem().toString();
        if (selec.equals("SUMAR")) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv3.setText(resu);
        } else
        if (selec.equals("RESTAR")) {
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tv3.setText(resu);
        }
        else
        if (selec.equals("MULTIPLICAR")) {
            int multi=nro1*nro2;
            String resu=String.valueOf(multi);
            tv3.setText(resu);

        }
        else
        if (selec.equals("DIVIDIR")) {
            float divi = nro11 / nro12;
            if (nro2 == 0) {
                tv3.setText("NO ES POSIBLE DIVIDIR EN 0");
            } else {
                String resu = String.valueOf(divi);
                tv3.setText(resu);
            }
        }
    }
    public void Volver(View view){
        finish();
    }
}
