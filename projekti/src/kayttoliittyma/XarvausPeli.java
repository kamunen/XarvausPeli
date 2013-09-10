
package kayttoliittyma;

import java.util.Random;
import logiikka.*;

public class XarvausPeli {
 
    public static void main(String[] args){

        int[] koodi = {1,2};
        System.out.println(" -- Koodi -- ");
        for (int i : koodi) {
            System.out.print(i);
        }
        System.out.println("");
        System.out.println(" -- Ratkaisuyritykset -- ");
        
        Pelilauta p = new Pelilauta(koodi,10);
        
        while(p.onkoArvauksiaJaljella()){
            int[] arvaus = new int[koodi.length];
            Random r = new Random();

            for (int i = 0; i < arvaus.length; i++) {
                arvaus[i] = r.nextInt(3);
            }
        
            Komento k = new ArvaaKoodi(arvaus,p);
            k.suorita();
            if(p.getRatkaistu()){
                System.out.println("Koodi ratkaistu!");
                break;
            }
        }
        
        System.out.println(p.getRivit().toString());
       
    }
        
}
    

