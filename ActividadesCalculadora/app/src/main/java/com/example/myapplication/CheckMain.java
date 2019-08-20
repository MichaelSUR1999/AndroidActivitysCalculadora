package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;
import android.view.View;

public class CheckMain extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv3;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkavtivity);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        checkBox1=(CheckBox)findViewById(R.id.ch1);
        checkBox2=(CheckBox)findViewById(R.id.ch2);
        checkBox3=(CheckBox)findViewById(R.id.ch3);
        checkBox4=(CheckBox)findViewById(R.id.ch4);

    }

    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        float nro11 = Integer.parseInt(valor1);
        float nro22 = Integer.parseInt(valor2);
        String resu = "";
        String espacio = "";
        if (checkBox1.isChecked() == true) {
            int suma = nro1 + nro2;
            resu = " EL RESULTADO DE LA SUMA ES: " + suma + espacio;
            espacio = "";
        }
        if (checkBox2.isChecked() == true) {
            int resta = nro1 - nro2;
            resu = resu + " EL RESULTADO DE LA RESTA ES: " + resta + espacio;
            espacio = "";
        }
        if (checkBox3.isChecked() == true) {
            int multi = nro1 * nro2;
            resu = resu + " EL RESULTADO DE LA MULTIPICACION ES: " + multi;
            espacio = "";
        }
        if (checkBox4.isChecked() == true) {
            float div = nro11 / nro22;
            if (nro2 == 0) {
                resu = resu +"NO ES POSIBLE DIVIDIR EN 0 ";
            } else {
                resu = resu + " EL RESULTADO DE LA DIVISION ES :" + div;

            }
            tv3.setText(resu);
        }
    }
    public void Volver (View view){
        finish();
    }
}