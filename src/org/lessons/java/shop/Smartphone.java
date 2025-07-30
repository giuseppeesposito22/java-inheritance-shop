package org.lessons.java.shop;

public class Smartphone extends Prodotto {

      private String imei;
      private int memoria;



      public Smartphone(String nome, String descrizione, float prezzo, int iva, String imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
      }



      public String getImei() {
          return imei;
      }



      public void setImei(String imei) {
          this.imei = imei;
      }



      public int getMemoria() {
          return memoria;
      }



      public void setMemoria(int memoria) {
          this.memoria = memoria;
      }

      


   

}
