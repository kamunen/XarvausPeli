
package kayttoliittyma;

import java.awt.Component;
import java.util.HashMap;
import logiikka.ArvaaKoodi;
import logiikka.Komento;
import logiikka.Pelilauta;
import logiikka.Rivi;

/**
 * Pelin graafinen käyttöliittymä
 */
public class GrafiikkaKaLi extends javax.swing.JFrame {

    private Pelilauta pelilauta;
    private HashMap<String, pnlRivi> pnlRivit;

    /**
     * Luo uuden ilmentymän
     */
    public GrafiikkaKaLi() {
        initComponents();
        teeRiviTaulukko();
    }

    private void teeRiviTaulukko() {
        pnlRivit = new HashMap<>();

        for (Component c : getContentPane().getComponents()) {
            if (c instanceof pnlRivi) {
                pnlRivit.put(c.getName(), (pnlRivi) c);
            }
        }
    }

    public pnlRivi annaPaneliNimella(String nimi) {
        if (pnlRivit.containsKey(nimi)) {
            return pnlRivit.get(nimi);
        } else {
            return null;
        }
    }

    /**
     * Generoitu koodi
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlRivi1 = new kayttoliittyma.pnlRivi();
        pnlRivi2 = new kayttoliittyma.pnlRivi();
        pnlRivi3 = new kayttoliittyma.pnlRivi();
        pnlRivi4 = new kayttoliittyma.pnlRivi();
        pnlRivi5 = new kayttoliittyma.pnlRivi();
        pnlRivi6 = new kayttoliittyma.pnlRivi();
        pnlRivi7 = new kayttoliittyma.pnlRivi();
        pnlRivi8 = new kayttoliittyma.pnlRivi();
        pnlRivi9 = new kayttoliittyma.pnlRivi();
        pnlRivi10 = new kayttoliittyma.pnlRivi();
        jPanel1 = new javax.swing.JPanel();
        bArvaa = new javax.swing.JButton();
        bLataaPelitilanne = new javax.swing.JButton();
        bTallennaPelitilanne = new javax.swing.JButton();
        txtInfo = new javax.swing.JTextField();
        rbHelppoVersio = new javax.swing.JRadioButton();
        rbHaasteellisempi = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbxVaihtoehtoja = new javax.swing.JComboBox();
        bAloita = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arvaa piilossa oleva koodi (MasterMind - peli)");

        pnlRivi1.setName("pnlRivi1"); // NOI18N

        pnlRivi2.setName("pnlRivi2"); // NOI18N

        pnlRivi3.setName("pnlRivi3"); // NOI18N

        pnlRivi4.setName("pnlRivi4"); // NOI18N

        pnlRivi5.setName("pnlRivi5"); // NOI18N

        pnlRivi6.setName("pnlRivi6"); // NOI18N

        pnlRivi7.setName("pnlRivi7"); // NOI18N

        pnlRivi8.setName("pnlRivi8"); // NOI18N

        pnlRivi9.setName("pnlRivi9"); // NOI18N

        pnlRivi10.setName("pnlRivi10"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Toiminnot"));

        bArvaa.setText("Arvaa");
        bArvaa.setEnabled(false);
        bArvaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArvaaActionPerformed(evt);
            }
        });

        bLataaPelitilanne.setText("Lataa pelitilanne");
        bLataaPelitilanne.setEnabled(false);
        bLataaPelitilanne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLataaPelitilanneActionPerformed(evt);
            }
        });

        bTallennaPelitilanne.setText("Tallenna pelitilanne");
        bTallennaPelitilanne.setEnabled(false);
        bTallennaPelitilanne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTallennaPelitilanneActionPerformed(evt);
            }
        });

        txtInfo.setEditable(false);
        txtInfo.setText("Paina \"Aloita Peli\" - nappia");

        buttonGroup2.add(rbHelppoVersio);
        rbHelppoVersio.setSelected(true);
        rbHelppoVersio.setText("Helppo versio");
        rbHelppoVersio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHelppoVersioActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbHaasteellisempi);
        rbHaasteellisempi.setText("Haasteellisempi");

        jLabel3.setText("Vaihtoehtoja merkille");

        cbxVaihtoehtoja.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxVaihtoehtoja.setSelectedIndex(4);
        cbxVaihtoehtoja.setName(""); // NOI18N

        bAloita.setText("Aloita Peli");
        bAloita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAloitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bArvaa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bTallennaPelitilanne)
                            .addComponent(bLataaPelitilanne, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cbxVaihtoehtoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAloita)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbHaasteellisempi)
                            .addComponent(rbHelppoVersio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbHelppoVersio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHaasteellisempi)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxVaihtoehtoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bLataaPelitilanne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bTallennaPelitilanne)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(bArvaa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bAloita)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pelitilanne"));

        jCheckBox1.setText("Kaksinpeli");
        jCheckBox1.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRivi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRivi5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(pnlRivi1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(pnlRivi10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * Koodin arvausnappi
     * Luetaan käyttäjän valitsema koodi ja tarkistetaan se
     */

