/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintic.unal.redflix.vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Optional;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mintic.unal.redflix.RedFlixApplication;
import mintic.unal.redflix.SpringContext;
import mintic.unal.redflix.modelos.Pelicula;
import mintic.unal.redflix.repositorios.PeliculaRepositorio;
import mintic.unal.redflix.modelos.Serie;
import mintic.unal.redflix.repositorios.SerieRepositorio;
import java.lang.Object;
import java.lang.String;

/**
 *
 * @author daniela
 */
public class Ventana extends javax.swing.JFrame {
    
   
    PeliculaRepositorio peliculaRepositorio;
    SerieRepositorio serieRepositorio;
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
       
        initComponents();
        
        String [] args = {};
        RedFlixApplication.runSpringServer(args);
         
        //Con getBean puedo obtener objetos del mundo de Spring. En este caso: ObraRepositorio. 
        //Si quiero acceder a otro repositorio, tengo que crear un nuevo getBean
        peliculaRepositorio = SpringContext.getBean(PeliculaRepositorio.class);
        serieRepositorio = SpringContext.getBean(SerieRepositorio.class);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelUsuario = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btConsultarSerie = new javax.swing.JButton();
        btGuardarSerie = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btEliminarSerie = new javax.swing.JButton();
        tfSerTitulo = new javax.swing.JTextField();
        btLimpiarSerie = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfTemporadas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfEpisodios = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lbEjecucionSerie = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btConsultarPel = new javax.swing.JButton();
        btGuardarPel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btEliminarPel = new javax.swing.JButton();
        tfPelTitulo = new javax.swing.JTextField();
        btLimpiarPel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPelDirector = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResumen = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        lbEjecucionPelicula = new javax.swing.JLabel();
        tfAnio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btConsultarSerie.setText("Consultar por Título");
        btConsultarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarSerieActionPerformed(evt);
            }
        });

        btGuardarSerie.setText("Guardar");
        btGuardarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarSerieActionPerformed(evt);
            }
        });

        jLabel7.setText("Título Serie");

        btEliminarSerie.setText("Eliminar");
        btEliminarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarSerieActionPerformed(evt);
            }
        });

        tfSerTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSerTituloActionPerformed(evt);
            }
        });
        tfSerTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSerTituloKeyTyped(evt);
            }
        });

        btLimpiarSerie.setText("Limpiar");
        btLimpiarSerie.setToolTipText("");
        btLimpiarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarSerieActionPerformed(evt);
            }
        });

        jLabel9.setText("Temporadas");

        tfTemporadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTemporadasActionPerformed(evt);
            }
        });
        tfTemporadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTemporadasKeyTyped(evt);
            }
        });

        jLabel10.setText("Episodios");
        jLabel10.setToolTipText("");

        tfEpisodios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEpisodiosKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SERIE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfSerTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btEliminarSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLimpiarSerie)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(tfTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(tfEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lbEjecucionSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGuardarSerie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEliminarSerie)
                        .addComponent(btLimpiarSerie)
                        .addComponent(jLabel7)
                        .addComponent(tfSerTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btConsultarSerie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(lbEjecucionSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btGuardarSerie)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jpanelUsuario.addTab("Serie", jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setAlignmentX(1.5F);
        jPanel1.setAlignmentY(1.5F);

        btConsultarPel.setText("Consultar por Titulo");
        btConsultarPel.setActionCommand("");
        btConsultarPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarPelActionPerformed(evt);
            }
        });

        btGuardarPel.setText("Guardar");
        btGuardarPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarPelActionPerformed(evt);
            }
        });

        jLabel2.setText("Título película");

        btEliminarPel.setText("Eliminar");
        btEliminarPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarPelActionPerformed(evt);
            }
        });

        tfPelTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPelTituloActionPerformed(evt);
            }
        });

        btLimpiarPel.setText("Limpiar");
        btLimpiarPel.setToolTipText("");
        btLimpiarPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarPelActionPerformed(evt);
            }
        });

        jLabel3.setText("Resumen");

        jLabel4.setText("Director");

        tfPelDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPelDirectorActionPerformed(evt);
            }
        });

        jLabel5.setText("Año");
        jLabel5.setToolTipText("");

        jTextAreaResumen.setColumns(20);
        jTextAreaResumen.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResumen);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PELÍCULA");

        tfAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnioActionPerformed(evt);
            }
        });
        tfAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAnioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfPelDirector, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(lbEjecucionPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfPelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btGuardarPel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminarPel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsultarPel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpiarPel)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultarPel)
                    .addComponent(btEliminarPel)
                    .addComponent(btLimpiarPel)
                    .addComponent(jLabel2)
                    .addComponent(tfPelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardarPel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfPelDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(lbEjecucionPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jpanelUsuario.addTab("Película", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        jpanelUsuario.addTab("Usuario", jPanel3);

        jLabel6.setBackground(new java.awt.Color(102, 255, 0));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RedFlix");
        jLabel6.setAlignmentX(5.0F);
        jLabel6.setAlignmentY(5.0F);
        jLabel6.setAutoscrolls(true);
        jLabel6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel6.setDoubleBuffered(true);
        jLabel6.setFocusCycleRoot(true);
        jLabel6.setFocusTraversalPolicyProvider(true);
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 21));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpanelUsuario.getAccessibleContext().setAccessibleName("Película");

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void tfTemporadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTemporadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTemporadasActionPerformed

    private void btLimpiarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarSerieActionPerformed
        // TODO add your handling code here:
        limpiarCamposSerie();
    }//GEN-LAST:event_btLimpiarSerieActionPerformed

    private void tfSerTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSerTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSerTituloActionPerformed

    private void btEliminarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarSerieActionPerformed
        // TODO add your handling code here:
        if(!tfSerTitulo.getText().equals("")){
            eliminarSerie();
        }
    }//GEN-LAST:event_btEliminarSerieActionPerformed

    private void btGuardarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarSerieActionPerformed
        // TODO add your handling code here:
        crearSerie();
    }//GEN-LAST:event_btGuardarSerieActionPerformed

    private void btConsultarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarSerieActionPerformed
        // TODO add your handling code here:
        if(!tfSerTitulo.getText().equals("")){
            buscarPorIdSerie();
            tfSerTitulo.setEnabled(true);
            
        }
    }//GEN-LAST:event_btConsultarSerieActionPerformed
