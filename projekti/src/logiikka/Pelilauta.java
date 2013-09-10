
//Pelilauta - luokka sisältää arvattavan koodin ja 
// Rivi - oliot, joissa arvaus ja tarkistus

package logiikka;

import java.util.ArrayList;

public class Pelilauta implements java.io.Serializable{
    private int[] arvattavaKoodi;
    private ArrayList rivit;
    private int rivejaJaljella;
    private boolean onkoRatkaistu;
    
    
    
    public Pelilauta(int[] koodi,int lkm){
        this.arvattavaKoodi = koodi;
        rivit = new ArrayList();
        rivejaJaljella = lkm;
        onkoRatkaistu=false;
    }

    public void setKoodi(int[] koodi) {
        this.arvattavaKoodi = koodi;
    }
    
    public int[] getKoodi() {
        return arvattavaKoodi;
    }
    
    public ArrayList getRivit() {
        return rivit;
    }
    
    public boolean getRatkaistu(){
        return onkoRatkaistu;
    }
    
    public void generoiKoodi(){
        //TODO : Koodin arvonta
    }
    
    public void lisaaRivi(Rivi r){
        rivit.add(r);
        onkoRatkaistu = r.onkoArvattu();
        rivejaJaljella--;
    }
    
   public boolean onkoArvauksiaJaljella(){
        if(!onkoRatkaistu && rivejaJaljella > 0){return true;}
        return false;
    }
 }
