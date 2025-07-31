package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        
        Prodotto[] prodotti = new Prodotto[2];

        
        Scanner kb = new Scanner(System.in);
        
        for(int i = 0; i < prodotti.length; i++){

        System.out.println("Che prodotto vuoi aggiungere a carrello? Smartphone, Televisore, Cuffie");
        String nome = kb.nextLine();
        
        System.out.println("Di quale marca?");
        String marca = kb.nextLine();

        System.out.println("Prezzo?");
        float prezzo = kb.nextFloat();
        kb.nextLine();

    



            
            switch (nome.toLowerCase()) {
                case "smartphone":
                    System.out.println("Quanta memoria?");
                    int memoria = kb.nextInt();
                    kb.nextLine();
                    Smartphone smartphone = new Smartphone(nome, marca, prezzo, memoria);
                
                prodotti[i] = smartphone;
                
                break;

                case "televisore":
                   System.out.println("Quanti pollici?");
                   int pollici = kb.nextInt();
                    kb.nextLine();

                   System.out.println("Deve essere smart tv? Rispondi true o false");
                    Boolean isSmart = kb.nextBoolean();
                    kb.nextLine();
                    Televisore televisore = new Televisore(nome, marca, prezzo, pollici, isSmart);
                
                prodotti[i] = televisore;
                
                break;

                 case "cuffie":
                   System.out.println("Di che colore?");
                   String colore = kb.nextLine();
                   System.out.println("Devono essere wireless? Rispondi true o false");
                    Boolean isWireless = kb.nextBoolean();
                    kb.nextLine();
                    Cuffie cuffie = new Cuffie(nome, marca, prezzo, colore, isWireless);
                
                prodotti[i] = cuffie;
                       break;
                
                default:
                System.out.println("Prodotto non disponibile");
                break;
            }
            
            
            
            
        }

        System.out.println("Hai una carta fedelta'? true o false");
        Boolean response = kb.nextBoolean();
        kb.nextLine();

        System.out.println("Il tuo carrello");
        System.out.println("--------------------------------------------");
       

        float totCarrello = 0.0f;

        for(Prodotto prodotto : prodotti){
            if(response){

                float prezzoScontato = prodotto.prezzoCartaFedelta();
                totCarrello += prezzoScontato;
                System.out.println(prodotto);
            } else{
                float prezzoConIva = prodotto.prezzoIva();
                totCarrello += prezzoConIva;
                System.out.println(prodotto);
            }
        }
        
        System.out.println("totale carrello: " + totCarrello);



    }
    
}
