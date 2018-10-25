//-Dsun.java2d.opengl=True
//https://docs.oracle.com/javase/8/docs/technotes/guides/2d/flags.html
//https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
//https://www.mkyong.com/java/how-to-enable-pretty-print-json-output-jackson/
//https://stackoverflow.com/questions/43309323/how-to-run-jar-file-java-lang-noclassdeffounderror/43309812
package app;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Juego;
import model.Pregunta;
import model.Reproductor;
import model.Respuesta;
import model.Rules;

public class App extends javax.swing.JFrame {

    private boolean yaJugo;
    private Pregunta preguntaActual;
    private String letraRespuestaCorrecta; // la utilizo cuando creo una pregunta

    private Juego juego;
    private int indexPregunta;
    private Reproductor hiloMusicaPrincipal;

    public App() {
        initComponents();

        initColores();
        this.setLocationRelativeTo(null);
        yaJugo = false;
//        jMenuBar1.setVisible(false);

        this.setTitle(Rules.NOMBRE_APP + " - " + Rules.VERSION_APP);
        formCrearPregunta.setTitle(Rules.NOMBRE_APP + " - " + Rules.VERSION_APP);

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
        if (new File("juego.json").exists()) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                juego = mapper.readValue(new File("juego.json"), Juego.class);
                juego.setContCorrectas(0);
                juego.setContIncorrectas(0);
            } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        panelJuego.setVisible(false);

//        hiloMusicaPrincipal = new Reproductor();
//        hiloMusicaPrincipal.setCancion(Rules.MP3_MAIN);
//        hiloMusicaPrincipal.setInfinito(true);
//        hiloMusicaPrincipal.start();
        reproducir(Rules.MP3_MAIN, true);

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
        panelJuego = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblRespC = new javax.swing.JLabel();
        lblRespA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        lblRespD = new javax.swing.JLabel();
        lblRespB = new javax.swing.JLabel();
        lblCorrectas = new javax.swing.JLabel();
        lblIncorrectas = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        lblPregunta.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("[pregunta]");
        lblPregunta.setOpaque(true);

        lblA.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblA.setText("A:");
        lblA.setOpaque(true);

        lblC.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblC.setText("C:");
        lblC.setOpaque(true);

