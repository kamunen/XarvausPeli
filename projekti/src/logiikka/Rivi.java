package logiikka;


/**
 * Rivi - luokka käsittelee yhden arvauksen ja tarkistaa sen
 */
public class Rivi implements java.io.Serializable {

    private int[] arvaus;
    private char[] tulos;
    private int oikeinLkm;
    private int mukanaLkm;
    
    public static final char LOYDETTY = 'X';
    public static final char MUKANA = 'Z';
    public static final char TYHJA = '-';

    public Rivi() {
    }

    public int[] getArvaus() {
        return arvaus;
    }

    public void setArvaus(int[] arvaus) {
        this.arvaus = arvaus;
        this.tulos = new char[arvaus.length];

        for (int i = 0; i < arvaus.length; i++) {
            tulos[i] = TYHJA;
        }
        oikeinLkm = 0;
        mukanaLkm = 0;
    }

    public char[] getTarkistus() {
        return tulos;
    }

    public void setTarkistus(char[] tarkistus) {
        this.tulos = tarkistus;
    }

    public int getOikeinLkm() {
        return oikeinLkm;
    }

    public int getMukanaLkm() {
        return mukanaLkm;
    }

    /**
     * Tarkistetaan onko kaikki merkit arvattu
     * @return true, jos arvaus oikein
     */
    public boolean onkoArvattu() {
        if (getOikeinLkm() == arvaus.length) {
            return true;
        }
        return false;
    }

    /**
     * Tarkistetaan onko arvaus oikein
     * Talletetaan tarkistuksen tulos sekä oikeinLkm ja mukanaLkm muuttujat
     * @param koodi arvattava koodi
     */
    public void tarkista(int[] koodi) {

        //Nollataan luokkamuuttujat varmuuden vuoksi
        // jos käy niin, että rivi tarkistetaan kahteen kertaan
        
        oikeinLkm=0;
        mukanaLkm=0;
        
        //Lasketaan koodissa olevien lukujen kappalemäärä

        int[] lkm = new int[10];
        for (int i = 0; i < koodi.length; i++) {
            lkm[koodi[i]]++;
        }

        //Tarkistetaan oikealla paikalla olevat
        for (int i = 0; i < koodi.length; i++) {
            if (koodi[i] == arvaus[i]) {
                tulos[i] = LOYDETTY;
                lkm[koodi[i]]--;
                oikeinLkm++;
            } 

        }
        //Etsitään ne, jotka eivät ole oikealla paikalla

        //Jos oli jo oikea merkki niin siirrytään seuraavaan
        for (int i = 0; i < koodi.length; i++) {
            if (tulos[i] == LOYDETTY) {
                continue;
            }
            // Loopataan arvaus alusta lähtien ja  katsotaan onko jokin
            // arvatuista merkeistä tässä kohtaa.
            // Jos on niin siirrytään seuraavaan merkkiin
            // Kukin merkki lasketaan vain kertaalleen
            for (int j = 0; j < arvaus.length; j++) {
                if (koodi[j] == arvaus[i] && lkm[koodi[j]] > 0) {
                    tulos[i] = MUKANA;
                    lkm[koodi[j]]--;
                    mukanaLkm++;
                    break;
                }
            }
        }
    }

    /**
     * Palautetaan arvaus ja tulos 
     * @return string 
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i : arvaus) {
            sb.append(i);
        }
        sb.append("\t");

        for (char c : tulos) {
            sb.append(c);
        }

        return sb.toString();

    }
}
