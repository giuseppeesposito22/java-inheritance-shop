package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    
    private String colore;
    private boolean isWireless;

    
    public Cuffie(String nome, String marca, float prezzo, String colore, boolean isWireless) {
        super(nome, marca, prezzo);
        this.colore = colore;
        this.isWireless = isWireless;
    }


    public String getColore() {
        return colore;
    }


    public void setColore(String colore) {
        this.colore = colore;
    }


    public boolean isWireless() {
        return isWireless;
    }


    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public float prezzoCartaFedelta(){
    float sconto = this.isWireless == false ? 0.07f : 0.02f;
    float prezzoScontato;
    prezzoScontato = prezzoIva() * (1 - sconto);
    return prezzoScontato;
    }


    @Override
    public String toString() {
        return super.toString() + "Cuffie [colore=" + colore + ", isWireless=" + isWireless + "]";
    }





}
