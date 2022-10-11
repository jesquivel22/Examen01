package com.example.examen01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Agregar extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        spinner1 = (Spinner) findViewById(R.id.spinner1);

        String[] opciones = {"Carnes","Lacteos","Menestras "};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,opciones);
        spinner1.setAdapter(adapter);
    }
    public void  vistaHome(View view){
        Intent vistaHome = new Intent(this, MainActivity.class);
        startActivity(vistaHome);
    }
}