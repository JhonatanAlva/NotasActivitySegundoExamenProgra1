package com.example.blocdenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }
    public void Activy1(View view){
        Intent primerActivity = new Intent(this, MainActivity.class);
        startActivity(primerActivity);
    }
    public void Favoritos(View view){
        Intent favoritos = new Intent(this, Favoritos.class);
        startActivity(favoritos);
    }
}