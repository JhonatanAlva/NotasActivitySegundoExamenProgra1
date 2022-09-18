package com.example.blocdenotas;

public class Nota {
    private String TituloNota;
    private String textoNota;
    private float Favorita;

    public Nota(String TituloNota, String textoNota, float Favorita){
        this.TituloNota = TituloNota;
        this.textoNota = textoNota;
        this.Favorita = Favorita;
    }

    public String getTituloNota() {
        return TituloNota;
    }

    public void setTituloNota(String tituloNota) {
        TituloNota = tituloNota;
    }

    public String getTextoNota() {
        return textoNota;
    }

    public void setTextoNota(String textoNota) {
        this.textoNota = textoNota;
    }

    public float getFavorita() {
        return Favorita;
    }

    public void setFavorita(float favorita) {
        Favorita = favorita;
    }
}
