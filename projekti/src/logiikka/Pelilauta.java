
//Pelilauta - luokka sisältää arvattavan koodin ja 
// Rivi - oliot, joissa arvaus ja tarkistus

package logiikka;

import java.util.ArrayList;

public class Pelilauta implements java.io.Serializable{
    private int[] arvattavaKoodi;
    private ArrayList rivit;
    private int rivienLukumaara;
    private boolean loppu;
    
    
    
    public Pelilauta(int[] koodi,int lkm){
        this.arvattavaKoodi = koodi;
        rivit = new ArrayList();
        rivienLukumaara = lkm;
        loppu=false;
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
    
    public void generoiKoodi(){
        //TODO : Koodin arvonta
    }
    
    public void lisaaRivi(Rivi r){
        rivit.add(r);
        loppu = r.onkoArvattu();
    }
    
    //TODO : Tarkista onko rivien lukumäärä täynnä
    public boolean onkoArvauksiaJaljella(){
        if(!loppu){return true;}
        return false;
    }
 }
