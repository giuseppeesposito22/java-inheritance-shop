package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    protected int codice;
    protected String nome;
    protected String marca;
    protected float prezzo;
    protected float iva;

    

    public Prodotto(String nome, String marca, float prezzo){
        Random randomNum = new Random();

        this.codice = randomNum.nextInt(50);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = 22;
    }



    public int getCodice() {
        return codice;
    }




    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public float getPrezzo() {
        return prezzo;
    }



    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }



    public float getIva() {
        return iva;
    }



    public void setIva(float iva) {
        this.iva = iva;
    }

    public float prezzoIva(){
     return prezzo = prezzo + (prezzo * (iva / 100));

    }

    public float prezzoCartaFedelta(){
        float prezzoScontato;
        prezzoScontato = prezzoIva() * (1 - 0.02f);
        return prezzoScontato;
    }



    @Override
    public String toString() {
        return "Prodotto [codice=" + codice + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo
                + ", iva=" + iva + "]";
    }



    

}
