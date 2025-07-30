package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    
    private String colore;
    private boolean isWireless;

    
    public Cuffie(String nome, String marca, float prezzo, int iva, String colore, boolean isWireless) {
        super(nome, marca, prezzo, iva);
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





}
