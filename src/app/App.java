//-Dsun.java2d.opengl=True
package app;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import model.Pregunta;
import model.Respuesta;

public class App extends javax.swing.JFrame {

    private Color colorFondo;
    private Color colorLetras;
    private Color colorFondoPreguntas;
    private Color colorCorrecta;
    private int segundosPause;
    private boolean yaJugo;
    private Pregunta p;

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

        // Test Pregunta
        p = new Pregunta("¿Cómo se llama la teleserie más famosa de Canal 13 en 2018?");

        p.addRespuesta(new Respuesta("a", "Lola", false));
        p.addRespuesta(new Respuesta("b", "Pacto de Sangre", true));
        p.addRespuesta(new Respuesta("c", "Machos", false));
        p.addRespuesta(new Respuesta("d", "31 Minutos", false));

        setPreguntaInGUI(p);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images/logo.png"))); // NOI18N

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
                .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
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
        responder("a",lblRespA);
    }//GEN-LAST:event_lblRespAMouseReleased

    private void lblRespCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespCMouseReleased
        responder("c",lblRespC);
    }//GEN-LAST:event_lblRespCMouseReleased

    private void lblRespDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespDMouseReleased
        responder("d",lblRespD);
    }//GEN-LAST:event_lblRespDMouseReleased

    private void lblRespBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRespBMouseReleased
        responder("b",lblRespB);
    }//GEN-LAST:event_lblRespBMouseReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespA;
    private javax.swing.JLabel lblRespB;
    private javax.swing.JLabel lblRespC;
    private javax.swing.JLabel lblRespD;
    private javax.swing.JPanel panelFondo;
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
    }

    private void responder(String letra, JLabel lblResp) {
        if (!yaJugo) {
            lblResp.setBackground(colorLetras);
            yaJugo = true;

            new Thread(new Runnable() {
                @Override
                public void run() {
                    // Pause por n segundos mientras se sabe la respuesta correcta
                    for (int i = 0; i < segundosPause; i++) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    // Pause por n segundos mientras se sabe la respuesta correcta
                    
                    Respuesta correcta = p.getRespuestaCorrecta();
                    boolean isRespCor = p.isRespuestaCorrecta(letra);
                    JLabel lblRespCorrecta;
                    Color color;
                    
                    if(isRespCor){
                        lblRespCorrecta = lblResp;
                        color = colorLetras;
                    }else{
                        color = colorFondo;
                        switch(correcta.getLetra()){
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
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 3; i++) {
                                try {
                                    if(i % 2 == 0){
                                        lblRespCorrecta.setBackground(colorCorrecta);
                                    }else{
                                        lblRespCorrecta.setBackground(color);
                                    }
                                    Thread.sleep(100);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }).start();
                }
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
}
