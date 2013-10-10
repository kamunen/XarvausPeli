package logiikka;

/**
 * Pelitilanne - luokka sisältää pelaajien pisteet ja pelattujen kierrosten
 * lukumäärän
 */
public class PeliTilanne {
    
    // Taulukko, joka sisältää kierroksen nimeron
    // ja pelaajien pisteet
    // tilanne[0] = kierroksen numero
    // tilanne[1] = Pelaaja1 pisteet
    // tilanne[2] = Pelaaja2 pisteet
    
    private int[] tilanne;
    private int koodinRatkaisija;
    
    public PeliTilanne(){
        tilanne = new int[3];
        tilanne[0]=1;
        koodinRatkaisija=1;
        
    }
    
    public void lisaaPisteVastustajalle(){
        if(annaKoodinRatkaisija()==1){
            getTilanne()[2]++;
        } else{
            getTilanne()[1]++;
        }
    }
    public void vaihdaRatkaisijaa(){
        if(koodinRatkaisija==1){
            koodinRatkaisija=2;
        }else{
            koodinRatkaisija=1;
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
    public int annaKoodinRatkaisija() {
        return koodinRatkaisija;
    }
    
    public int annaKoodinAsettaja(){
        if(annaKoodinRatkaisija()==1){
           return 2;
        } else{
            return 1;
        } 
    }
    
            
}
