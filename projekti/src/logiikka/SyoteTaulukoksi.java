
package logiikka;

/**
 * Luokka muuntaa saamansa merkkijonon int - taulukoksi
 */
public class SyoteTaulukoksi {
    private String viesti;
    private int[] koodi;
    private int maxNro;
    
    public SyoteTaulukoksi(){
        
    }
    
    /**
     * tarkistetaan syöte ja talletetaan se luokkamuuttujataulukkoon
     * @param s syöte
     * @param koodinPituus vaadittu pituus
     * @return palauttaa true jos OK
     */
    public boolean validoiSyote(String s,int koodinPituus){
                
         try {
                if (s.startsWith("-") || s.startsWith("+")){
                    throw new NumberFormatException();
                } 
                if (s.length()!=koodinPituus){
                    viesti = "Anna täsmälleen "+koodinPituus+" merkkiä";
                    return false;
                }
                
                Integer.parseInt(s);
                
                
            }catch (NumberFormatException ex){
                viesti = "Ei käy! Anna vain numeroita";
                return false;
                
            } catch (Exception e) {
                viesti = "Virhe! : "+e.getMessage();
                return false;
            }

         
            koodi = new int[koodinPituus];

            for (int i = 0; i < s.length(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(i));
                koodi[i] = Integer.parseInt(sb.toString());
                
                if (koodi[i]>maxNro){
                    viesti = "Anna kaikki merkit väliltä [0 - "+maxNro+"]";
                    return false;
                }
            }
            return true;
    } 

    /**
     * @return the viesti
     */
    public String getViesti() {
        return viesti;
    }

    /**
     * @return the koodi
     */
    public int[] getKoodi() {
        return koodi;
    }

    /**
     * @param maxNro the maxNro to set
     */
    public void setMaxNro(int maxNro) {
        this.maxNro = maxNro;
    }
}

       