package logiikka;

import java.util.Scanner;

public class Pelilauta {
    
    public Pelilauta(){
        
    }
    
    public void lueJaTulosta(Scanner l){
        
        while(l.hasNext()){
        System.out.println(l.next());     
        }
       
    }
}
