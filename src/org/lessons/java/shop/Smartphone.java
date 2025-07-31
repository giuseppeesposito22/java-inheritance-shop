package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto {

      private int imei;
      private int memoria;



      public Smartphone(String nome, String marca, float prezzo, int memoria) {

        Random randomNun = new Random();

        super(nome, marca, prezzo);
        this.imei = randomNun.nextInt(999999999);
        this.memoria = memoria;
      }



      public int getImei() {
          return imei;
      }



      public void setImei(int imei) {
          this.imei = imei;
      }



      public int getMemoria() {
          return memoria;
      }



      public void setMemoria(int memoria) {
          this.memoria = memoria;
      }



      @Override
      public String toString() {
        return super.toString() + "Smartphone [imei=" + imei + ", memoria=" + memoria + "]";
      }





    
      


   

}
