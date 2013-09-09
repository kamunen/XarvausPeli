
package kayttoliittyma;

import java.util.Random;
import logiikka.*;

public class XarvausPeli {
 
    public static void main(String[] args){

        int[] koodi = {1,2,3};
        System.out.print(" ");
        for (int i : koodi) {
            System.out.print(i);
        }
        System.out.println("");
        
        Pelilauta p = new Pelilauta(koodi,2);
        
        int[] arvaus = new int[koodi.length];
        Random r = new Random();

        for (int i = 0; i < arvaus.length; i++) {
                arvaus[i] = r.nextInt(4);
       }
        
       Komento k = new ArvaaKoodi(arvaus,p);
       k.suorita();
        
        System.out.println(p.getRivit().toString());
    }
        
}
    

