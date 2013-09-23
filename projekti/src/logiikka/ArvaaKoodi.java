/**
 * Luokka toteuttaa koodinarvaus käyttötapauksen 
 */
package logiikka;

public class ArvaaKoodi extends Komento {

    /**
     * Käyttäjän syöttämä arvaus
     */
    private int[] arvaus;
    /**
     * Viite pelilautaan
     */
    private Pelilauta pelilauta;

    /**
     * Alustetaan privatemuuttujat      
     * @param a Taulukko kättäjän arvauksesta
     * @param p pelilauta
     */
    public ArvaaKoodi(int[] a, Pelilauta p) {
        this.arvaus = a;
        this.pelilauta = p;
    }

    /**
     * Tehdään koodin tarkistus.
     * Pyydetään pelilaudalta arvattavaa koodia.
     * Kutsutaan Rivi - luokan tarkista metodia, joka tarkistaa arvauksen.
     * Lisätään rivi pelilaudalle
     */
    @Override
    public void suorita() {
        int[] koodi = pelilauta.getKoodi();

        Rivi r = new Rivi();
        r.setArvaus(arvaus);
        r.tarkista(koodi);
        pelilauta.lisaaRivi(r);
    }
}
