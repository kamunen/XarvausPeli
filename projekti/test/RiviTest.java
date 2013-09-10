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
        
        // Luodaan uusi rivi ja asetetaan arvaus
        r = new Rivi();
        
         
         
       
        
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void RivinAsettaminenLuoTyhjanTulostaulun(){
         
         int[] arvaus = {1,1,1,1,1,1};
         r.setArvaus(arvaus);
         
        StringBuilder tulos = new StringBuilder();
        tulos.append(r.getTarkistus());
                 
        assertEquals("------", tulos.toString());
    }
    
     @Test
     public void KoodinRatkaisuAntaaTulostaulunOK(){
         
         int[] arvaus = {1,1,1,1,1,1};
         
         r.setArvaus(arvaus);
         r.tarkista(arvaus);
         
        StringBuilder tulos = new StringBuilder();
        tulos.append(r.getTarkistus());
                 
        assertEquals("XXXXXX", tulos.toString());
    }
     @Test
     public void onkoArvattuPalauttaaTrueKunRatkaistu(){
          int[] arvaus = {1,1,1,1,1,1};
         
         r.setArvaus(arvaus);
         r.tarkista(arvaus);
         assertEquals(true,r.onkoArvattu());
     }
     
}
