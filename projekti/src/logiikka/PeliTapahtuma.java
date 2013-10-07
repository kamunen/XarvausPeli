package logiikka;

/**
 * Luokka pelitilanteen tallettamista varten
 */

public class PeliTapahtuma implements java.io.Serializable {

    private int rivejaJaljella;
    private boolean onkoRatkaistu;

    public PeliTapahtuma() {
    }

    public void setOnkoRatkaistu(boolean onkoRatkaistu) {
        this.onkoRatkaistu = onkoRatkaistu;
    }

    public boolean getOnkoRatkaistu() {
        return onkoRatkaistu;
    }

    /**
     * Palautetaan tieto, onko koodi ratkaistu
     * @return true, jos rivejä jäljellä eikä arvaus ollut oikein
     */
    public boolean onkoArvauksiaJaljella() {
        if (!onkoRatkaistu && rivejaJaljella > 0) {
            return true;
        }
        return false;
    }

    public void setRivejaJaljella(int rivejaJaljella) {
        this.rivejaJaljella = rivejaJaljella;
    }

    public int getRivajaJaljella() {
        return rivejaJaljella;
    }
}
