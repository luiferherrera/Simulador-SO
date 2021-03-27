
package pruebas_so;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 * Luis Herrera 27.877.087
 */

public class calculadora extends javax.swing.JFrame {
    String num1=""; //primer operando
    String operador =""; //operador
    String num2 =""; //segundo operando
    String pantalla=""; //texto a mostrar por pantalla
    static Boolean abierto = false; //variable para detectar si la ventana esta abierta

    public calculadora() {
        initComponents();  //inicair ventana
        this.setLocationRelativeTo(null);
        btsalir4.setBackground(new Color(0,0,0,0));
        btatras4.setBackground(new Color(0,0,0,0));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        webpanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btatras4 = new javax.swing.JButton();
        btsalir4 = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        bt0 = new javax.swing.JButton();
        btigual = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btsuma = new javax.swing.JButton();
        btresta = new javax.swing.JButton();
        btmultiplicacion = new javax.swing.JButton();
        btdivision1 = new javax.swing.JButton();
        btdivision = new javax.swing.JButton();
        txtpantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        webpanel.setBackground(new java.awt.Color(153, 153, 153));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        btatras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (21).png"))); // NOI18N
        btatras4.setPreferredSize(new java.awt.Dimension(51, 61));
        btatras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatras4ActionPerformed(evt);
            }
        });

        btsalir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pruebas_so/Fotos/image (17).png"))); // NOI18N
        btsalir4.setMaximumSize(new java.awt.Dimension(50, 41));
        btsalir4.setMinimumSize(new java.awt.Dimension(50, 41));
        btsalir4.setPreferredSize(new java.awt.Dimension(56, 41));
        btsalir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btatras4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsalir4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btatras4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bt0.setBackground(new java.awt.Color(153, 204, 255));
        bt0.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt0.setForeground(new java.awt.Color(0, 0, 0));
        bt0.setText("0");
        bt0.setMaximumSize(new java.awt.Dimension(82, 82));
        bt0.setMinimumSize(new java.awt.Dimension(82, 82));
        bt0.setPreferredSize(new java.awt.Dimension(82, 82));
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        btigual.setBackground(new java.awt.Color(204, 255, 255));
        btigual.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btigual.setForeground(new java.awt.Color(0, 0, 0));
        btigual.setText("=");
        btigual.setMaximumSize(new java.awt.Dimension(82, 82));
        btigual.setMinimumSize(new java.awt.Dimension(82, 82));
        btigual.setPreferredSize(new java.awt.Dimension(82, 82));
        btigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btigualActionPerformed(evt);
            }
        });

        bt2.setBackground(new java.awt.Color(153, 204, 255));
        bt2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 0, 0));
        bt2.setText("2");
        bt2.setMaximumSize(new java.awt.Dimension(82, 82));
        bt2.setMinimumSize(new java.awt.Dimension(82, 82));
        bt2.setPreferredSize(new java.awt.Dimension(82, 82));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt1.setBackground(new java.awt.Color(153, 204, 255));
        bt1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 0));
        bt1.setText("1");
        bt1.setMaximumSize(new java.awt.Dimension(82, 82));
        bt1.setMinimumSize(new java.awt.Dimension(82, 82));
        bt1.setPreferredSize(new java.awt.Dimension(82, 82));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt4.setBackground(new java.awt.Color(153, 204, 255));
        bt4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(0, 0, 0));
        bt4.setText("4");
        bt4.setMaximumSize(new java.awt.Dimension(82, 82));
        bt4.setMinimumSize(new java.awt.Dimension(82, 82));
        bt4.setPreferredSize(new java.awt.Dimension(82, 82));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setBackground(new java.awt.Color(153, 204, 255));
        bt5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(0, 0, 0));
        bt5.setText("5");
        bt5.setMaximumSize(new java.awt.Dimension(82, 82));
        bt5.setMinimumSize(new java.awt.Dimension(82, 82));
        bt5.setPreferredSize(new java.awt.Dimension(82, 82));
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt8.setBackground(new java.awt.Color(153, 204, 255));
        bt8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt8.setForeground(new java.awt.Color(0, 0, 0));
        bt8.setText("8");
        bt8.setMaximumSize(new java.awt.Dimension(82, 82));
        bt8.setMinimumSize(new java.awt.Dimension(82, 82));
        bt8.setPreferredSize(new java.awt.Dimension(82, 82));
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt7.setBackground(new java.awt.Color(153, 204, 255));
        bt7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(0, 0, 0));
        bt7.setText("7");
        bt7.setMaximumSize(new java.awt.Dimension(82, 82));
        bt7.setMinimumSize(new java.awt.Dimension(82, 82));
        bt7.setPreferredSize(new java.awt.Dimension(82, 82));
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt9.setBackground(new java.awt.Color(153, 204, 255));
        bt9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt9.setForeground(new java.awt.Color(0, 0, 0));
        bt9.setText("9");
        bt9.setMaximumSize(new java.awt.Dimension(82, 82));
        bt9.setMinimumSize(new java.awt.Dimension(82, 82));
        bt9.setPreferredSize(new java.awt.Dimension(82, 82));
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        bt6.setBackground(new java.awt.Color(153, 204, 255));
        bt6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(0, 0, 0));
        bt6.setText("6");
        bt6.setMaximumSize(new java.awt.Dimension(82, 82));
        bt6.setMinimumSize(new java.awt.Dimension(82, 82));
        bt6.setPreferredSize(new java.awt.Dimension(82, 82));
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt3.setBackground(new java.awt.Color(153, 204, 255));
        bt3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(0, 0, 0));
        bt3.setText("3");
        bt3.setMaximumSize(new java.awt.Dimension(82, 82));
        bt3.setMinimumSize(new java.awt.Dimension(82, 82));
        bt3.setPreferredSize(new java.awt.Dimension(82, 82));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        btlimpiar.setBackground(new java.awt.Color(255, 102, 102));
        btlimpiar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btlimpiar.setText("AC");
        btlimpiar.setMaximumSize(new java.awt.Dimension(82, 82));
        btlimpiar.setMinimumSize(new java.awt.Dimension(82, 82));
        btlimpiar.setPreferredSize(new java.awt.Dimension(82, 82));
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        btsuma.setBackground(new java.awt.Color(153, 204, 255));
        btsuma.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btsuma.setForeground(new java.awt.Color(0, 0, 0));
        btsuma.setText("+");
        btsuma.setMaximumSize(new java.awt.Dimension(82, 82));
        btsuma.setMinimumSize(new java.awt.Dimension(82, 82));
        btsuma.setPreferredSize(new java.awt.Dimension(82, 82));
        btsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsumaActionPerformed(evt);
            }
        });

        btresta.setBackground(new java.awt.Color(153, 204, 255));
        btresta.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btresta.setForeground(new java.awt.Color(0, 0, 0));
        btresta.setText("-");
        btresta.setMaximumSize(new java.awt.Dimension(82, 82));
        btresta.setMinimumSize(new java.awt.Dimension(82, 82));
        btresta.setPreferredSize(new java.awt.Dimension(82, 82));
        btresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrestaActionPerformed(evt);
            }
        });

        btmultiplicacion.setBackground(new java.awt.Color(153, 204, 255));
        btmultiplicacion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btmultiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        btmultiplicacion.setText("x");
        btmultiplicacion.setMaximumSize(new java.awt.Dimension(82, 82));
        btmultiplicacion.setMinimumSize(new java.awt.Dimension(82, 82));
        btmultiplicacion.setPreferredSize(new java.awt.Dimension(82, 82));
        btmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmultiplicacionActionPerformed(evt);
            }
        });

        btdivision1.setBackground(new java.awt.Color(153, 204, 255));
        btdivision1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btdivision1.setForeground(new java.awt.Color(0, 0, 0));
        btdivision1.setText("÷");
        btdivision1.setMaximumSize(new java.awt.Dimension(82, 82));
        btdivision1.setMinimumSize(new java.awt.Dimension(82, 82));
        btdivision1.setPreferredSize(new java.awt.Dimension(82, 82));
        btdivision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdivision1ActionPerformed(evt);
            }
        });

        btdivision.setBackground(new java.awt.Color(153, 204, 255));
        btdivision.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btdivision.setForeground(new java.awt.Color(0, 0, 0));
        btdivision.setText(".");
        btdivision.setMaximumSize(new java.awt.Dimension(82, 82));
        btdivision.setMinimumSize(new java.awt.Dimension(82, 82));
        btdivision.setPreferredSize(new java.awt.Dimension(82, 82));
        btdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdivisionActionPerformed(evt);
            }
        });

        txtpantalla.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtpantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout webpanelLayout = new javax.swing.GroupLayout(webpanel);
        webpanel.setLayout(webpanelLayout);
        webpanelLayout.setHorizontalGroup(
            webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(webpanelLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(webpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(webpanelLayout.createSequentialGroup()
                                .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btdivision, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btigual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btdivision1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btsuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(webpanelLayout.createSequentialGroup()
                                .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, webpanelLayout.createSequentialGroup()
                                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(webpanelLayout.createSequentialGroup()
                                        .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(webpanelLayout.createSequentialGroup()
                                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(webpanelLayout.createSequentialGroup()
                                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtpantalla))
                .addGap(322, 322, 322))
        );
        webpanelLayout.setVerticalGroup(
            webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, webpanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(webpanelLayout.createSequentialGroup()
                        .addComponent(btdivision1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btresta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(webpanelLayout.createSequentialGroup()
                        .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btigual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(webpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btdivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(webpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(webpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btatras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatras4ActionPerformed
        this.setExtendedState(ICONIFIED); //salir sin cerrar
        new principal().setVisible(true);
    }//GEN-LAST:event_btatras4ActionPerformed

    private void btsalir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalir4ActionPerformed
        new principal().setVisible(true); //cerrar y salir
        abierto = false;
        dispose();
    }//GEN-LAST:event_btsalir4ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        if(operador == ""){  //agregar 0
            num1 = num1 + 0;
            pantalla = pantalla + 0;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 0;
            pantalla=pantalla + 0;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt0ActionPerformed

    private void btigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btigualActionPerformed
        double resultado=0; //realizar calculo

        if (operador== "/"){
            resultado = (Double.parseDouble(num1))/(Double.parseDouble(num2));
        }

        if (operador== "*"){
            resultado = (Double.parseDouble(num1))*(Double.parseDouble(num2));
        }

        if (operador== "-"){
            resultado = (Double.parseDouble(num1))-(Double.parseDouble(num2));
        }
        if (operador== "+"){
            resultado = (Double.parseDouble(num1))+(Double.parseDouble(num2));
        }
        
        txtpantalla.setText(new DecimalFormat("##.#########").format(resultado)); //mostrar resultado
        num1=""; operador =""; num2 = ""; pantalla = "";

    }//GEN-LAST:event_btigualActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        if(operador == ""){ //agregar 2
            num1 = num1 + 2;
            pantalla = pantalla + 2;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 2;
            pantalla=pantalla + 2;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        if(operador == ""){ //agregar 1
            num1 = num1 + 1;
            pantalla = pantalla + 1;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 1;
            pantalla=pantalla + 1;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        if(operador == ""){ //agregar 4
            num1 = num1 + 4;
            pantalla = pantalla + 4;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 4;
            pantalla=pantalla + 4;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        if(operador == ""){ //agregar 5
            num1 = num1 + 5    ;
            pantalla = pantalla + 5;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 5;
            pantalla=pantalla + 5;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        if(operador == ""){ //agregar 8
            num1 = num1 + 8;
            pantalla = pantalla + 8;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 8;
            pantalla=pantalla + 8;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        if(operador == ""){ //agregar 7
            num1 = num1 + 7;
            pantalla = pantalla + 7;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 7;
            pantalla=pantalla + 7;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        if(operador == ""){ //agregar 9
            num1 = num1 + 9;
            pantalla = pantalla + 9;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 9;
            pantalla=pantalla + 9;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        if(operador == ""){ //agregar 6
            num1 = num1 + 6;
            pantalla = pantalla + 6;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 6;
            pantalla=pantalla + 6;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        if(operador == ""){ //agregar 3
            num1 = num1 + 3;
            pantalla = pantalla + 3;
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + 3;
            pantalla=pantalla + 3;
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        num1 = ""; //limpiar campos
        operador = "";
        num2 = "";
        pantalla = "";
        txtpantalla.setText(pantalla);
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsumaActionPerformed
        operador = "+";
        pantalla = pantalla + "+";
        txtpantalla.setText(pantalla);
    }//GEN-LAST:event_btsumaActionPerformed

    private void btrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrestaActionPerformed
        if(num1==""){ 
            num1= num1 + "-";
             pantalla = pantalla + "-";
            txtpantalla.setText(pantalla);
        }
        else if(num1!="" && operador ==""){
            operador = "-";
            pantalla = pantalla + "-";
            txtpantalla.setText(pantalla);
        }
        else if(num1!="" && operador!="" && num2=="") {
            num1= num1 + "-";
            pantalla = pantalla + "-";
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_btrestaActionPerformed

    private void btmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmultiplicacionActionPerformed
        operador = "*";
        pantalla = pantalla + "x";
        txtpantalla.setText(pantalla);
    }//GEN-LAST:event_btmultiplicacionActionPerformed

    private void btdivision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdivision1ActionPerformed
        operador = "/";
        pantalla = pantalla + "÷";
        txtpantalla.setText(pantalla);
    }//GEN-LAST:event_btdivision1ActionPerformed

    private void btdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdivisionActionPerformed
        if(operador == ""){ //agregar .
            num1 = num1 + ".";
            pantalla = pantalla + ".";
            txtpantalla.setText(pantalla);
        }
        else{
            num2 = num2 + ".";
            pantalla=pantalla + ".";
            txtpantalla.setText(pantalla);
        }
    }//GEN-LAST:event_btdivisionActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btatras4;
    private javax.swing.JButton btdivision;
    private javax.swing.JButton btdivision1;
    private javax.swing.JButton btigual;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JButton btmultiplicacion;
    private javax.swing.JButton btresta;
    private javax.swing.JButton btsalir4;
    private javax.swing.JButton btsuma;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtpantalla;
    private javax.swing.JPanel webpanel;
    // End of variables declaration//GEN-END:variables
}
