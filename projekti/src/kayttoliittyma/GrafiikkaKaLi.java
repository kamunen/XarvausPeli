
package kayttoliittyma;

import java.awt.Component;
import java.util.HashMap;
import logiikka.ArvaaKoodi;
import logiikka.Komento;
import logiikka.Pelilauta;
import logiikka.Rivi;

/**
 *  Pelin graafinen käyttöliittymä
 */
public class GrafiikkaKaLi extends javax.swing.JFrame {
    
   private Pelilauta pelilauta;
    private HashMap pnlRivit;
    /**
     * Luo uuden ilmentymän
     */
    public GrafiikkaKaLi() {
        initComponents();
        teeRiviTaulukko();
    }
    
     private void teeRiviTaulukko(){
         pnlRivit = new HashMap<String, pnlRivi>();
       
        for (Component c : getContentPane().getComponents()) {
                if(c instanceof pnlRivi){
                    pnlRivit.put(c.getName(), c);
                }
           }
    }
     
       public pnlRivi annaPaneliNimella(String nimi) {
        if (pnlRivit.containsKey(nimi)) {
                return (pnlRivi) pnlRivit.get(nimi);
        }
        else return null;
}
  
    
    /**
     * Luetaan käyttäjän valitsema koodi ja tarkistetaan se
     */
    private void arvaaKoodi() {
        
        pnlRivi pnl = annaPaneliNimella("pnlRivi"+pelilauta.getRivajaJaljella());
       
        Komento k = new ArvaaKoodi(pnl.annaArvaus(), pelilauta);
        k.suorita();

        if (pelilauta.getOnkoRatkaistu()) {
            jTextField1.setText("Oikain");
            jButton1.setEnabled(false);

        } else if (!pelilauta.onkoArvauksiaJaljella()) {
            int[] koodi = pelilauta.getKoodi();
            StringBuilder sb = new StringBuilder();

            for (int i : koodi) {
                sb.append(i);
            }
            System.out.println("");
            jTextField1.setText("Arvaukset käytetty. Oikea koodi : " + sb.toString());
            jButton1.setEnabled(false);
        } else {
        }
    }

   

    /**
     *Generoitu koodi
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlRivi1 = new kayttoliittyma.pnlRivi();
        pnlRivi2 = new kayttoliittyma.pnlRivi();
        pnlRivi3 = new kayttoliittyma.pnlRivi();
        pnlRivi4 = new kayttoliittyma.pnlRivi();
        pnlRivi5 = new kayttoliittyma.pnlRivi();
        jComboBox1 = new javax.swing.JComboBox();
        pnlRivi6 = new kayttoliittyma.pnlRivi();
        pnlRivi7 = new kayttoliittyma.pnlRivi();
        pnlRivi8 = new kayttoliittyma.pnlRivi();
        pnlRivi9 = new kayttoliittyma.pnlRivi();
        pnlRivi10 = new kayttoliittyma.pnlRivi();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(660, 700));

        jTextField1.setText("Paina \"Aloita Peli\" - nappia");

        jButton1.setText("Arvaa");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aloita Peli");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Vaihtoehtoja merkille");

        pnlRivi1.setName("pnlRivi1"); // NOI18N

        pnlRivi2.setName("pnlRivi2"); // NOI18N

        pnlRivi3.setName("pnlRivi3"); // NOI18N

        pnlRivi4.setName("pnlRivi4"); // NOI18N

        pnlRivi5.setName("pnlRivi5"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.setSelectedIndex(4);
        jComboBox1.setName(""); // NOI18N

        pnlRivi6.setName("pnlRivi6"); // NOI18N

        pnlRivi7.setName("pnlRivi7"); // NOI18N

        pnlRivi8.setName("pnlRivi8"); // NOI18N

        pnlRivi9.setName("pnlRivi9"); // NOI18N

        pnlRivi10.setName("pnlRivi10"); // NOI18N

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Helppo versio");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Haasteellisempi");

        jLabel1.setText("Kaksinpeli vaihtoehto puuttuu");

        jButton3.setText("Tallenna pelitilanne");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Lataa pelitilanne");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlRivi5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRivi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jRadioButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlRivi2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRivi10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * Koodin arvausnappi 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int arvauksiaJaljella = pelilauta.getRivajaJaljella();
        jTextField1.setText("Arvauksia jäljellä : "+ (arvauksiaJaljella - 1) );
        
        pnlRivi pnl = annaPaneliNimella("pnlRivi"+arvauksiaJaljella);
    
        Komento k = new ArvaaKoodi(pnl.annaArvaus(), pelilauta);
        k.suorita();

        if (pelilauta.getOnkoRatkaistu()) {
            jTextField1.setText("Oikain");
            jButton1.setEnabled(false);
            pnl.aktiivinen(false);
            pnl.asetaTarkistus( pelilauta.annaViimeisinRivi(),true);
         

        } else if (!pelilauta.onkoArvauksiaJaljella()) {
            int[] koodi = pelilauta.getKoodi();
            StringBuilder sb = new StringBuilder();

            for (int i : koodi) {
                sb.append(i);
            }
            System.out.println("");
            jTextField1.setText("Arvaukset käytetty. Oikea koodi : " + sb.toString());
            jButton1.setEnabled(false);
            pnl.aktiivinen(false);
            pnl.asetaTarkistus( pelilauta.annaViimeisinRivi(),true);
            
        }else{
             pnl.aktiivinen(false);
             
             pnl.asetaTarkistus( pelilauta.annaViimeisinRivi(),jRadioButton1.isSelected());
             
            pnl = (pnlRivi) annaPaneliNimella("pnlRivi"+pelilauta.getRivajaJaljella());
            pnl.aktiivinen(true);
        
        }
        
            
           
        
            
        
    
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Pelin aloitusnappi
     * 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int eriValintojenLkm;
        int koodinPituus = 4;
        int arvaustenMaxLkm = 10;
        
        eriValintojenLkm = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        
        pelilauta = new Pelilauta(koodinPituus,eriValintojenLkm,arvaustenMaxLkm);
        
        jTextField1.setText("Valitse koodi");
        jButton1.setEnabled(true);
        
        for (int i = 1; i <= arvaustenMaxLkm; i++) {
            pnlRivi r = (pnlRivi) annaPaneliNimella("pnlRivi"+i);
            r.alustaRivi(eriValintojenLkm);
        }
           pnlRivi r = (pnlRivi) annaPaneliNimella("pnlRivi"+arvaustenMaxLkm);
           r.aktiivinen(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton1.setSelected(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("Toimintoa ei ole toteutettu");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jTextField1.setText("Toimintoa ei ole toteutettu");
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public void kaynnista() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GrafiikkaKaLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrafiikkaKaLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrafiikkaKaLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrafiikkaKaLi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GrafiikkaKaLi().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private kayttoliittyma.pnlRivi pnlRivi1;
    private kayttoliittyma.pnlRivi pnlRivi10;
    private kayttoliittyma.pnlRivi pnlRivi2;
    private kayttoliittyma.pnlRivi pnlRivi3;
    private kayttoliittyma.pnlRivi pnlRivi4;
    private kayttoliittyma.pnlRivi pnlRivi5;
    private kayttoliittyma.pnlRivi pnlRivi6;
    private kayttoliittyma.pnlRivi pnlRivi7;
    private kayttoliittyma.pnlRivi pnlRivi8;
    private kayttoliittyma.pnlRivi pnlRivi9;
    // End of variables declaration//GEN-END:variables
}


