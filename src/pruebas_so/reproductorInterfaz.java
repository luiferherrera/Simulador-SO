
package pruebas_so;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javazoom.jlgui.basicplayer.*;

/**
 * Luis Herrera 27.877.087
 */

public class reproductorInterfaz extends javax.swing.JFrame {
    Reproductor player = new Reproductor(); //crear reproductor
    Timer tmActualizar; //timer para la barra de progreso
    double volumen = 0.5; //nivel de volumen
    
    
    public reproductorInterfaz(String cancion,String nombre,String artista,String foto) {
        initComponents();
        this.setLocationRelativeTo(null);
        jlnombre.setText(nombre); //mostar nombre de la cancion
        jlartista.setText(artista); //mostrar nombre del artista
        btsalir12.setBackground(new Color(0,0,0,0));
        btatras12.setBackground(new Color(0,0,0,0));
        btplayPausa.setBackground(new Color(0,0,0,0));
        btsiguente.setBackground(new Color(0,0,0,0));
        btanterior.setBackground(new Color(0,0,0,0));
        btbajar.setBackground(new Color(0,0,0,0));
        btsubir.setBackground(new Color(0,0,0,0));
        btplayPausa.setText("װ");
        jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource(foto))); //mostrar caratula de la cancion
        try {
            player.AbrirFichero("./src/pruebas_so/musica/"+cancion); //abrir cancion
            player.Play(); //reproducir
            player.volumen(volumen); //establecer volumen
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tmActualizar = new Timer(500,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jsprogreso.setMaximum(player.tamañobytes);
                jsprogreso.setValue(player.progressNow); //actualizar barra de progreso
            }
        });
        tmActualizar.start(); //inicar timer      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btatras12 = new javax.swing.JButton();
        btsalir12 = new javax.swing.JButton();
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jlfoto = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        jlartista = new javax.swing.JLabel();
        jsprogreso = new javax.swing.JSlider();
        btplayPausa = new javax.swing.JButton();
        btsiguente = new javax.swing.JButton();
        btanterior = new javax.swing.JButton();
        btsubir = new javax.swing.JButton();
        btbajar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        btatras12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (21).png"))); // NOI18N
        btatras12.setPreferredSize(new java.awt.Dimension(51, 61));
        btatras12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatras12ActionPerformed(evt);
            }
        });

        btsalir12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (17).png"))); // NOI18N
        btsalir12.setMaximumSize(new java.awt.Dimension(50, 41));
        btsalir12.setMinimumSize(new java.awt.Dimension(50, 41));
        btsalir12.setPreferredSize(new java.awt.Dimension(56, 41));
        btsalir12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalir12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(filler26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btatras12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsalir12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btsalir12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btatras12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(filler26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(filler25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jlfoto.setBackground(new java.awt.Color(255, 255, 255));
        jlfoto.setForeground(new java.awt.Color(255, 255, 255));

        jlnombre.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jlnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlartista.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jlartista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jsprogreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsprogresoStateChanged(evt);
            }
        });
        jsprogreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jsprogresoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jsprogresoMouseReleased(evt);
            }
        });

        btplayPausa.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btplayPausa.setText("װ");
        btplayPausa.setToolTipText("");
        btplayPausa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btplayPausa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btplayPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btplayPausaActionPerformed(evt);
            }
        });

        btsiguente.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btsiguente.setText("»");
        btsiguente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiguenteActionPerformed(evt);
            }
        });

        btanterior.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        btanterior.setText("«");
        btanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanteriorActionPerformed(evt);
            }
        });

        btsubir.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        btsubir.setText("+");
        btsubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsubirActionPerformed(evt);
            }
        });

        btbajar.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        btbajar.setText("-");
        btbajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbajarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlartista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btbajar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btplayPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsiguente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btsubir))
                            .addComponent(jsprogreso, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(jlnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jlfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jlfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlartista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jsprogreso, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btplayPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsiguente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsubir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbajar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalir12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalir12ActionPerformed
        try {  //detener reproductor, salir y cerrar
            player.Stop(); 
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        new principal().setVisible(true);
        new listaMusica().abierto = false;
        dispose();
    }//GEN-LAST:event_btsalir12ActionPerformed

    private void jsprogresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsprogresoStateChanged

    }//GEN-LAST:event_jsprogresoStateChanged

    private void jsprogresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsprogresoMouseExited

    }//GEN-LAST:event_jsprogresoMouseExited

    private void jsprogresoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsprogresoMouseReleased
        tmActualizar.stop();  //adelantar cancion al punto seleccionado
        int pos = jsprogreso.getValue();
        try {
            player.mover(pos);
            tmActualizar.start();
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jsprogresoMouseReleased

    private void btsubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsubirActionPerformed
        volumen = volumen + 0.1; // aumentar volumen
        try {
            player.volumen(volumen);
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btsubirActionPerformed

    private void btbajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbajarActionPerformed
        volumen = volumen - 0.1; //reducir volumen
        try {
            player.volumen(volumen);
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btbajarActionPerformed

    private void btplayPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btplayPausaActionPerformed
        try {  //pausar o reanudar reproduccion
            if (player.estado()==BasicPlayer.PAUSED){
                btplayPausa.setFont(new java.awt.Font("Arial", 1, 48));
                btplayPausa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                btplayPausa.setText("װ");
                player.Continuar();
            }
            else if (player.estado()==BasicPlayer.PLAYING){
                btplayPausa.setFont(new java.awt.Font("Arial", 1, 40));
                btplayPausa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                btplayPausa.setText("►");
                player.Pausa();
            }
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btplayPausaActionPerformed

    private void btsiguenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiguenteActionPerformed
        File archivo = new File("./src/pruebas_so/musica"); //sigiente cancion
        String[] lista = archivo.list();
        File archivof = new File("./src/pruebas_so/Fotos");
        String[] listaf = archivof.list();
        for(int i=0;i<lista.length;i++){
            if(lista[i].equals(listaMusica.cancion)){
                if(i<(lista.length-1)){
                    String nueva= lista[i+1];
                    String nuevafoto=listaf[i+1];
                    listaMusica.cancion = nueva; 
                    listaMusica.foto = nuevafoto;
                    jlnombre.setText(listaMusica.nombres[i+1]);
                    jlartista.setText(listaMusica.artistas[i+1]);
                    jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/"+nuevafoto)));
                    try {
                        player.Stop();
                        player.AbrirFichero("./src/pruebas_so/musica/"+nueva);
                        player.Play();
                        break;
                    } catch (Exception ex) {
                        Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    String nueva= lista[0];
                    String nuevafoto=listaf[0];
                    listaMusica.cancion = nueva;
                    listaMusica.foto = nuevafoto;
                    jlnombre.setText(listaMusica.nombres[0]);
                    jlartista.setText(listaMusica.artistas[0]);
                    jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/"+nuevafoto)));
                    try {
                        player.Stop();
                        player.AbrirFichero("./src/pruebas_so/musica/"+nueva);
                        player.Play();
                    } catch (Exception ex) {
                        Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btsiguenteActionPerformed

    private void btanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanteriorActionPerformed
        File archivo = new File("./src/pruebas_so/musica"); //cancion anterior
        String[] lista = archivo.list();
        File archivof = new File("./src/pruebas_so/Fotos");
        String[] listaf = archivof.list();
        for(int i=0;i<lista.length;i++){  
            if(lista[i].equals(listaMusica.cancion)){
                if(i>0){
                    String nueva= lista[i-1];
                    String nuevafoto=listaf[i-1];
                    listaMusica.cancion = nueva;
                    listaMusica.foto = nuevafoto;
                    jlnombre.setText(listaMusica.nombres[i-1]);
                    jlartista.setText(listaMusica.artistas[i-1]);
                    jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/"+nuevafoto)));
                    try {                      
                        player.Stop();
                        player.AbrirFichero("./src/pruebas_so/musica/"+nueva);
                        player.Play();
                    } catch (Exception ex) {
                        Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{ 
                    String nueva= lista[lista.length-1];
                    String nuevafoto=listaf[lista.length-1];
                    listaMusica.cancion = nueva;
                    listaMusica.foto = nuevafoto;
                    jlnombre.setText(listaMusica.nombres[lista.length-1]);
                    jlartista.setText(listaMusica.artistas[lista.length-1]);
                    jlfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/"+nuevafoto)));
                    try {                      
                        player.Stop();
                        player.AbrirFichero("./src/pruebas_so/musica/"+nueva);
                        player.Play();
                        break;
                    } catch (Exception ex) {
                        Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btanteriorActionPerformed

    private void btatras12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatras12ActionPerformed
        try {  //detener reproductor y salir sin cerrar
            player.Stop();
        } catch (Exception ex) {
            Logger.getLogger(reproductorInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        new listaMusica().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btatras12ActionPerformed

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
            java.util.logging.Logger.getLogger(reproductorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reproductorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reproductorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reproductorInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reproductorInterfaz(listaMusica.cancion, listaMusica.nombre, listaMusica.artista,listaMusica.foto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btanterior;
    private javax.swing.JButton btatras12;
    private javax.swing.JButton btbajar;
    private javax.swing.JButton btplayPausa;
    private javax.swing.JButton btsalir12;
    private javax.swing.JButton btsiguente;
    private javax.swing.JButton btsubir;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JLabel jlartista;
    private javax.swing.JLabel jlfoto;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JSlider jsprogreso;
    // End of variables declaration//GEN-END:variables
}
