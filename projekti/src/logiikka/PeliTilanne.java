package logiikka;

/**
 * Pelitilanne - luokka sisältää pelaajien pisteet ja pelattujen kierrosten
 * lukumäärän
 */
public class PeliTilanne {
    
    /**
     *  Taulukko, joka sisältää kierroksen nimeron
    * ja pelaajien pisteet
     *tilanne[0] = kierroksen numero
     *tilanne[1] = Pelaaja1 pisteet
     *tilanne[2] = Pelaaja2 pisteet
    
     */
    
    private int[] tilanne;
    /**
     * Ilmaisee kumpi pelaajista on ratkaisuvuoross
     */
    private int koodinRatkaisija;
    /**
     * Ilmaisee että kyseessä kaksinpeli
     */
    private boolean kaksinpeli;
    
    public PeliTilanne(){
        tilanne = new int[3];
        koodinRatkaisija=1;
    }
    
    /**
     * Lisää pisteen ratkaisijan vastapelaajalle
     */
    public void lisaaPisteVastustajalle(){
        if(annaKoodinRatkaisija()==1){
            getTilanne()[2]++;
        } else{
            getTilanne()[1]++;
        }
    }
    
    /**
     * Vaihtaa koodin ratkaisija muuttujan arvon
     */
    public void vaihdaRatkaisijaa(){
        if(koodinRatkaisija==1){
            koodinRatkaisija=2;
        }else{
            koodinRatkaisija=1;
        }
    }
    /*
     * Kasvattaa kierroslaskuria
     * Kierros vaihtuu kun kaksi peliä on pelattu
     */
    public void lisaaKierros(){
        
        if (koodinRatkaisija==1){
        tilanne[0]++;    
        }
        
    }
    
    /**
     * Asettaa taulukon tilanne alkiot nolliksi
     */
    public void nollaa(){
        tilanne[0]=0;
        tilanne[1]=0;
        tilanne[2]=0;
        koodinRatkaisija=1;
        setKaksinpeli(true);
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
    
    /**
     * Palauttaa koodin asettajan numeron
     * @return 1 tai 2
     */
    public int annaKoodinAsettaja(){
        if(annaKoodinRatkaisija()==1){
           return 2;
        } else{
            return 1;
        } 
    }

    /**
     * @return the kaksinpeli
     */
    public boolean isKaksinpeli() {
        return kaksinpeli;
    }

    /**
     * @param kaksinpeli the kaksinpeli to set
     */
    public void setKaksinpeli(boolean kaksinpeli) {
        this.kaksinpeli = kaksinpeli;
    }
    
            
}
