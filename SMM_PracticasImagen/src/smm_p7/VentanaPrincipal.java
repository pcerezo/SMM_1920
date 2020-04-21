/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smm_p7;

import SM.PCS.Graficos.Herramienta;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pabloc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInterna
     */
    
    private Herramienta herramientaActual;
    
    public VentanaPrincipal() {
        initComponents();
        this.herramientaActual = Herramienta.LAPIZ;
        this.etiquetaHerramientaActual.setText("Ventana Principal: " + Herramienta.LAPIZ); // Por defecto el lápiz al principio
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraFormas = new javax.swing.JToolBar();
        botonLapiz = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonOvalo = new javax.swing.JToggleButton();
        botonPera = new javax.swing.JToggleButton();
        barraAtributos = new javax.swing.JPanel();
        barraEstado = new javax.swing.JPanel();
        etiquetaHerramientaActual = new javax.swing.JLabel();
        colorNegro = new javax.swing.JButton();
        colorBlanco = new javax.swing.JButton();
        colorAmarillo = new javax.swing.JButton();
        colorRojo = new javax.swing.JButton();
        colorVerde = new javax.swing.JButton();
        colorAzul = new javax.swing.JButton();
        botonRelleno = new javax.swing.JCheckBox();
        botonEditar = new javax.swing.JCheckBox();
        botonAlisar = new javax.swing.JCheckBox();
        botonTransparencia = new javax.swing.JCheckBox();
        botonGrosor = new javax.swing.JSpinner();
        PanelCentral = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevaVentana = new javax.swing.JMenuItem();
        abrirDibujo = new javax.swing.JMenuItem();
        guardarDibujo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        verBarraEstado = new javax.swing.JCheckBoxMenuItem();
        verBarraAtributos = new javax.swing.JCheckBoxMenuItem();
        verBarraFormas = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraFormas.setRollover(true);

        botonLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lapiz.png"))); // NOI18N
        botonLapiz.setFocusable(false);
        botonLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLapizActionPerformed(evt);
            }
        });
        barraFormas.add(botonLapiz);

        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/linea.png"))); // NOI18N
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLineaActionPerformed(evt);
            }
        });
        barraFormas.add(botonLinea);

        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rectangulo.png"))); // NOI18N
        botonRectangulo.setFocusable(false);
        botonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloActionPerformed(evt);
            }
        });
        barraFormas.add(botonRectangulo);

        botonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/elipse.png"))); // NOI18N
        botonOvalo.setFocusable(false);
        botonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOvaloActionPerformed(evt);
            }
        });
        barraFormas.add(botonOvalo);

        botonPera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pera.png"))); // NOI18N
        botonPera.setFocusable(false);
        botonPera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPeraActionPerformed(evt);
            }
        });
        barraFormas.add(botonPera);

        getContentPane().add(barraFormas, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout barraEstadoLayout = new javax.swing.GroupLayout(barraEstado);
        barraEstado.setLayout(barraEstadoLayout);
        barraEstadoLayout.setHorizontalGroup(
            barraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaHerramientaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barraEstadoLayout.setVerticalGroup(
            barraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaHerramientaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        colorNegro.setBackground(new java.awt.Color(0, 0, 0));
        colorNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorNegroActionPerformed(evt);
            }
        });

        colorBlanco.setBackground(new java.awt.Color(255, 255, 255));
        colorBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlancoActionPerformed(evt);
            }
        });

        colorAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        colorAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAmarilloActionPerformed(evt);
            }
        });

        colorRojo.setBackground(new java.awt.Color(255, 0, 0));
        colorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRojoActionPerformed(evt);
            }
        });

        colorVerde.setBackground(new java.awt.Color(0, 255, 0));
        colorVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorVerdeActionPerformed(evt);
            }
        });

        colorAzul.setBackground(new java.awt.Color(51, 153, 255));
        colorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAzulActionPerformed(evt);
            }
        });

        botonRelleno.setText("Relleno");
        botonRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRellenoActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonAlisar.setText("Alisar");
        botonAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlisarActionPerformed(evt);
            }
        });

        botonTransparencia.setText("Transparencia");
        botonTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransparenciaActionPerformed(evt);
            }
        });

        botonGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                botonGrosorStateChanged(evt);
            }
        });
        botonGrosor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGrosorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraAtributosLayout = new javax.swing.GroupLayout(barraAtributos);
        barraAtributos.setLayout(barraAtributosLayout);
        barraAtributosLayout.setHorizontalGroup(
            barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barraAtributosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(colorNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colorAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRelleno)
                    .addComponent(botonEditar))
                .addGap(26, 26, 26)
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraAtributosLayout.createSequentialGroup()
                        .addComponent(botonTransparencia)
                        .addGap(78, 78, 78)
                        .addComponent(botonGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAlisar))
                .addContainerGap(580, Short.MAX_VALUE))
        );
        barraAtributosLayout.setVerticalGroup(
            barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorNegro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRelleno)
                    .addComponent(botonAlisar))
                .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraAtributosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(barraAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEditar)
                            .addComponent(botonTransparencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAtributosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGrosor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(barraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(barraAtributos, java.awt.BorderLayout.PAGE_END);

        PanelCentral.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        PanelCentral.add(escritorio, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelCentral, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        nuevaVentana.setText("Nuevo");
        nuevaVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentanaActionPerformed(evt);
            }
        });
        jMenu1.add(nuevaVentana);

        abrirDibujo.setText("Abrir...");
        abrirDibujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirDibujoActionPerformed(evt);
            }
        });
        jMenu1.add(abrirDibujo);

        guardarDibujo.setText("Guardar como...");
        guardarDibujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDibujoActionPerformed(evt);
            }
        });
        jMenu1.add(guardarDibujo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        verBarraEstado.setSelected(true);
        verBarraEstado.setText("Ver barra de estado");
        verBarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBarraEstadoActionPerformed(evt);
            }
        });
        jMenu2.add(verBarraEstado);

        verBarraAtributos.setSelected(true);
        verBarraAtributos.setText("Ver barra de atributos");
        verBarraAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBarraAtributosActionPerformed(evt);
            }
        });
        jMenu2.add(verBarraAtributos);

        verBarraFormas.setSelected(true);
        verBarraFormas.setText("Ver barra de formas");
        verBarraFormas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBarraFormasActionPerformed(evt);
            }
        });
        jMenu2.add(verBarraFormas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void botonTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransparenciaActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setTransparencia(this.botonTransparencia.isSelected());
        vi.getLienzo2D().setAtributos();
    }//GEN-LAST:event_botonTransparenciaActionPerformed

    private void nuevaVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaVentanaActionPerformed
        //Creamos nueva ventana interna
        VentanaInterna vi = new VentanaInterna();
        this.escritorio.add(vi);
        vi.setVisible(true);
        vi.addInternalFrameListener(new ManejadorVentanaInterna());
        BufferedImage img;
        img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();
        vi.getLienzo2D().setFondo(img);
        vi.getLienzo2D().paint(g); //Llamar a función especial que dibuje como paint pero un rectángulo blanco
        this.setOpcionesDefault();
    }//GEN-LAST:event_nuevaVentanaActionPerformed

    private void guardarDibujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDibujoActionPerformed
        VentanaInterna vi  = (VentanaInterna) this.escritorio.getSelectedFrame();
        FileFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        if (vi != null) {
            BufferedImage img = vi.getLienzo2D().getFondo(true); //true --> Guardamos las figuras dibujadas sobre la imagen
            if (img != null) {
                JFileChooser dlg = new JFileChooser();
                dlg.addChoosableFileFilter(filter);
                
                int resp = dlg.showSaveDialog(this);
                if (resp == JFileChooser.APPROVE_OPTION) {
                    try{
                        File f = dlg.getSelectedFile();
                        ImageIO.write(img, "jpg", f);
                        vi.setTitle(f.getName());
                    }
                    catch (Exception e) {
                        JDialog aviso = new JDialog();
                        aviso.setTitle("ERROR AL GUARDAR");
                        System.err.println("Error al guardar la imagen");
                    }
                }
            }
        }
    }//GEN-LAST:event_guardarDibujoActionPerformed

    private void botonLapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLapizActionPerformed
        this.botonLapiz.setSelected(true);
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        if (vi != null)
            vi.setHerramienta(Herramienta.LAPIZ);
        
        this.botonLinea.setSelected(false);
        this.botonRectangulo.setSelected(false);
        this.botonOvalo.setSelected(false);
        this.botonPera.setSelected(false);
        
        this.herramientaActual = Herramienta.LAPIZ;
        this.etiquetaHerramientaActual.setText("Ventana Principal: " + this.herramientaActual);
    }//GEN-LAST:event_botonLapizActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
        this.botonLinea.setSelected(true);
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        if (vi != null)
            vi.setHerramienta(Herramienta.LINEA);
        
        this.botonLapiz.setSelected(false);
        this.botonRectangulo.setSelected(false);
        this.botonOvalo.setSelected(false);
        this.botonPera.setSelected(false);
        
        this.herramientaActual = Herramienta.LINEA;
        this.etiquetaHerramientaActual.setText("Ventana Principal: " + this.herramientaActual);
    }//GEN-LAST:event_botonLineaActionPerformed

    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        this.botonRectangulo.setSelected(true);
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        if (vi != null)
            vi.setHerramienta(Herramienta.RECTANGULO);
        
        this.botonLapiz.setSelected(false);
        this.botonLinea.setSelected(false);
        this.botonOvalo.setSelected(false);
        this.botonPera.setSelected(false);
        
        this.herramientaActual = Herramienta.RECTANGULO;
        this.etiquetaHerramientaActual.setText("Ventana Principal: " + this.herramientaActual);
    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOvaloActionPerformed
        this.botonOvalo.setSelected(true);
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        if (vi != null)
            vi.setHerramienta(Herramienta.OVALO);
        
        this.botonLapiz.setSelected(false);
        this.botonLinea.setSelected(false);
        this.botonRectangulo.setSelected(false);
        this.botonPera.setSelected(false);
        
        this.herramientaActual = Herramienta.OVALO;
        this.etiquetaHerramientaActual.setText("Ventana Principal: " + this.herramientaActual);
    }//GEN-LAST:event_botonOvaloActionPerformed

    private void botonPeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPeraActionPerformed
        this.botonPera.setSelected(true);
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        if (vi != null)
            vi.setHerramienta(Herramienta.PERA);
        
        this.botonLapiz.setSelected(false);
        this.botonLinea.setSelected(false);
        this.botonRectangulo.setSelected(false);
        this.botonOvalo.setSelected(false);
        
        this.herramientaActual = Herramienta.PERA;
        this.etiquetaHerramientaActual.setText("Ventana Principal: " + this.herramientaActual);
    }//GEN-LAST:event_botonPeraActionPerformed

    private void setOpcionesDefault() {
        this.botonLapiz.setSelected(true);       
        this.botonLinea.setSelected(false);
        this.botonRectangulo.setSelected(false);
        this.botonOvalo.setSelected(false);
        this.botonPera.setSelected(false);
        this.herramientaActual = Herramienta.LAPIZ;
        
        this.botonAlisar.setSelected(false);
        this.botonEditar.setSelected(false);
        this.botonRelleno.setSelected(false);
        this.botonTransparencia.setSelected(false);
        this.botonGrosor.setValue(1);
    }
    
    private void botonRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRellenoActionPerformed
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setRelleno(this.botonRelleno.isSelected());        
    }//GEN-LAST:event_botonRellenoActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        VentanaInterna vi = (VentanaInterna)this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setEditar(this.botonEditar.isSelected());
    }//GEN-LAST:event_botonEditarActionPerformed

    private void colorNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorNegroActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setColor(Color.BLACK);
    }//GEN-LAST:event_colorNegroActionPerformed

    private void colorBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlancoActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setColor(Color.WHITE);
    }//GEN-LAST:event_colorBlancoActionPerformed

    private void colorAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAmarilloActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setColor(Color.YELLOW);
    }//GEN-LAST:event_colorAmarilloActionPerformed

    private void colorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRojoActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setColor(Color.RED);
    }//GEN-LAST:event_colorRojoActionPerformed

    private void colorVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorVerdeActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setColor(Color.GREEN);
    }//GEN-LAST:event_colorVerdeActionPerformed

    private void colorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAzulActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setColor(Color.BLUE);
    }//GEN-LAST:event_colorAzulActionPerformed

    private void botonAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlisarActionPerformed
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setAlisar(this.botonAlisar.isSelected());
        vi.getLienzo2D().setAtributos();
    }//GEN-LAST:event_botonAlisarActionPerformed

    private void botonGrosorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGrosorMouseClicked
        //System.out.println("Grosor modificado");
    }//GEN-LAST:event_botonGrosorMouseClicked

    private void botonGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_botonGrosorStateChanged
        VentanaInterna vi = (VentanaInterna) this.escritorio.getSelectedFrame();
        vi.getLienzo2D().setGrosor((int)this.botonGrosor.getValue());
        vi.getLienzo2D().setAtributos();
        System.out.println("Grosor: " + this.botonGrosor.getValue());
    }//GEN-LAST:event_botonGrosorStateChanged

    private void abrirDibujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirDibujoActionPerformed
        JFileChooser dlg = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        dlg.addChoosableFileFilter(filter);
        int resp = dlg.showOpenDialog(this);
        
        if (resp == JFileChooser.APPROVE_OPTION) {
            try {
                File f = dlg.getSelectedFile();
                BufferedImage img = ImageIO.read(f);
                VentanaInterna vi = new VentanaInterna();
                this.escritorio.add(vi);
                vi.setVisible(true);
                vi.addInternalFrameListener(new ManejadorVentanaInterna());
                vi.getLienzo2D().setFondo(img);
                vi.setTitle(f.getName());
                this.setOpcionesDefault();
            }
            catch(Exception e) {
                //Creamos una ventana de diálogo  donde indicamos el error
                JDialog aviso = new JDialog(new JFrame(),"ERROR AL ABRIR");
                JLabel l = new JLabel("El archivo seleccionado no es válido.");
                aviso.add(l);
                aviso.setSize(500, 200);
                aviso.setVisible(true);
                System.err.println("Error al leer la imagen");
            }
        }
        
    }//GEN-LAST:event_abrirDibujoActionPerformed

    private void verBarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBarraEstadoActionPerformed
        this.barraEstado.setVisible(this.verBarraEstado.isSelected());
    }//GEN-LAST:event_verBarraEstadoActionPerformed

    private void verBarraAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBarraAtributosActionPerformed
        this.barraAtributos.setVisible(this.verBarraAtributos.isSelected());
    }//GEN-LAST:event_verBarraAtributosActionPerformed

    private void verBarraFormasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBarraFormasActionPerformed
        this.barraFormas.setVisible(this.verBarraFormas.isSelected());
    }//GEN-LAST:event_verBarraFormasActionPerformed

    
    
    
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    private class ManejadorVentanaInterna extends InternalFrameAdapter {
        @Override
        public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            System.out.println("Ventana seleccionada");
            VentanaInterna vi = (VentanaInterna) escritorio.getSelectedFrame();
            
            //Obtenemos las opciones seleccionadas
            botonRelleno.setSelected(vi.getLienzo2D().isRelleno());
            botonAlisar.setSelected(vi.getLienzo2D().isAlisar());
            botonEditar.setSelected(vi.getLienzo2D().isEditar());
            botonTransparencia.setSelected(vi.getLienzo2D().isTransparencia());
            
            System.out.println("Herramienta de esta ventana = " + vi.getLienzo2D().getHerramienta());
            //Obtenemos las herramientas en uso en la ventana interna
            botonLapiz.setSelected(Herramienta.LAPIZ.equals(vi.getLienzo2D().getHerramienta()));
            botonLinea.setSelected(Herramienta.LINEA.equals(vi.getLienzo2D().getHerramienta()));
            botonRectangulo.setSelected(Herramienta.RECTANGULO.equals(vi.getLienzo2D().getHerramienta()));
            botonOvalo.setSelected(Herramienta.OVALO.equals(vi.getLienzo2D().getHerramienta()));
            botonPera.setSelected(Herramienta.PERA.equals(vi.getLienzo2D().getHerramienta()));
            
            botonGrosor.setValue(vi.getLienzo2D().getGrosor());
        }
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JMenuItem abrirDibujo;
    private javax.swing.JPanel barraAtributos;
    private javax.swing.JPanel barraEstado;
    private javax.swing.JToolBar barraFormas;
    private javax.swing.JCheckBox botonAlisar;
    private javax.swing.JCheckBox botonEditar;
    private javax.swing.JSpinner botonGrosor;
    private javax.swing.JToggleButton botonLapiz;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JToggleButton botonOvalo;
    private javax.swing.JToggleButton botonPera;
    private javax.swing.JToggleButton botonRectangulo;
    private javax.swing.JCheckBox botonRelleno;
    private javax.swing.JCheckBox botonTransparencia;
    private javax.swing.JButton colorAmarillo;
    private javax.swing.JButton colorAzul;
    private javax.swing.JButton colorBlanco;
    private javax.swing.JButton colorNegro;
    private javax.swing.JButton colorRojo;
    private javax.swing.JButton colorVerde;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel etiquetaHerramientaActual;
    private javax.swing.JMenuItem guardarDibujo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem nuevaVentana;
    private javax.swing.JCheckBoxMenuItem verBarraAtributos;
    private javax.swing.JCheckBoxMenuItem verBarraEstado;
    private javax.swing.JCheckBoxMenuItem verBarraFormas;
    // End of variables declaration//GEN-END:variables
}
