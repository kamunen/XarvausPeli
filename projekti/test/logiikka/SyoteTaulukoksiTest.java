package logiikka;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KaM
 */
public class SyoteTaulukoksiTest {
    
    SyoteTaulukoksi st;
    
    public SyoteTaulukoksiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        st = new SyoteTaulukoksi();
        st.setMaxNro(4);
    }
    
    @After
    public void tearDown() {
    }
     @Test
     public void liianPitkaSyotePalauttaaFalse() {
         
          String s ="1234";
          assertEquals(false, st.validoiSyote(s,4));
    }
     @Test
     public void liianLyhytSyotePalauttaaFalse(){
          
          String s ="1234";
          assertEquals(false, st.validoiSyote(s,4));
     }
     @Test
     public void okPituinenSyotePalauttaaTrue(){
         String s ="1234";
         assertEquals(true, st.validoiSyote(s,4));
     }
     @Test
     public void kirjainSyotePaluttaaFalse(){
         String s="sgdf";
         assertEquals(false, st.validoiSyote(s,4));
     }
     @Test
     public void liianSuuriMerkkiPalauttaaFalse(){
         String s="9999";
         assertEquals(false, st.validoiSyote(s,4));
     }
     @Test
     public void miinusMerkkiPalauttaaFalse(){
         String s="-423";
         assertEquals(false, st.validoiSyote(s,4));
     }
}