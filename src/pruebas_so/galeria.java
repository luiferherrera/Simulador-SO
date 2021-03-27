
package pruebas_so;

import java.awt.Color;

/**
 *Luis Herrera 27.877.087
 */
public class galeria extends javax.swing.JFrame {
    static boolean abierto = false; //Variable para comprobar si la ventana esta abierta
    private boolean ampliada = false; //Variable para detectar si una foto esta abierta 
   
    public galeria() {
        initComponents(); //inicar ventana
        this.setLocationRelativeTo(null);
        btsalir.setBackground(new Color(0,0,0,0));
        btatras.setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        btatras = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btfoto3 = new javax.swing.JButton();
        btfoto1 = new javax.swing.JButton();
        btfoto2 = new javax.swing.JButton();
        btfoto4 = new javax.swing.JButton();
        btfoto5 = new javax.swing.JButton();
        btfoto6 = new javax.swing.JButton();
        btfoto7 = new javax.swing.JButton();
        btfoto8 = new javax.swing.JButton();
        btfoto9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (21).png"))); // NOI18N
        btatras.setPreferredSize(new java.awt.Dimension(51, 61));
        btatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatrasActionPerformed(evt);
            }
        });

        btsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (17).png"))); // NOI18N
        btsalir.setMaximumSize(new java.awt.Dimension(50, 41));
        btsalir.setMinimumSize(new java.awt.Dimension(50, 41));
        btsalir.setPreferredSize(new java.awt.Dimension(56, 41));
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btatras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btatras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btfoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (25).png"))); // NOI18N
        btfoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto3ActionPerformed(evt);
            }
        });

        btfoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (23).png"))); // NOI18N
        btfoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto1ActionPerformed(evt);
            }
        });

        btfoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (24).png"))); // NOI18N
        btfoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto2ActionPerformed(evt);
            }
        });

        btfoto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (26).png"))); // NOI18N
        btfoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto4ActionPerformed(evt);
            }
        });

        btfoto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (29).png"))); // NOI18N
        btfoto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto5ActionPerformed(evt);
            }
        });

        btfoto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (30).png"))); // NOI18N
        btfoto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto6ActionPerformed(evt);
            }
        });

        btfoto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (31).png"))); // NOI18N
        btfoto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto7ActionPerformed(evt);
            }
        });

        btfoto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (32).png"))); // NOI18N
        btfoto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto8ActionPerformed(evt);
            }
        });

        btfoto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (33).png"))); // NOI18N
        btfoto9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfoto9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("GALERIA DE FOTOS");

        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btfoto9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtfoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txtfoto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btfoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btfoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btfoto7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btfoto2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(btfoto5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btfoto8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btfoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btfoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btfoto9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btfoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btfoto6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfoto5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(txtfoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btfoto9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfoto7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfoto8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        new principal().setVisible(true); //salir y cerrar
        abierto = false;
        dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btfoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto1ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (39).png"))); 
        ampliada = true;
        
    }//GEN-LAST:event_btfoto1ActionPerformed

    private void btfoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto3ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (40).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto3ActionPerformed

    private void btfoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto2ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (41).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto2ActionPerformed

    private void btfoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto4ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (42).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto4ActionPerformed

    private void btfoto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto5ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (43).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto5ActionPerformed

    private void btfoto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto6ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (44).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto6ActionPerformed

    private void btfoto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto7ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (45).png")));
        ampliada = true;
    }//GEN-LAST:event_btfoto7ActionPerformed

    private void btfoto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto8ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (46).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto8ActionPerformed

    private void btfoto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfoto9ActionPerformed
        btfoto1.setVisible(false); //amppliar foto
        btfoto2.setVisible(false);
        btfoto3.setVisible(false);
        btfoto4.setVisible(false);
        btfoto5.setVisible(false);
        btfoto6.setVisible(false);
        btfoto7.setVisible(false);
        btfoto8.setVisible(false);
        btfoto9.setVisible(false);
        txtfoto.setVisible(true);
        txtfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (47).png"))); 
        ampliada = true;
    }//GEN-LAST:event_btfoto9ActionPerformed

    private void btatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatrasActionPerformed
        if (ampliada){             //reducir foto o cerrar sin salir
        txtfoto.setVisible(false);
        btfoto1.setVisible(true);
        btfoto2.setVisible(true);
        btfoto3.setVisible(true);
        btfoto4.setVisible(true);
        btfoto5.setVisible(true);
        btfoto6.setVisible(true);
        btfoto7.setVisible(true);
        btfoto8.setVisible(true);
        btfoto9.setVisible(true);
        ampliada=false;
        }
        else{
            this.setExtendedState(ICONIFIED);
            new principal().setVisible(true);
        }
    }//GEN-LAST:event_btatrasActionPerformed

static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(galeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new galeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btatras;
    private javax.swing.JButton btfoto1;
    private javax.swing.JButton btfoto2;
    private javax.swing.JButton btfoto3;
    private javax.swing.JButton btfoto4;
    private javax.swing.JButton btfoto5;
    private javax.swing.JButton btfoto6;
    private javax.swing.JButton btfoto7;
    private javax.swing.JButton btfoto8;
    private javax.swing.JButton btfoto9;
    private javax.swing.JButton btsalir;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtfoto;
    // End of variables declaration//GEN-END:variables
}
