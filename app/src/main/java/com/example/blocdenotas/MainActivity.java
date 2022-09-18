package com.example.blocdenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NotaFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void FavoritosPrimerActivity(View view){
        Intent favorito = new Intent(this, Favoritos.class );
        startActivity(favorito);
    }
    public void PerfilActivity(View view){
        Intent perfil = new Intent(this, Perfil.class);
        startActivity(perfil);
    }



    @Override
    public void onListFragmentInteraction(Nota item) {

    }
}