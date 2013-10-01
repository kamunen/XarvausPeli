
/**
 * Pelilauta - luokka sisältää arvattavan koodin ja 
 * Rivi - oliot, joissa arvaus ja tarkistus
 *
 *
 * 
 */

package logiikka;

import java.util.ArrayList;
import java.util.Random;

public class Pelilauta implements java.io.Serializable{
    private int[] arvattavaKoodi;
    private ArrayList<Rivi> rivit;
    private PeliTapahtuma peliTapahtuma;
    private int vaihtoehtojenLkm;
    
/*
 * Luo tyhjän pelilaudan
 */    
    public Pelilauta(){
        rivit = new ArrayList();
        peliTapahtuma = new PeliTapahtuma();
    }
    
    /**
     * Luo pelilaudan ja kutsuu koodin gnerointimetodia
     * @param koodinPituus Kuinka monta merkkiä pitkä koodi on
     * @param vaihtoehtojenLkm Montako erilaista merkkiä koodi sisältää
     * @param riviLkm arvausten lukumäärä
     */
    
    public Pelilauta(int koodinPituus, int vaihtoehtojenLkm, int riviLkm){
        generoiKoodi(koodinPituus,vaihtoehtojenLkm);
        rivit = new ArrayList();
        peliTapahtuma = new PeliTapahtuma();
        peliTapahtuma.setRivejaJaljella(riviLkm);
        this.vaihtoehtojenLkm = vaihtoehtojenLkm;
    }
    
    /**
     * Luo uuden pelilaudan
     * @param koodi arvattava koodi
     * @param riviLkm arvausten lukumäärä
     */
    public Pelilauta(int[] koodi,int riviLkm){
        this.arvattavaKoodi = koodi;
        rivit = new ArrayList<>();
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
        return peliTapahtuma.getOnkoRatkaistu();
    }

    public void setRivejaJaljella(int rivejaJaljella) {
        peliTapahtuma.setRivejaJaljella(rivejaJaljella);
    }

    public int getRivajaJaljella(){
        return peliTapahtuma.getRivajaJaljella();
    }
    
    /**
     * Generoidaan arvattava koodi
     * @param p koodin pituus
     * @param v koodin vaihteluväli (0 <= luku < v)
     */
    private void generoiKoodi(int p, int v){
        int[] koodi = new int[p];
        Random r = new Random();
        
        for (int i = 0; i < koodi.length; i++) {
                koodi[i] = r.nextInt(v);
            }
        setKoodi(koodi);
    }
    
    /**
     * Lisätään yksi arvauskerta (Pelirivi) pelilaudalle
     * @param r pelattu rivi
     */
    public void lisaaRivi(Rivi r){
        rivit.add(r);
        peliTapahtuma.setOnkoRatkaistu(r.onkoArvattu());
        peliTapahtuma.setRivejaJaljella(peliTapahtuma.getRivajaJaljella()-1);
        
    }
    /**
     * Palautetaan tieto siitä onko arvauksia jäljellä
     * @return true jos arvauksia on jäljellä
     */
   public boolean onkoArvauksiaJaljella(){
       return peliTapahtuma.onkoArvauksiaJaljella();
    }
   
   /**
    * Palauttaa viimeisimmän pelatun rivin
    * @return Rivi
    */
   public Rivi annaViimeisinRivi(){
       
       //TODO : Virheenkäsittely, jos lista on tyhjä
       return rivit.get(rivit.size()-1);
   }

    /**
     * @return the vaihtoehtojenLkm
     */
    public int getVaihtoehtojenLkm() {
        return vaihtoehtojenLkm;
    }
 }
