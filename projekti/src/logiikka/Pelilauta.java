
//Pelilauta - luokka sisältää arvattavan koodin ja 
// Rivi - oliot, joissa arvaus ja tarkistus

package logiikka;

import java.util.ArrayList;
import java.util.Random;

public class Pelilauta implements java.io.Serializable{
    private int[] arvattavaKoodi;
    private ArrayList rivit;
    private int rivejaJaljella;
    private boolean onkoRatkaistu;
    
    
    public Pelilauta(){
        rivit = new ArrayList();
    }
    
    public Pelilauta(int koodinPituus, int vaihtoehtojenLkm, int riviLkm){
        generoiKoodi(koodinPituus,vaihtoehtojenLkm);
        rivit = new ArrayList();
        rivejaJaljella = riviLkm;
        
    }
    
    public Pelilauta(int[] koodi,int riviLkm){
        this.arvattavaKoodi = koodi;
        rivit = new ArrayList();
        rivejaJaljella = riviLkm;
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
    
    public boolean getOnkoRatkaistu(){
        return onkoRatkaistu;
    }

    public void setRivejaJaljella(int rivejaJaljella) {
        this.rivejaJaljella = rivejaJaljella;
    }

    public int getRivajaJaljella(){
        return rivejaJaljella;
    }
    
    public void generoiKoodi(int p, int v){
        int[] koodi = new int[p];
        Random r = new Random();
        
        for (int i = 0; i < koodi.length; i++) {
                koodi[i] = r.nextInt(v);
            }
        setKoodi(koodi);
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
   
   public Rivi annaViimeisinRivi(){
       
       return (Rivi)rivit.get(rivit.size()-1);
   }
 }
