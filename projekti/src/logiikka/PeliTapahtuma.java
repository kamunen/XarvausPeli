package logiikka;

public class PeliTapahtuma implements java.io.Serializable{
    
    private int rivejaJaljella;
    private boolean onkoRatkaistu;
    
    public PeliTapahtuma(){
        
    }
    
     public void setOnkoRatkaistu(boolean onkoRatkaistu) {
        this.onkoRatkaistu = onkoRatkaistu;
    }
      public boolean getOnkoRatkaistu(){
        return onkoRatkaistu;
    }
      
      public boolean onkoArvauksiaJaljella(){
        if(!onkoRatkaistu && rivejaJaljella > 0){return true;}
        return false;
    }

    public void setRivejaJaljella(int rivejaJaljella) {
        this.rivejaJaljella = rivejaJaljella;
    }

    public int getRivajaJaljella(){
        return rivejaJaljella;
    }
}
