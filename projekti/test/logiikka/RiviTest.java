package logiikka;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import logiikka.Rivi;
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
public class RiviTest {
    
    Rivi r;
    int[] koodi = {0,1,2,3,4,5};
    
    public RiviTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        // Luodaan uusi rivi 
        r = new Rivi();
    }
    
    @After
    public void tearDown() {
    }
   
     @Test
     public void RivinAsettaminenLuoTyhjanTulostaulun(){
         
         r.setArvaus(koodi);
         
        StringBuilder tulos = new StringBuilder();
        tulos.append(r.getTarkistus());
                 
        assertEquals("------", tulos.toString());
    }
    
     @Test
     public void KoodinRatkaisuAntaaTulostaulunOK(){
         
         r.setArvaus(koodi);
         r.tarkista(koodi);
         
        StringBuilder tulos = new StringBuilder();
        tulos.append(r.getTarkistus());
                 
        assertEquals("XXXXXX", tulos.toString());
    }
     
     @Test
     public void KoodinRatkaisuAntaaTulostaulunKunReunatVaarin(){
         int[] arvaus = {1,1,2,3,4,1};
         
         r.setArvaus(arvaus);
         r.tarkista(koodi);
         
        StringBuilder tulos = new StringBuilder();
        tulos.append(r.getTarkistus());
                 
        assertEquals("-XXXX-", tulos.toString());
     }
     @Test
     public void onkoArvattuPalauttaaTrueKunRatkaistu(){
         
         r.setArvaus(koodi);
         r.tarkista(koodi);
         assertEquals(true,r.onkoArvattu());
     }
     @Test
     public void tarkistaToimiiKunMerkitVaarillaPaikoilla(){
         int[] arvaus = {5,4,3,2,1,0};
         
         r.setArvaus(arvaus);
         r.tarkista(koodi);
         
        StringBuilder tulos = new StringBuilder();
        tulos.append(r.getTarkistus());
                 
        assertEquals("ZZZZZZ", tulos.toString()); 
     }
     
     
     
}
