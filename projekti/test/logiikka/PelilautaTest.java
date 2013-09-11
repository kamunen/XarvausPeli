/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import java.util.HashSet;
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
         p.lisaaRivi(r);
         
         assertEquals(0, p.getRivajaJaljella());
     }
     
     @Test
     public void onkoRatkaistuPalauttaaTrueKunRatkaisuLoytyy(){
         Rivi r = new Rivi();
         r.setArvaus(koodi);
         r.tarkista(koodi);
         p.lisaaRivi(r);
         assertEquals(true,p.getOnkoRatkaistu());
     }
     @Test
     public void onkoRatkaistuPalauttaaFalseKunRatkaisuaEiLoydy(){
        Rivi r = new Rivi();
        int[] arvaus = new int[koodi.length];
         for (int i = 0; i < koodi.length; i++) {
             arvaus[i]=i;
         }
        r.setArvaus(arvaus);
         r.tarkista(koodi);
         p.lisaaRivi(r);
         assertEquals(false,p.getOnkoRatkaistu());
         
     }
}