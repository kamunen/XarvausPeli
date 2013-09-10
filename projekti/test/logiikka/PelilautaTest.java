/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kmujunen
 */
public class PelilautaTest {
    
     Pelilauta p;
     int[] koodi = {1,2};
      
    public PelilautaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        p = new Pelilauta(koodi,2);
    }
    
    @After
    public void tearDown() {
    }
     @Test
     public void rivejaJaljellaPalauttaaNollaKunArvauksetKaytetty(){
         Rivi r =new Rivi();
         r.setArvaus(koodi);
         p.lisaaRivi(r);
         
         assertEquals(0, p.getRivajaJaljella());
         
     }
}