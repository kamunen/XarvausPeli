package logiikka;

/**
 * Pelitilanne - luokka sisältää pelaajien pisteet ja pelattujen kierrosten
 * lukumäärän
 */
public class PeliTilanne {
    
    // Taulukko, joka sisältää kierroksen nimeron
    // ja pelaajien pisteet
    
    private int[] tilanne;
    private int koodinRatkaisija;
    
    public PeliTilanne(){
        tilanne = new int[3];
        tilanne[0]=1;
        koodinRatkaisija=1;
        
    }
    
    public void lisaaPisteVastustajalle(){
        if(getKoodinRatkaisija()==1){
            getTilanne()[2]++;
        } else{
            getTilanne()[1]++;
        }
    }
    
    public void lisaaKierros(){
        getTilanne()[0]++;
    }

    /**
     * @return the tilanne
     */
    public int[] getTilanne() {
        return tilanne;
    }

    /**
     * @return the koodinRatkaisija
     */
    public int getKoodinRatkaisija() {
        return koodinRatkaisija;
    }
    
    
            
}
