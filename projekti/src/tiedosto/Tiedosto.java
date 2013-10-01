package tiedosto;

/**
 * Luokka pelitilanteen tallettamista ja uudelleen lataamista varten
 *
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;
import logiikka.Pelilauta;

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
    
    public boolean onkoPelitilanneTallessa(String nimi)throws Exception{
       return new File(nimi).exists(); 
    }
    
    public boolean poistaTiedosto(String nimi)throws Exception{
        return new File(nimi).delete();
    }
    /**
     * Luetaan konfigurointitiot (Ei kytketty mihinkään toimintoon)
     *
     * @param nimi Tiedoston nimi
     * @return Proprties luokan olio
     * @throws FileNotFoundException
     * @throws IOException
     */
    public Properties annaKonfigurointi(String nimi) throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        InputStream in = new FileInputStream(nimi);
        prop.load(in);
        return prop;
    }
}
