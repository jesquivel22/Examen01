package com.example.examen01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Buscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
    }
    public void  vistaHome(View view){
        Intent vistaHome = new Intent(this, MainActivity.class);
        startActivity(vistaHome);
    }
}