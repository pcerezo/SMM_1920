/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsmm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

/**
 *
 * @author pablo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.herramienta_actual.setText("Herramienta actual: " + Herramienta.LAPIZ);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button6 = new java.awt.Button();
        lienzo1 = new aplicacionsmm.Lienzo();
        jPanel1 = new javax.swing.JPanel();
        button7 = new java.awt.Button();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button3 = new java.awt.Button();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        herramienta_actual = new javax.swing.JLabel();
        Editar = new javax.swing.JCheckBox();
        listaFuentes = new javax.swing.JComboBox<>();
        ventanaActiva = new javax.swing.JCheckBox();
        jToolBar1 = new javax.swing.JToolBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        ver_barra_estado = new javax.swing.JCheckBoxMenuItem();

        button6.setBackground(new java.awt.Color(248, 255, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1000, 700));

        lienzo1.setBackground(new java.awt.Color(254, 254, 254));
        lienzo1.setName(""); // NOI18N
        lienzo1.setPreferredSize(new java.awt.Dimension(500, 400));
        lienzo1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(lienzo1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(159, 159, 159));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 100));

        button7.setBackground(new java.awt.Color(252, 251, 7));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActivado(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setPreferredSize(new java.awt.Dimension(30, 30));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blancoActivado(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negroActivado(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 255, 0));
        button4.setPreferredSize(new java.awt.Dimension(30, 30));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActivado(evt);
            }
        });

        button5.setBackground(new java.awt.Color(57, 2, 245));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulActivado(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 0, 0));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoActivado(evt);
            }
        });

        jCheckBox1.setText("Relleno");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(herramienta_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(herramienta_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fuentesSistema = ge.getAvailableFontFamilyNames();
        listaFuentes.setModel(new DefaultComboBoxModel(fuentesSistema));
        listaFuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFuentesActionPerformed(evt);
            }
        });

        ventanaActiva.setText("Ventana activa");
        ventanaActiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaActivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Editar)
                        .addGap(31, 31, 31)
                        .addComponent(listaFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ventanaActiva)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Editar)
                            .addComponent(listaFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addGap(18, 18, 18)
                        .addComponent(ventanaActiva)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jToolBar1.setRollover(true);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lapiz.png"))); // NOI18N
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapizActivado(evt);
            }
        });
        jToolBar1.add(jToggleButton1);

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        jToggleButton2.setFocusable(false);
        jToggleButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jToggleButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaActivado(evt);
            }
        });
        jToolBar1.add(jToggleButton2);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
        jToggleButton3.setFocusable(false);
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jToggleButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloActivado(evt);
            }
        });
        jToolBar1.add(jToggleButton3);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elipse.png"))); // NOI18N
        jToggleButton4.setFocusable(false);
        jToggleButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton4.setPreferredSize(new java.awt.Dimension(50, 40));
        jToggleButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovaloActivado(evt);
            }
        });
        jToolBar1.add(jToggleButton4);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pera.png"))); // NOI18N
        jToggleButton6.setFocusable(false);
        jToggleButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton6);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("Archivo");

        jMenuItem1.setLabel("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setLabel("Abrir");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setLabel("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenu4.setLabel("Imprimir");

        jMenuItem4.setLabel("Impresora");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setLabel("Fichero");
        jMenu4.add(jMenuItem5);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem6.setLabel("Copiar");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setLabel("Cortar");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setLabel("Pegar");
        jMenu2.add(jMenuItem8);

        ver_barra_estado.setSelected(true);
        ver_barra_estado.setText("Ver barra de estado");
        ver_barra_estado.setToolTipText("");
        ver_barra_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_barra_estadoActionPerformed(evt);
            }
        });
        jMenu2.add(ver_barra_estado);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        /// Lanzamos un diálogo para abrir un archivo
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            dlg.showSaveDialog(jMenu1);
            //dlg.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ver_barra_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_barra_estadoActionPerformed
        if (this.ver_barra_estado.isSelected()) { //Si está marcado...
            this.jPanel2.setVisible(true);
        }
        else {
            this.jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_ver_barra_estadoActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // Lanzamos un diálogo para abrir un archivo
        /*JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            dlg.showSaveDialog(jMenu1);
            dlg.setVisible(true);
        }*/
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.lienzo1.setP(new Point(-2, -2));
        this.lienzo1.setP2(new Point(-2, -2));
        this.repaint();
        /*this.lienzo1 = new Lienzo();
        this.repaint();*/
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Lanzamos un diálogo para abrir un archivo
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile();
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void negroActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negroActivado
        lienzo1.setColor(Color.black);
    }//GEN-LAST:event_negroActivado

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        this.lienzo1.setRelleno(this.jCheckBox1.isSelected());
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void blancoActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blancoActivado
        lienzo1.setColor(Color.white);
    }//GEN-LAST:event_blancoActivado

    private void rojoActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoActivado
        lienzo1.setColor(Color.red);
    }//GEN-LAST:event_rojoActivado

    private void amarilloActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActivado
        lienzo1.setColor(Color.yellow);
    }//GEN-LAST:event_amarilloActivado

    private void verdeActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActivado
        lienzo1.setColor(Color.green);
    }//GEN-LAST:event_verdeActivado

    private void azulActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulActivado
        lienzo1.setColor(Color.blue);
    }//GEN-LAST:event_azulActivado

    private void lapizActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapizActivado
        this.jToggleButton1.setSelected(true);
        lienzo1.setHerramienta(Herramienta.LAPIZ);
        this.jToggleButton2.setSelected(false);
        this.jToggleButton3.setSelected(false);
        this.jToggleButton4.setSelected(false);
        this.jToggleButton6.setSelected(false);
        this.herramienta_actual.setText("Herramienta actual: " + this.lienzo1.getHerramienta().toString());
    }//GEN-LAST:event_lapizActivado

    private void lineaActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaActivado
        this.jToggleButton2.setSelected(true);
        lienzo1.setHerramienta(Herramienta.LINEA);
        this.jToggleButton1.setSelected(false);
        this.jToggleButton3.setSelected(false);
        this.jToggleButton4.setSelected(false);
        this.jToggleButton6.setSelected(false);
        this.herramienta_actual.setText("Herramienta actual: " + this.lienzo1.getHerramienta().toString());
    }//GEN-LAST:event_lineaActivado

    private void rectanguloActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloActivado
        this.jToggleButton3.setSelected(true);
        lienzo1.setHerramienta(Herramienta.RECTANGULO);
        this.jToggleButton2.setSelected(false);
        this.jToggleButton1.setSelected(false);
        this.jToggleButton4.setSelected(false);
        this.jToggleButton6.setSelected(false);
        this.herramienta_actual.setText("Herramienta actual: " + this.lienzo1.getHerramienta().toString());
    }//GEN-LAST:event_rectanguloActivado

    private void ovaloActivado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovaloActivado
        this.jToggleButton4.setSelected(true);
        lienzo1.setHerramienta(Herramienta.OVALO);
        this.jToggleButton2.setSelected(false);
        this.jToggleButton3.setSelected(false);
        this.jToggleButton1.setSelected(false);
        this.jToggleButton6.setSelected(false);
        this.herramienta_actual.setText("Herramienta actual: " + this.lienzo1.getHerramienta().toString());
    }//GEN-LAST:event_ovaloActivado

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        //Las funciones cambian si está activado el modo editar
        if (this.Editar.isSelected())
            this.lienzo1.setEditar(true);
        else
            this.lienzo1.setEditar(false);
    }//GEN-LAST:event_EditarActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        this.jToggleButton6.setSelected(true);
        lienzo1.setHerramienta(Herramienta.PERA);
        this.jToggleButton4.setSelected(false);
        this.jToggleButton2.setSelected(false);
        this.jToggleButton3.setSelected(false);
        this.jToggleButton1.setSelected(false);
        this.herramienta_actual.setText("Herramienta actual: " + this.lienzo1.getHerramienta().toString());
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void listaFuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFuentesActionPerformed
        String tipoFuente = (String) this.listaFuentes.getSelectedItem();
        this.lienzo1.setTipoFuente(tipoFuente);
        System.out.println("Tipo: " + tipoFuente);
    }//GEN-LAST:event_listaFuentesActionPerformed

    private void ventanaActivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaActivaActionPerformed
        if (this.ventanaActiva.isSelected()) {
            this.lienzo1.setVentanaActiva(true);
        }
        else {
            this.lienzo1.setVentanaActiva(false);
        }
    }//GEN-LAST:event_ventanaActivaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Editar;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private javax.swing.JLabel herramienta_actual;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToolBar jToolBar1;
    private aplicacionsmm.Lienzo lienzo1;
    private javax.swing.JComboBox<String> listaFuentes;
    private javax.swing.JCheckBox ventanaActiva;
    private javax.swing.JCheckBoxMenuItem ver_barra_estado;
    // End of variables declaration//GEN-END:variables
}