    private void bArvaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArvaaActionPerformed

        int arvauksiaJaljella = pelilauta.getRivajaJaljella();
        txtInfo.setText("Arvauksia jäljellä : " + (arvauksiaJaljella - 1));

        pnlRivi pnl = annaPaneliNimella("pnlRivi" + arvauksiaJaljella);

        Komento k = new ArvaaKoodi(pnl.annaArvaus(), pelilauta);
        k.suorita();

        if (pelilauta.getOnkoRatkaistu()) {
            koodiLoytyi(pnl);


        } else if (!pelilauta.onkoArvauksiaJaljella()) {
            arvauksetKaytetty(pnl);

        } else {
            jatkaPelia(pnl);
        }

    }//GEN-LAST:event_bArvaaActionPerformed

    private void koodiLoytyi(pnlRivi pnl) {
        txtInfo.setText("Oikein !");
        bArvaa.setEnabled(false);
        pnl.aktiivinen(false);
        pnl.asetaTarkistus(pelilauta.annaViimeisinRivi(), true);
    }

    private void arvauksetKaytetty(pnlRivi pnl) {
        int[] koodi = pelilauta.getKoodi();
        StringBuilder sb = new StringBuilder();

        for (int i : koodi) {
            sb.append(i);
        }
        System.out.println("");
        txtInfo.setText("Arvaukset käytetty. Oikea koodi : " + sb.toString());
        bArvaa.setEnabled(false);
        pnl.aktiivinen(false);
        pnl.asetaTarkistus(pelilauta.annaViimeisinRivi(), true);
    }

    private void jatkaPelia(pnlRivi pnl) {
        Rivi r = pelilauta.annaViimeisinRivi();

        pnl.asetaTarkistus(r, rbHelppoVersio.isSelected());
        pnl.aktiivinen(false);
        
        pnl = annaPaneliNimella("pnlRivi" + pelilauta.getRivajaJaljella());
        pnl.asetaRivi(r, false, false);
        pnl.aktiivinen(true);
    }

    /**
     * Pelin aloitusnappi
     *
     */
    private void bAloitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAloitaActionPerformed
        int eriValintojenLkm;
        int koodinPituus = 4;
        int arvaustenMaxLkm = 10;

        eriValintojenLkm = Integer.parseInt(cbxVaihtoehtoja.getSelectedItem().toString());

        pelilauta = new Pelilauta(koodinPituus, eriValintojenLkm, arvaustenMaxLkm);

        txtInfo.setText("Valitse koodi");
        bArvaa.setEnabled(true);

        for (int i = 1; i <= arvaustenMaxLkm; i++) {
            pnlRivi r = annaPaneliNimella("pnlRivi" + i);
            r.alustaRivi(eriValintojenLkm);
        }
        pnlRivi r = annaPaneliNimella("pnlRivi" + arvaustenMaxLkm);
        r.aktiivinen(true);

    }//GEN-LAST:event_bAloitaActionPerformed

    private void rbHelppoVersioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHelppoVersioActionPerformed
        rbHelppoVersio.setSelected(true);
    }//GEN-LAST:event_rbHelppoVersioActionPerformed

    private void bTallennaPelitilanneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTallennaPelitilanneActionPerformed
        txtInfo.setText("Toimintoa ei ole toteutettu");
    }//GEN-LAST:event_bTallennaPelitilanneActionPerformed

    private void bLataaPelitilanneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLataaPelitilanneActionPerformed
        txtInfo.setText("Toimintoa ei ole toteutettu");
    }//GEN-LAST:event_bLataaPelitilanneActionPerformed

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
    private javax.swing.JButton bAloita;
    private javax.swing.JButton bArvaa;
    private javax.swing.JButton bLataaPelitilanne;
    private javax.swing.JButton bTallennaPelitilanne;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbxVaihtoehtoja;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JRadioButton rbHaasteellisempi;
    private javax.swing.JRadioButton rbHelppoVersio;
    private javax.swing.JTextField txtInfo;
    // End of variables declaration//GEN-END:variables
}
