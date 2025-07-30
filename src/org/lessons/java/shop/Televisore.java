package org.lessons.java.shop;

public class Televisore extends Prodotto {


        private int pollici;
        private boolean isSmart;




        public Televisore(String nome, String marca, float prezzo, int iva, int pollici, boolean isSmart) {
            super(nome, marca, prezzo, iva);
            this.pollici = pollici;
            this.isSmart = isSmart;
        }




        public int getPollici() {
            return pollici;
        }




        public void setPollici(int pollici) {
            this.pollici = pollici;
        }




        public boolean isSmart() {
            return isSmart;
        }




        public void setSmart(boolean isSmart) {
            this.isSmart = isSmart;
        }




        @Override
        public String toString() {
            return super.toString() + "Televisore [pollici=" + pollici + ", isSmart=" + isSmart + "]";
        }


        
        

        
}
