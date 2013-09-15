
//Pelilauta - luokka sisältää arvattavan koodin ja 
// Rivi - oliot, joissa arvaus ja tarkistus

package logiikka;

import java.util.ArrayList;
import java.util.Random;

public class Pelilauta implements java.io.Serializable{
    private int[] arvattavaKoodi;
    private ArrayList rivit;
    private PeliTapahtuma peliTapahtuma;
    
    
    public Pelilauta(){
        rivit = new ArrayList();
        peliTapahtuma = new PeliTapahtuma();
    }
    
    public Pelilauta(int koodinPituus, int vaihtoehtojenLkm, int riviLkm){
        generoiKoodi(koodinPituus,vaihtoehtojenLkm);
        rivit = new ArrayList();
        peliTapahtuma = new PeliTapahtuma();
        peliTapahtuma.setRivejaJaljella(riviLkm);
        
    }
    
    public Pelilauta(int[] koodi,int riviLkm){
        this.arvattavaKoodi = koodi;
        rivit = new ArrayList();
        peliTapahtuma = new PeliTapahtuma();
        peliTapahtuma.setRivejaJaljella(riviLkm);
       
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
       // return onkoRatkaistu;
        return peliTapahtuma.getOnkoRatkaistu();
    }

    public void setRivejaJaljella(int rivejaJaljella) {
        peliTapahtuma.setRivejaJaljella(rivejaJaljella);
    }

    public int getRivajaJaljella(){
        //return rivejaJaljella;
       return peliTapahtuma.getRivajaJaljella();
    }
    
    private void generoiKoodi(int p, int v){
        int[] koodi = new int[p];
        Random r = new Random();
        
        for (int i = 0; i < koodi.length; i++) {
                koodi[i] = r.nextInt(v);
            }
        setKoodi(koodi);
    }
    
    public void lisaaRivi(Rivi r){
        rivit.add(r);
        peliTapahtuma.setOnkoRatkaistu(r.onkoArvattu());
        peliTapahtuma.setRivejaJaljella(peliTapahtuma.getRivajaJaljella()-1);
        
    }
    
   public boolean onkoArvauksiaJaljella(){
       return peliTapahtuma.onkoArvauksiaJaljella();
    }
   
   public Rivi annaViimeisinRivi(){
       
       return (Rivi)rivit.get(rivit.size()-1);
   }
 }
