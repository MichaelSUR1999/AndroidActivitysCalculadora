package com.example.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListMain extends Activity {
    private String[] paises = { "NARUTO SHIPPUDEN", "ONE PIECE", "DRAGON BALL Z", "ONE PUCH MAN",
            "BLEACH", "CABALLEROS DEL ZODIACO", "YU GI OH", "POKEMON", "DIGIMON", "SUPER CAMPEONES" };
    private String[] habitantes = { " 700 en total ", " 784 en total", "291 en total",
            "24 en total", "70 en total", "114 en total", " 224 en total", "1000 en total",
            "54 en total", "128 en total" };
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listactivity);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1 =(ListView)findViewById(R.id.listView1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                tv1.setText("Los Capitulos de "+ lv1.getItemAtPosition(posicion) + " Son "+ habitantes[posicion]);
            }
        });
    }
    public void Volver (View view){
        finish();
    }
}
