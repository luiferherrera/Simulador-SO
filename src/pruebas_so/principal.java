package pruebas_so;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

/**
 * Luis Herrera 27.877.087
 */

public class principal extends javax.swing.JFrame {
    static boolean abierto = false; //Variable para detectar si la ventana esta abierta
    DateTimeFormatter formatoH = DateTimeFormatter.ofPattern("hh:mm");
    DateTimeFormatter formatoM = DateTimeFormatter.ofPattern("a");     //formatos para el reloj
    DateTimeFormatter formatoD = DateTimeFormatter.ofPattern("EEE,d 'de' MMM");
   
    Timer reloj; //timer para el reloj
    
    
    
    public principal() {
        initComponents(); //inicicar ventana
        this.setLocationRelativeTo(null);
        btcalendario.setBackground(new Color(0,0,0,0));
        btgaleria.setBackground(new Color(0,0,0,0));
        btcalculadora.setBackground(new Color(0,0,0,0));
        btnavegador.setBackground(new Color(0,0,0,0));   //quitar fondo a los botones
        btarchivo.setBackground(new Color(0,0,0,0));
        btnotas.setBackground(new Color(0,0,0,0));
        btsalir.setBackground(new Color(0,0,0,0));
        btatras.setBackground(new Color(0,0,0,0));
        this.reloj = new Timer(100,new ActionListener() {  //timer
            public void actionPerformed(ActionEvent e) {
                jlhora.setText(formatoH.format(LocalDateTime.now())); 
                jlfecha.setText(formatoD.format(LocalDateTime.now()));
                jlm.setText(formatoM.format(LocalDateTime.now()));
            }
        });
        reloj.start(); //inicair reloj

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jlhora = new javax.swing.JLabel();
        jlm = new javax.swing.JLabel();
        jlfecha = new javax.swing.JLabel();
        btgaleria = new javax.swing.JButton();
        btcalendario = new javax.swing.JButton();
        btnotas = new javax.swing.JButton();
        btcalculadora = new javax.swing.JButton();
        btarchivo = new javax.swing.JButton();
        btnavegador = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btatras = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlhora.setBackground(new java.awt.Color(255, 255, 255));
        jlhora.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jlhora.setForeground(new java.awt.Color(255, 255, 255));
        jlhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlhora.setText("00:00");
        jlhora.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jlm.setBackground(new java.awt.Color(255, 255, 255));
        jlm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlm.setForeground(new java.awt.Color(255, 255, 255));
        jlm.setText("P.M");

        jlfecha.setBackground(new java.awt.Color(255, 255, 255));
        jlfecha.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlfecha.setText("martes, 0 de Ene");

        btgaleria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (6).png"))); // NOI18N
        btgaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgaleriaActionPerformed(evt);
            }
        });

        btcalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (15).png"))); // NOI18N
        btcalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalendarioActionPerformed(evt);
            }
        });

        btnotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (12).png"))); // NOI18N
        btnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotasActionPerformed(evt);
            }
        });

        btcalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (7).png"))); // NOI18N
        btcalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalculadoraActionPerformed(evt);
            }
        });

        btarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (56).png"))); // NOI18N
        btarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btarchivoActionPerformed(evt);
            }
        });

        btnavegador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (9).png"))); // NOI18N
        btnavegador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnavegadorActionPerformed(evt);
            }
        });

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

        jDesktopPane2.setLayer(jlhora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jlm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jlfecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btgaleria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btcalendario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnotas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btcalculadora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btarchivo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnavegador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(btcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btgaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnavegador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnotas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btcalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jlhora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlm)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlm)
                    .addComponent(jlhora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlfecha)
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btcalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btgaleria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(btcalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnotas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(btnavegador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotasActionPerformed
        new notas().setVisible(true); //abrir notas al pulsar el boton
        new notas().abierto = true;
        dispose();
    }//GEN-LAST:event_btnotasActionPerformed

    private void btcalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalendarioActionPerformed
        new calendario().setVisible(true); //abrir el calendario al pulsar el boton
        new calendario().abierto=true;
        dispose();
    }//GEN-LAST:event_btcalendarioActionPerformed

    private void btnavegadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnavegadorActionPerformed
        new navegador().setVisible(true); //abrir el navegador al pulsar el boton
        new navegador().abierto=true;
        dispose();
    }//GEN-LAST:event_btnavegadorActionPerformed

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        new principal().setVisible(true); 
        dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btgaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgaleriaActionPerformed
        new galeria().setVisible(true); //abrir la galeria al pulsar el boton
        new galeria().abierto= true;
        dispose();
    }//GEN-LAST:event_btgaleriaActionPerformed

    private void btcalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalculadoraActionPerformed
        new calculadora().setVisible(true); //abrir la calculadora al pulsar el boton
        new calculadora().abierto=true;
        dispose();
    }//GEN-LAST:event_btcalculadoraActionPerformed

    private void btarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btarchivoActionPerformed
        new listaMusica().setVisible(true); //abrir la lista de musica al pulsar el boton
        new listaMusica().abierto = true;
        dispose();
    }//GEN-LAST:event_btarchivoActionPerformed

    private void btatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatrasActionPerformed
        this.setExtendedState(ICONIFIED); //minimizar al pulsar
        new principal().setVisible(true);
    }//GEN-LAST:event_btatrasActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btarchivo;
    private javax.swing.JButton btatras;
    private javax.swing.JButton btcalculadora;
    private javax.swing.JButton btcalendario;
    private javax.swing.JButton btgaleria;
    private javax.swing.JButton btnavegador;
    private javax.swing.JButton btnotas;
    private javax.swing.JButton btsalir;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel jlhora;
    private javax.swing.JLabel jlm;
    // End of variables declaration//GEN-END:variables
}
