
package kayttoliittyma;

import java.util.Scanner;
import logiikka.Pelilauta;

public class XarvausPeli {
 
    public static void main(String[] args){

        Scanner l = new Scanner(System.in);
        Pelilauta p = new Pelilauta();
        
        TekstiKaLi kl = new TekstiKaLi(l,p);
        kl.kaynnista();
        
       
    }
        
}
    