/////////////////--------------------------------------------------------------------------
    private void tfPelDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPelDirectorActionPerformed

    }//GEN-LAST:event_tfPelDirectorActionPerformed

    private void btLimpiarPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarPelActionPerformed
        limpiarCamposPel();
    }//GEN-LAST:event_btLimpiarPelActionPerformed

    private void tfPelTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPelTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPelTituloActionPerformed

    private void btEliminarPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarPelActionPerformed
        if(!tfPelTitulo.getText().equals("")){
            eliminarPel();
        }
    }//GEN-LAST:event_btEliminarPelActionPerformed

    private void btGuardarPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarPelActionPerformed
        crearPel();
    }//GEN-LAST:event_btGuardarPelActionPerformed

    private void btConsultarPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPelActionPerformed
        if(!tfPelTitulo.getText().equals("")){
            buscarPorIdPel();
            tfPelTitulo.setEnabled(true);
        }
         else{
            lbEjecucionPelicula.setText("No ha digitado ningun id");
        }

    }//GEN-LAST:event_btConsultarPelActionPerformed

    private void tfTemporadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTemporadasKeyTyped
        // TODO add your handling code here:
    char validar= evt.getKeyChar();
        if((!Character.isDigit(validar)&& (validar != evt.VK_BACK_SPACE))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }
    }//GEN-LAST:event_tfTemporadasKeyTyped

    private void tfSerTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSerTituloKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tfSerTituloKeyTyped

    private void tfEpisodiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEpisodiosKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        if((!Character.isDigit(validar)&& (validar != evt.VK_BACK_SPACE))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }
        
    }//GEN-LAST:event_tfEpisodiosKeyTyped

    private void tfAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnioActionPerformed

    private void tfAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAnioKeyTyped
        // TODO add your handling code here:
     char validar= evt.getKeyChar();
        if((!Character.isDigit(validar)&& (validar != evt.VK_BACK_SPACE))){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }
    }//GEN-LAST:event_tfAnioKeyTyped

                                
                                         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultarPel;
    private javax.swing.JButton btConsultarSerie;
    private javax.swing.JButton btEliminarPel;
    private javax.swing.JButton btEliminarSerie;
    private javax.swing.JButton btGuardarPel;
    private javax.swing.JButton btGuardarSerie;
    private javax.swing.JButton btLimpiarPel;
    private javax.swing.JButton btLimpiarSerie;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaResumen;
    private javax.swing.JTabbedPane jpanelUsuario;
    private javax.swing.JLabel lbEjecucionPelicula;
    private javax.swing.JLabel lbEjecucionSerie;
    private javax.swing.JTextField tfAnio;
    private javax.swing.JTextField tfEpisodios;
    private javax.swing.JTextField tfPelDirector;
    private javax.swing.JTextField tfPelTitulo;
    private javax.swing.JTextField tfSerTitulo;
    private javax.swing.JTextField tfTemporadas;
    // End of variables declaration//GEN-END:variables

    
    //PELÍCULAS
    
     //setText es para mostrar el contenido de la variable en la ventana

    public void limpiarCamposPel() {
        btEliminarPel.setEnabled(true);
        btConsultarPel.setEnabled(true);
        tfPelTitulo.setText("");
        tfPelDirector.setText("");
        jTextAreaResumen.setText("");
        tfAnio.setText("");
        lbEjecucionPelicula.setText("");
    }

    private void buscarPorIdPel() {
        String id = tfPelTitulo.getText();
        Optional<Pelicula> optionalPelicula = peliculaRepositorio.findById(id);
        if (optionalPelicula.isPresent()) {
            Pelicula pelicula = optionalPelicula.get();
            //para poder setear el texto, tengo que convertilo a string antes
            tfPelDirector.setText(pelicula.getPeliculaDirNombre());
            jTextAreaResumen.setText(pelicula.getPeliculaResumen());
            tfAnio.setText(pelicula.getPeliculaAnio().toString());
            lbEjecucionPelicula.setText("La pelicula con id: " + id
                    + " ha sido correctamente buscada");
        } else {
            // Error cuando no existe el id
            lbEjecucionPelicula.setText("La pelicula con id: " + id
                    + " no existe en la base de datos");
        }

    }

    private void crearPel() {
        
        if (tfPelTitulo.getText().equals("")) {

            lbEjecucionPelicula.setText("Debe diligenciar el Titulo");
        } else {
        Pelicula pelicula = new Pelicula();
        pelicula.setPeliculaTitulo(tfPelTitulo.getText());
        pelicula.setPeliculaDirNombre(tfPelDirector.getText());
        pelicula.setPeliculaResumen(jTextAreaResumen.getText());
        pelicula.setPeliculaAnio(tfAnio.getText());
            String id = tfPelTitulo.getText();
            Optional<Pelicula> optionalPelicula = peliculaRepositorio.findById(id);
            if (optionalPelicula.isPresent()) {

                try {
                    peliculaRepositorio.save(pelicula);

                    lbEjecucionPelicula.setText("Se modificó correctamente la pelicula " + id);
                    System.out.println("Se modificó correctamente la pelicula " + id);

                } catch (Exception e) {
                    lbEjecucionPelicula.setText("No se modificó la pelicula: " + id);
                }

            } else {
                if(id.isBlank()){ ///-------------------------------------------------
                   
                
                try {
                    peliculaRepositorio.save(pelicula);

                    lbEjecucionPelicula.setText("Se registró correctamente la pelicula " + id);
                    System.out.println("Se registró correctamente la pelicula " + id);

                } catch (Exception e) {
                    lbEjecucionPelicula.setText("No se registró la pelicula: " + id);
                }
                }
            }

        }

    }

    //Eliminar un registro por Id
    public void eliminarPel() {
        lbEjecucionPelicula.setText("");
        tfPelDirector.setText("");
        jTextAreaResumen.setText("");
        tfAnio.setText("");

        String id = tfPelTitulo.getText();

        try {
            peliculaRepositorio.deleteById(id);
            lbEjecucionPelicula.setText("Se eliminó exitosamente la pelicula " + id);
            System.out.println("Se eliminó exitosamente la pelicula " + id);

        } catch (Exception e) {
            lbEjecucionPelicula.setText("Ocurrio un error al eliminar");
        }

    }

    
    
    // ---------------SERIES----------------
    
      
    //setText es para mostrar el contenido de la variable en la ventana
    
    public void limpiarCamposSerie(){
        tfSerTitulo.setEnabled(true);
        lbEjecucionSerie.setEnabled(true);
        tfSerTitulo.setText("");
        tfTemporadas.setText("");
        tfEpisodios.setText("");
        lbEjecucionSerie.setText("");
    }
    
    private void buscarPorIdSerie() {
        String id = tfSerTitulo.getText();
        Optional<Serie> optionalSerie = serieRepositorio.findById(id);
        if(optionalSerie.isPresent()){
            Serie serie = optionalSerie.get();
            //para poder setear el texto, tengo que convertilo a string antes
            tfSerTitulo.setText(serie.getSerTitulo());
            tfTemporadas.setText(serie.getSerTemporadas());
            tfEpisodios.setText(serie.getSerEpisodios());
        }
    }
    

    private void crearSerie() {
        Serie serie = new Serie();
        serie.setSerTitulo(tfSerTitulo.getText());
        serie.setSerTemporadas(tfTemporadas.getText());
        serie.setSerEpisodios(tfEpisodios.getText());

        String id;
        //StringBuffer evita que se cree un nuevo objeto en memoria cada vez
        //que se actualiza el valor de una variable:
        //a = "";
        //a = 3 + 2 --> ¡Mala práctica!
        StringBuffer respuesta = new StringBuffer();
        if(tfSerTitulo.getText().equals("")){
            id = null; //****************************************************
            respuesta.append("Se creó la serie: ");
        }
        else{
            id = (tfSerTitulo.getText());
            respuesta.append("Se actualizó la serie: ");
        }
         
       serie.setSerTitulo(id);
                
        try{
            serieRepositorio.save(serie);
            respuesta.append(serie.getSerTitulo());
            tfSerTitulo.setText(serie.getSerTitulo().toString());
            lbEjecucionSerie.setText(respuesta.toString());
        }
        catch(Exception e)
        {
            lbEjecucionSerie.setText("Ocurrio un error al guardar");
        }
       
    }
   
    //Eliminar un registro por Id
    public void eliminarSerie(){
        String id = (tfSerTitulo.getText());
        
        try{
            serieRepositorio.deleteById(id);
            lbEjecucionSerie.setText("Se eliminó la serie: " + id.toString());
        }
        catch(Exception e)
        {
            lbEjecucionSerie.setText("Ocurrio un error al eliminar");
        }
                
    }
}

  // ---------------USUARIOS----------------