        lblRespC.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespC.setForeground(new java.awt.Color(255, 255, 255));
        lblRespC.setText("[resp3]");
        lblRespC.setOpaque(true);
        lblRespC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespCMouseReleased(evt);
            }
        });

        lblRespA.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespA.setForeground(new java.awt.Color(255, 255, 255));
        lblRespA.setText("[resp1]");
        lblRespA.setOpaque(true);
        lblRespA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespAMouseReleased(evt);
            }
        });

        lblB.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblB.setText("B:");
        lblB.setOpaque(true);

        lblD.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblD.setText("D:");
        lblD.setOpaque(true);

        lblRespD.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespD.setForeground(new java.awt.Color(255, 255, 255));
        lblRespD.setText("[resp4]");
        lblRespD.setOpaque(true);
        lblRespD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespDMouseReleased(evt);
            }
        });

        lblRespB.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblRespB.setForeground(new java.awt.Color(255, 255, 255));
        lblRespB.setText("[resp2]");
        lblRespB.setOpaque(true);
        lblRespB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRespBMouseReleased(evt);
            }
        });

        lblCorrectas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCorrectas.setForeground(new java.awt.Color(255, 255, 255));
        lblCorrectas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorrectas.setText("0");
        lblCorrectas.setOpaque(true);

        lblIncorrectas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblIncorrectas.setForeground(new java.awt.Color(255, 255, 255));
        lblIncorrectas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIncorrectas.setText("0");
        lblIncorrectas.setOpaque(true);

        javax.swing.GroupLayout panelJuegoLayout = new javax.swing.GroupLayout(panelJuego);
        panelJuego.setLayout(panelJuegoLayout);
        panelJuegoLayout.setHorizontalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                    .addGroup(panelJuegoLayout.createSequentialGroup()
                        .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCorrectas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJuegoLayout.createSequentialGroup()
                                .addComponent(lblC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelJuegoLayout.createSequentialGroup()
                                .addComponent(lblA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespA, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelJuegoLayout.createSequentialGroup()
                                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblD)
                                    .addComponent(lblB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRespB, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                                    .addComponent(lblRespD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJuegoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblIncorrectas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelJuegoLayout.setVerticalGroup(
            panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRespC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorrectas)
                    .addComponent(lblIncorrectas))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (letraRespuestaCorrecta != null) {
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

            txtRespACrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
            txtRespBCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
            txtRespCCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
            txtRespDCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

            txtPregunta.requestFocus();
            /*Limpieza de formulario*/

            letraRespuestaCorrecta = null;
        } else {
            JOptionPane.showMessageDialog(formCrearPregunta, "Escoja una respuesta correcta");
        }
    }//GEN-LAST:event_btnRegistrarPreguntaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (!juego.getPreguntas().isEmpty()) {
            panelJuego.setVisible(true);
            siguientePregunta();
        } else {
            JOptionPane.showMessageDialog(this, "No hay preguntas para jugar");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ObjectMapper om = new ObjectMapper();

            om.writerWithDefaultPrettyPrinter().writeValue(new File("juego.json"), juego);
//            String jsonInString = om.writeValueAsString(juego);
//            System.out.println(jsonInString);
//            jsonInString = om.writerWithDefaultPrettyPrinter().writeValueAsString(juego);
//            System.out.println(jsonInString);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JLabel lblCorrectas;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDCrearPreg;
    private javax.swing.JLabel lblIncorrectas;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespA;
    private javax.swing.JLabel lblRespB;
    private javax.swing.JLabel lblRespC;
    private javax.swing.JLabel lblRespD;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondoCrearPreguntas;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JTextField txtPregunta;
    private javax.swing.JTextField txtRespACrearPreg;
    private javax.swing.JTextField txtRespBCrearPreg;
    private javax.swing.JTextField txtRespCCrearPreg;
    private javax.swing.JTextField txtRespDCrearPreg;
    // End of variables declaration//GEN-END:variables

    private void initColores() {
        panelFondo.setBackground(Rules.COLOR_FONDO);
        panelJuego.setBackground(Rules.COLOR_FONDO);

        lblA.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblB.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblC.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblD.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

        lblA.setForeground(Rules.COLOR_LETRAS);
        lblB.setForeground(Rules.COLOR_LETRAS);
        lblC.setForeground(Rules.COLOR_LETRAS);
        lblD.setForeground(Rules.COLOR_LETRAS);

        lblRespA.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblRespB.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblRespC.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblRespD.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

        lblPregunta.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblCorrectas.setBackground(Rules.COLOR_CORRECTA);
        lblIncorrectas.setBackground(Rules.COLOR_INCORRECTA);

        /*Formulario preguntas*/
        panelFondoCrearPreguntas.setBackground(Rules.COLOR_FONDO);
        txtPregunta.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

        lblACrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblBCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblCCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblDCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

        lblACrearPreg.setForeground(Rules.COLOR_LETRAS);
        lblBCrearPreg.setForeground(Rules.COLOR_LETRAS);
        lblCCrearPreg.setForeground(Rules.COLOR_LETRAS);
        lblDCrearPreg.setForeground(Rules.COLOR_LETRAS);

        txtRespACrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        txtRespBCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        txtRespCCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        txtRespDCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

        btnRegistrarPregunta.setBackground(Rules.COLOR_CORRECTA);
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
            reproducir(Rules.MP3_SELECCION_RESPUESTA, false);
            lblResp.setBackground(Rules.COLOR_LETRAS);
            yaJugo = true;

            new Thread(() -> {
                // Pause por n segundos mientras se sabe la respuesta correcta
                try {
                    Thread.sleep(Rules.PAUSE_SABER_RESPUESTA_CORRECTA * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
                // Pause por n segundos mientras se sabe la respuesta correcta

                Respuesta correcta = preguntaActual.getRespuestaCorrecta();
                boolean isRespCor = preguntaActual.isRespuestaCorrecta(letra);
                JLabel lblRespCorrecta;
                Color color;

                if (isRespCor) {
                    reproducir(Rules.MP3_CORRECTA, false);
                    lblRespCorrecta = lblResp;
                    color = Rules.COLOR_LETRAS;
                    juego.aumentarCorrectas();
                } else {
                    reproducir(Rules.MP3_INCORRECTA, false);
                    juego.aumentarIncorrectas();
                    color = Rules.COLOR_FONDO;
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

                lblCorrectas.setText(Integer.toString(juego.getContCorrectas()));
                lblIncorrectas.setText(Integer.toString(juego.getContIncorrectas()));

                // Hilo de animación
                new Thread(() -> {
                    for (int i = 0; i < Rules.PARPADEOS; i++) {
                        try {
                            if (i % 2 == 0) {
                                lblRespCorrecta.setBackground(Rules.COLOR_CORRECTA);
                            } else {
                                lblRespCorrecta.setBackground(color);
                            }
                            Thread.sleep(Rules.VELOCIDAD_PARPADEO);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    // Si parpadeos es par, no quedo con el fondo de la respuesta correcta
                    if (Rules.PARPADEOS % 2 == 0) {
                        lblRespCorrecta.setBackground(Rules.COLOR_CORRECTA);
                    }

                    try {
                        Thread.sleep(Rules.PAUSE_ENTRE_PREGUNTAS * 1000);
                        siguientePregunta();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }).start();
            }).start();
        }
    }

    private void setPreguntaInGUI(Pregunta p) {
        yaJugo = false;
        lblRespA.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblRespB.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblRespC.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
        lblRespD.setBackground(Rules.COLOR_FONDO_PREGUNTAS);

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
                txtRespACrearPreg.setBackground(Rules.COLOR_CORRECTA);
                txtRespBCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespCCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespDCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                break;
            case "b":
                txtRespACrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespBCrearPreg.setBackground(Rules.COLOR_CORRECTA);
                txtRespCCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespDCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                break;
            case "c":
                txtRespACrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespBCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespCCrearPreg.setBackground(Rules.COLOR_CORRECTA);
                txtRespDCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                break;
            default:
                txtRespACrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespBCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespCCrearPreg.setBackground(Rules.COLOR_FONDO_PREGUNTAS);
                txtRespDCrearPreg.setBackground(Rules.COLOR_CORRECTA);
        }
    }

    private void siguientePregunta() {
        preguntaActual = juego.getPregunta(indexPregunta);

        if (preguntaActual != null) {
            indexPregunta++;
            reproducir(Rules.MP3_PREGUNTAS, true);
            setPreguntaInGUI(preguntaActual);
        } else {
            reproducir(Rules.MP3_MAIN, true);
            JOptionPane.showMessageDialog(this, "Gracias por jugar!");
            panelJuego.setVisible(false);
            indexPregunta = 0;
            juego.setContCorrectas(0);
            juego.setContIncorrectas(0);
        }
    }

    private void reproducir(String cancion, boolean infinito) {
        if(hiloMusicaPrincipal != null){
            hiloMusicaPrincipal.stopCancion();
            hiloMusicaPrincipal.stop();
        }
        hiloMusicaPrincipal = new Reproductor();
        hiloMusicaPrincipal.setInfinito(infinito);
        hiloMusicaPrincipal.setCancion(cancion);
        hiloMusicaPrincipal.start();
    }
}
