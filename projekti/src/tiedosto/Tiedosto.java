package tiedosto;

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

    public Tiedosto(){
        
    }
    
    public void talletaPeli(String nimi,Pelilauta p) throws Exception{
        FileOutputStream out = new FileOutputStream(nimi);
        ObjectOutputStream obs = new ObjectOutputStream(out);
        obs.writeObject(p);
    }
    
    public Pelilauta lataaPeli(String nimi) throws Exception{
        FileInputStream in = new FileInputStream(nimi);
        ObjectInputStream obs = new ObjectInputStream(in);
        Object o = obs.readObject();
        
        if (o instanceof Pelilauta){
            return (Pelilauta)o;
        }
        return null;
        
    }
    
    public Properties annaKonfigurointi(String nimi) throws FileNotFoundException, IOException{
        Properties prop = new Properties();
        InputStream in = new FileInputStream(nimi);
        prop.load(in);
        return prop;
    }
    
}
