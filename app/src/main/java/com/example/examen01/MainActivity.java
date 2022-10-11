package com.example.examen01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private  String producto[] = {"Jamonada", "Mantequilla","hot dog", "leche","arroz", "Frejol", "Pechuga"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.tv1);
        lv1=(ListView) findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,producto);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de "  + lv1.getItemAtPosition(i) + " es  años");
            }
        });
    }

    public void  vistaAgregar(View view){
        Intent vistaAgregar = new Intent(this, Editar.class);
        startActivity(vistaAgregar);
    }

}