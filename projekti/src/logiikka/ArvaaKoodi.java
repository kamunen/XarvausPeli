//Pelaaja arvaa koodia

package logiikka;

public class ArvaaKoodi extends  Komento{
    
    private int[] arvaus;
    private Pelilauta pelilauta;
    
    public ArvaaKoodi(int[] a,Pelilauta p){
    this.arvaus = a;    
    this.pelilauta = p;
}
    
    @Override
    public void suorita(){
        
    int[] koodi = pelilauta.getKoodi();
        
    Rivi r = new Rivi();
    
    r.setArvaus(arvaus);
    r.tarkista(koodi);
    pelilauta.lisaaRivi(r);
    
    }
    
}
