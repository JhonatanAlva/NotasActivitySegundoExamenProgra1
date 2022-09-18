package com.example.blocdenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Favoritos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
    }
    public void Activity1(View view){
        Intent notas = new Intent(this, MainActivity.class);
        startActivity(notas);
    }
    public void Perfil(View view){
        Intent perfil = new Intent(this, Perfil.class);
        startActivity(perfil);
    }
}