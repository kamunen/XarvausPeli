
package kayttoliittyma;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import logiikka.Pelilauta;
import tiedosto.Tiedosto;

public class XarvausPeli {
 
    public static void main(String[] args){
        //try {
        
            Scanner l = new Scanner(System.in);
            Pelilauta p = new Pelilauta();
            Tiedosto t = new Tiedosto();
           
            //TODO : Selvitä tiedoston oikea sijainti!
            // Nyt ei löydy
            // Properties konf = t.annaKonfigurointi("app.config.properties");
            
            
            System.out.println("STARTTAA TextUI = t ; muu nappi = GraphUI ?");
            if (l.next().equals("t")){
                TekstiKaLi kl = new TekstiKaLi(l,p);
                kl.kaynnista();
            }
            System.out.println("START GraphUI");
            
            GrafiikkaKaLi g = new GrafiikkaKaLi();
            g.kaynnista();
            
            
      
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(XarvausPeli.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(XarvausPeli.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        
       
    }
        
}
    


