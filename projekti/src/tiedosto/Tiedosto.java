package tiedosto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import logiikka.Pelilauta;

/**
 * Luokka pelitilanteen tallettamista ja uudelleen lataamista varten
 *
 */
public class Tiedosto {

    public Tiedosto() {
    }

    /**
     * Metodi tallettaa pelitilanteen levyle
     *
     * @param nimi Tiedoston mini
     * @param p Talletettava pelilauta - olio
     * @throws Exception
     */
    public void talletaPeli(String nimi, Pelilauta p) throws Exception {
        try (FileOutputStream out = new FileOutputStream(nimi);
                ObjectOutputStream obs = new ObjectOutputStream(out)) {
            obs.writeObject(p);
        }

    }

    /**
     * Metodi lukee tallettun pelitilanteen levyltä
     *
     * @param nimi Tiedoston nimi
     * @return Pelilauta - olio
     * @throws Exception
     */
    public Pelilauta lataaPeli(String nimi) throws Exception {
        Object o;
        try (FileInputStream in = new FileInputStream(nimi);
                ObjectInputStream obs = new ObjectInputStream(in)) {
            o = obs.readObject();
        }

        if (o instanceof Pelilauta) {
            return (Pelilauta) o;

        }
        return null;

    }
/**
 * Testataan löytyykö tiedosto levyltä
 * @param nimi tiedoston nimi
 * @return true jos löytyy
 * @throws Exception 
 */
    public boolean onkoPelitilanneTallessa(String nimi) throws Exception {
        return new File(nimi).exists();
    }

    /**
     * Deletoi tiedoston levyltä
     * @param nimi tiedoston nimi
     * @return true jos onnistuu
     * @throws Exception 
     */
    public boolean poistaTiedosto(String nimi) throws Exception {
        return new File(nimi).delete();
    }
}
