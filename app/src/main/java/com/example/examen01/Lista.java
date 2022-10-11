package com.example.examen01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }
    public void  vistaHome(View view){
        Intent vistaHome = new Intent(this, MainActivity.class);
        startActivity(vistaHome);
    }
}