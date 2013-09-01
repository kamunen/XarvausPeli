package kayttoliittyma;

import java.util.Scanner;
import logiikka.Pelilauta;

public class XarvausPeli {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pelilauta p = new Pelilauta();
        String testi ="1\n0\ntest\n2test";
        
        Scanner lukija = new Scanner(testi);
        
        p.lueJaTulosta(lukija);
        
        System.out.println(p.toString());
           }
}
    

