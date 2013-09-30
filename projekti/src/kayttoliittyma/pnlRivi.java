package kayttoliittyma;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import logiikka.Rivi;

/**
 * Käyttöliittymäpaneli rivi - luokkaa varten
 */
public class pnlRivi extends javax.swing.JPanel {

    public pnlRivi() {
        initComponents();

    }

    public void alustaRivi(int lkm) {

        String[] s = new String[lkm];

        //Taulukko alasvetovalikkon sisältöä varten
        for (int i = 0; i < lkm; i++) {
            s[i] = "" + i;
        }

        // Alustetaan alasvetovalikot taulukolla ja
        // mustalla reunuksella
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(s));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(s));
        jComboBox2.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(s));
        jComboBox3.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(s));
        jComboBox4.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));

        jTextField1.setText("");
        this.aktiivinen(false);
    }

    public void aktiivinen(boolean arvo) {

        for (Object o : this.getComponents()) {
            if (o instanceof JComboBox) {
                JComboBox j = (JComboBox) o;
                j.setEnabled(arvo);
            }else if (o instanceof JTextField) {
                JTextField t = (JTextField) o;
                t.setEnabled(arvo);
            }
        }
    }

    /**
     * Asetetaan paneliin tarkistuksen tulos
     * @param r tarkistettu rivi
     * @param osoitaPaikat mäytetäänkö merkkin paikat
     */
    public void asetaTarkistus(Rivi r, boolean osoitaPaikat) {
        jTextField1.setText(r.getOikeinLkm() + " oikealla paikalla ja "
                + r.getMukanaLkm() + " oikeaa merkkiä");

        if (osoitaPaikat) {
            lisaaVarit(r);
        }
    }
    
      private void lisaaVarit(Rivi r) {
        char[] tarkistus = r.getTarkistus();
        java.awt.Color punainen = new Color(255, 0, 0);
        java.awt.Color valkoinen = new Color(255, 255, 255);

        if (tarkistus[0] == Rivi.LOYDETTY) {
            jComboBox1.setBorder(new javax.swing.border.LineBorder(
                    punainen, 3, true));
        } else if (tarkistus[0] == Rivi.MUKANA) {
            jComboBox1.setBorder(new javax.swing.border.LineBorder(
                    valkoinen, 3, true));
        } else{
            jComboBox1.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        }

        if (tarkistus[1] == Rivi.LOYDETTY) {
            jComboBox2.setBorder(new javax.swing.border.LineBorder(
                    punainen, 3, true));
        } else if (tarkistus[1] == Rivi.MUKANA) {
            jComboBox2.setBorder(new javax.swing.border.LineBorder(
                    valkoinen, 3, true));
        } else{
            jComboBox2.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        }

        if (tarkistus[2] == Rivi.LOYDETTY) {
            jComboBox3.setBorder(new javax.swing.border.LineBorder(
                    punainen, 3, true));
        } else if (tarkistus[2] == Rivi.MUKANA) {
            jComboBox3.setBorder(new javax.swing.border.LineBorder(
                    valkoinen, 3, true));
        }else{
            jComboBox3.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        }

        if (tarkistus[3] == Rivi.LOYDETTY) {
            jComboBox4.setBorder(new javax.swing.border.LineBorder(
                    punainen, 3, true));
        } else if (tarkistus[3] == Rivi.MUKANA) {
            jComboBox4.setBorder(new javax.swing.border.LineBorder(
                    valkoinen, 3, true));
        }else{
            jComboBox4.setBorder(new javax.swing.border.LineBorder(
                new Color(0, 0, 0), 1, true));
        }
    }

    /**
     * Luetaan alasvetovalikkojen arvot
     *
     * @return käyttäjän valitsemat merkit taulukossa
     */
    public int[] annaArvaus() {

        int[] arvaus = new int[4];
        
        arvaus[0] = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        arvaus[1] = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        arvaus[2] = Integer.parseInt(jComboBox3.getSelectedItem().toString());
        arvaus[3] = Integer.parseInt(jComboBox4.getSelectedItem().toString());

        return arvaus;
    }
    
    /**
     * Asetetaan paneeliin rivi
     * @param r Rivi
     * @param osoitaPaikat näytetäänkö merkin paikat
     * @param asetaTeksti asetetaanko tekstikentän arvo
     */
    public void asetaRivi(Rivi r, boolean osoitaPaikat, boolean asetaTeksti) {
        int[] arvaus = r.getArvaus();
        jComboBox1.setSelectedIndex(arvaus[0]);
        jComboBox2.setSelectedIndex(arvaus[1]);
        jComboBox3.setSelectedIndex(arvaus[2]);
        jComboBox4.setSelectedIndex(arvaus[3]);

        if (osoitaPaikat) {
            lisaaVarit(r);
        }
        if (asetaTeksti) {
            jTextField1.setText(r.getOikeinLkm() + " oikealla paikalla ja "
                    + r.getMukanaLkm() + " oikeaa merkkiä");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setEnabled(false);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setEnabled(false);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setEnabled(false);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox4.setBorder(null);
        jComboBox4.setEnabled(false);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

  
}
