//-Dsun.java2d.opengl=True
//https://docs.oracle.com/javase/8/docs/technotes/guides/2d/flags.html
package app;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import model.Juego;
import model.Pregunta;
import model.Respuesta;

public class App extends javax.swing.JFrame {

    private final Color colorFondo;
    private final Color colorLetras;
    private final Color colorFondoPreguntas;
    private final Color colorCorrecta;
    private final int segundosPause;
    private boolean yaJugo;
    private Pregunta preguntaActual;
    private String letraRespuestaCorrecta; // la utilizo cuando creo una pregunta
    private final String TITULO_APP = "Millionaire";
    private final String VERSION_APP = "0.1a";
    
    private Juego juego;
    private int indexPregunta;
    
    public App() {
        initComponents();

        segundosPause = 2;

        colorFondo = Color.decode("#000434");
        colorLetras = Color.decode("#FFB900");
        colorFondoPreguntas = Color.decode("#3B2F83");
        colorCorrecta = Color.decode("#00B500");

        initColores();
        this.setLocationRelativeTo(null);
        yaJugo = false;
//        jMenuBar1.setVisible(false);

        this.setTitle(TITULO_APP+" - "+VERSION_APP);
        formCrearPregunta.setTitle(TITULO_APP+" - "+VERSION_APP);
        
        juego = new Juego();
        indexPregunta = 0;

//         Test Pregunta
//        preguntaActual = new Pregunta("¿Cómo se llama la teleserie más famosa de Canal 13 en 2018?");
//
//        preguntaActual.addRespuesta(new Respuesta("a", "Lola", false));
//        preguntaActual.addRespuesta(new Respuesta("b", "Pacto de Sangre", true));
//        preguntaActual.addRespuesta(new Respuesta("c", "Machos", false));
//        preguntaActual.addRespuesta(new Respuesta("d", "31 Minutos", false));
//
//        setPreguntaInGUI(preguntaActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formCrearPregunta = new javax.swing.JFrame();
        panelFondoCrearPreguntas = new javax.swing.JPanel();
        txtPregunta = new javax.swing.JTextField();
        lblCCrearPreg = new javax.swing.JLabel();
        lblACrearPreg = new javax.swing.JLabel();
        txtRespACrearPreg = new javax.swing.JTextField();
        txtRespCCrearPreg = new javax.swing.JTextField();
        lblBCrearPreg = new javax.swing.JLabel();
        lblDCrearPreg = new javax.swing.JLabel();
        txtRespBCrearPreg = new javax.swing.JTextField();
        txtRespDCrearPreg = new javax.swing.JTextField();
        btnRegistrarPregunta = new javax.swing.JButton();
        panelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRespA = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblRespC = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblRespB = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblRespD = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        txtPregunta.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtPregunta.setForeground(new java.awt.Color(255, 255, 255));
        txtPregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCCrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblCCrearPreg.setText("C:");
        lblCCrearPreg.setOpaque(true);
        lblCCrearPreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCCrearPregMouseReleased(evt);
            }
        });

        lblACrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblACrearPreg.setText("A:");
        lblACrearPreg.setOpaque(true);
        lblACrearPreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblACrearPregMouseReleased(evt);
            }
        });

        txtRespACrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtRespACrearPreg.setForeground(new java.awt.Color(255, 255, 255));

        txtRespCCrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtRespCCrearPreg.setForeground(new java.awt.Color(255, 255, 255));

        lblBCrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblBCrearPreg.setText("B:");
        lblBCrearPreg.setOpaque(true);
        lblBCrearPreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblBCrearPregMouseReleased(evt);
            }
        });

        lblDCrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblDCrearPreg.setText("D:");
        lblDCrearPreg.setOpaque(true);
        lblDCrearPreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblDCrearPregMouseReleased(evt);
            }
        });

        txtRespBCrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtRespBCrearPreg.setForeground(new java.awt.Color(255, 255, 255));

        txtRespDCrearPreg.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtRespDCrearPreg.setForeground(new java.awt.Color(255, 255, 255));

        btnRegistrarPregunta.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        btnRegistrarPregunta.setText("Registrar");
        btnRegistrarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPreguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoCrearPreguntasLayout = new javax.swing.GroupLayout(panelFondoCrearPreguntas);
        panelFondoCrearPreguntas.setLayout(panelFondoCrearPreguntasLayout);
        panelFondoCrearPreguntasLayout.setHorizontalGroup(
            panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoCrearPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(txtPregunta)
                    .addGroup(panelFondoCrearPreguntasLayout.createSequentialGroup()
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCCrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblACrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRespACrearPreg)
                            .addComponent(txtRespCCrearPreg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDCrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBCrearPreg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRespBCrearPreg)
                            .addComponent(txtRespDCrearPreg))))
                .addContainerGap())
        );
        panelFondoCrearPreguntasLayout.setVerticalGroup(
            panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoCrearPreguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoCrearPreguntasLayout.createSequentialGroup()
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRespACrearPreg)
                            .addComponent(lblACrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCCrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRespCCrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                    .addGroup(panelFondoCrearPreguntasLayout.createSequentialGroup()
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRespBCrearPreg)
                            .addComponent(lblBCrearPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoCrearPreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDCrearPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRespDCrearPreg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout formCrearPreguntaLayout = new javax.swing.GroupLayout(formCrearPregunta.getContentPane());
        formCrearPregunta.getContentPane().setLayout(formCrearPreguntaLayout);
        formCrearPreguntaLayout.setHorizontalGroup(
            formCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoCrearPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formCrearPreguntaLayout.setVerticalGroup(
            formCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoCrearPreguntas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        lblRespA.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespA.setForeground(new java.awt.Color(255, 255, 255));
        lblRespA.setText("[resp1]");
        lblRespA.setOpaque(true);
        lblRespA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespAMouseReleased(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblA.setText("A:");
        lblA.setOpaque(true);

        lblRespC.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespC.setForeground(new java.awt.Color(255, 255, 255));
        lblRespC.setText("[resp3]");
        lblRespC.setOpaque(true);
        lblRespC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespCMouseReleased(evt);
            }
        });

        lblC.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblC.setText("C:");
        lblC.setOpaque(true);

        lblRespB.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespB.setForeground(new java.awt.Color(255, 255, 255));
        lblRespB.setText("[resp2]");
        lblRespB.setOpaque(true);
        lblRespB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespBMouseReleased(evt);
            }
        });

        lblB.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblB.setText("B:");
        lblB.setOpaque(true);

        lblRespD.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespD.setForeground(new java.awt.Color(255, 255, 255));
        lblRespD.setText("[resp4]");
        lblRespD.setOpaque(true);
        lblRespD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespDMouseReleased(evt);
            }
        });

        lblD.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblD.setText("D:");
        lblD.setOpaque(true);

        lblPregunta.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("[pregunta]");
        lblPregunta.setOpaque(true);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespA, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblD)
                            .addComponent(lblB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRespB, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(lblRespD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Jugar!");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Crear Pregunta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRespAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespAMouseReleased
        responder("a", lblRespA);
    }//GEN-LAST:event_lblRespAMouseReleased

    private void lblRespCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespCMouseReleased
        responder("c", lblRespC);
    }//GEN-LAST:event_lblRespCMouseReleased

    private void lblRespDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespDMouseReleased
        responder("d", lblRespD);
    }//GEN-LAST:event_lblRespDMouseReleased

    private void lblRespBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespBMouseReleased
        responder("b", lblRespB);
    }//GEN-LAST:event_lblRespBMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        formCrearPregunta.setBounds(0, 0, 800, 600);
        formCrearPregunta.setLocationRelativeTo(null);
        formCrearPregunta.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void lblACrearPregMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblACrearPregMouseReleased
        procesarRespuestaCorrecta("a");
    }//GEN-LAST:event_lblACrearPregMouseReleased

    private void lblBCrearPregMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBCrearPregMouseReleased
        procesarRespuestaCorrecta("b");
    }//GEN-LAST:event_lblBCrearPregMouseReleased

    private void lblCCrearPregMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCCrearPregMouseReleased
        procesarRespuestaCorrecta("c");
    }//GEN-LAST:event_lblCCrearPregMouseReleased

    private void lblDCrearPregMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDCrearPregMouseReleased
        procesarRespuestaCorrecta("d");
    }//GEN-LAST:event_lblDCrearPregMouseReleased

    private void btnRegistrarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPreguntaActionPerformed
        Pregunta p = new Pregunta(txtPregunta.getText().trim());
        
        p.addRespuesta(new Respuesta("a", txtRespACrearPreg.getText(), letraRespuestaCorrecta.equals("a")));
        p.addRespuesta(new Respuesta("b", txtRespBCrearPreg.getText(), letraRespuestaCorrecta.equals("b")));
        p.addRespuesta(new Respuesta("c", txtRespCCrearPreg.getText(), letraRespuestaCorrecta.equals("c")));
        p.addRespuesta(new Respuesta("d", txtRespDCrearPreg.getText(), letraRespuestaCorrecta.equals("d")));
        
        juego.addPregunta(p);
        
        /*Limpieza de formulario*/
        txtPregunta.setText(null);
        txtRespACrearPreg.setText(null);
        txtRespBCrearPreg.setText(null);
        txtRespCCrearPreg.setText(null);
        txtRespDCrearPreg.setText(null);
        
        txtRespACrearPreg.setBackground(colorFondoPreguntas);
        txtRespBCrearPreg.setBackground(colorFondoPreguntas);
        txtRespCCrearPreg.setBackground(colorFondoPreguntas);
        txtRespDCrearPreg.setBackground(colorFondoPreguntas);
        
        txtPregunta.requestFocus();
        /*Limpieza de formulario*/
    }//GEN-LAST:event_btnRegistrarPreguntaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarPregunta;
    private javax.swing.JFrame formCrearPregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblACrearPreg;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblBCrearPreg;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCCrearPreg;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDCrearPreg;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespA;
    private javax.swing.JLabel lblRespB;
    private javax.swing.JLabel lblRespC;
    private javax.swing.JLabel lblRespD;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondoCrearPreguntas;
    private javax.swing.JTextField txtPregunta;
    private javax.swing.JTextField txtRespACrearPreg;
    private javax.swing.JTextField txtRespBCrearPreg;
    private javax.swing.JTextField txtRespCCrearPreg;
    private javax.swing.JTextField txtRespDCrearPreg;
    // End of variables declaration//GEN-END:variables

    private void initColores() {
        panelFondo.setBackground(colorFondo);

        lblA.setBackground(colorFondoPreguntas);
        lblB.setBackground(colorFondoPreguntas);
        lblC.setBackground(colorFondoPreguntas);
        lblD.setBackground(colorFondoPreguntas);

        lblA.setForeground(colorLetras);
        lblB.setForeground(colorLetras);
        lblC.setForeground(colorLetras);
        lblD.setForeground(colorLetras);

        lblRespA.setBackground(colorFondoPreguntas);
        lblRespB.setBackground(colorFondoPreguntas);
        lblRespC.setBackground(colorFondoPreguntas);
        lblRespD.setBackground(colorFondoPreguntas);

        lblPregunta.setBackground(colorFondoPreguntas);

        /*Formulario preguntas*/
        panelFondoCrearPreguntas.setBackground(colorFondo);
        txtPregunta.setBackground(colorFondoPreguntas);

        lblACrearPreg.setBackground(colorFondoPreguntas);
        lblBCrearPreg.setBackground(colorFondoPreguntas);
        lblCCrearPreg.setBackground(colorFondoPreguntas);
        lblDCrearPreg.setBackground(colorFondoPreguntas);

        lblACrearPreg.setForeground(colorLetras);
        lblBCrearPreg.setForeground(colorLetras);
        lblCCrearPreg.setForeground(colorLetras);
        lblDCrearPreg.setForeground(colorLetras);

        txtRespACrearPreg.setBackground(colorFondoPreguntas);
        txtRespBCrearPreg.setBackground(colorFondoPreguntas);
        txtRespCCrearPreg.setBackground(colorFondoPreguntas);
        txtRespDCrearPreg.setBackground(colorFondoPreguntas);

        btnRegistrarPregunta.setBackground(colorCorrecta);
        btnRegistrarPregunta.setForeground(Color.white);

        txtRespACrearPreg.setCaretColor(Color.white);
        txtRespBCrearPreg.setCaretColor(Color.white);
        txtRespCCrearPreg.setCaretColor(Color.white);
        txtRespDCrearPreg.setCaretColor(Color.white);

        txtPregunta.setCaretColor(Color.white);
        /*Formulario preguntas*/
    }

    private void responder(String letra, JLabel lblResp) {
        if (!yaJugo) {
            lblResp.setBackground(colorLetras);
            yaJugo = true;

            new Thread(() -> {
                // Pause por n segundos mientras se sabe la respuesta correcta
                for (int i = 0; i < segundosPause; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                // Pause por n segundos mientras se sabe la respuesta correcta
                
                Respuesta correcta = preguntaActual.getRespuestaCorrecta();
                boolean isRespCor = preguntaActual.isRespuestaCorrecta(letra);
                JLabel lblRespCorrecta;
                Color color;
                
                if (isRespCor) {
                    lblRespCorrecta = lblResp;
                    color = colorLetras;
                } else {
                    color = colorFondo;
                    switch (correcta.getLetra()) {
                        case "a":
                            lblRespCorrecta = lblRespA;
                            break;
                        case "b":
                            lblRespCorrecta = lblRespB;
                            break;
                        case "c":
                            lblRespCorrecta = lblRespC;
                            break;
                        default:
                            lblRespCorrecta = lblRespD;
                    }
                }
                
                // Hilo de animación
                new Thread(() -> {
                    for (int i = 0; i < 3; i++) {
                        try {
                            if (i % 2 == 0) {
                                lblRespCorrecta.setBackground(colorCorrecta);
                            } else {
                                lblRespCorrecta.setBackground(color);
                            }
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }).start();
            }).start();
        }
    }

    private void setPreguntaInGUI(Pregunta p) {
        lblPregunta.setText("<html><center>" + p.getValor() + "</center></html>");

        lblRespA.setText(p.getRespuesta("a").getValor());
        lblRespB.setText(p.getRespuesta("b").getValor());
        lblRespC.setText(p.getRespuesta("c").getValor());
        lblRespD.setText(p.getRespuesta("d").getValor());
    }

    private void procesarRespuestaCorrecta(String letra) {
        letraRespuestaCorrecta = letra;
        switch (letra) {
            case "a":
                txtRespACrearPreg.setBackground(colorCorrecta);
                txtRespBCrearPreg.setBackground(colorFondoPreguntas);
                txtRespCCrearPreg.setBackground(colorFondoPreguntas);
                txtRespDCrearPreg.setBackground(colorFondoPreguntas);
                break;
            case "b":
                txtRespACrearPreg.setBackground(colorFondoPreguntas);
                txtRespBCrearPreg.setBackground(colorCorrecta);
                txtRespCCrearPreg.setBackground(colorFondoPreguntas);
                txtRespDCrearPreg.setBackground(colorFondoPreguntas);
                break;
            case "c":
                txtRespACrearPreg.setBackground(colorFondoPreguntas);
                txtRespBCrearPreg.setBackground(colorFondoPreguntas);
                txtRespCCrearPreg.setBackground(colorCorrecta);
                txtRespDCrearPreg.setBackground(colorFondoPreguntas);
                break;
            default:
                txtRespACrearPreg.setBackground(colorFondoPreguntas);
                txtRespBCrearPreg.setBackground(colorFondoPreguntas);
                txtRespCCrearPreg.setBackground(colorFondoPreguntas);
                txtRespDCrearPreg.setBackground(colorCorrecta);
        }
    }
}
