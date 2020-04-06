/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.PCS.IU;

import SM.PCS.Graficos.Figura;
import SM.PCS.Graficos.Herramienta;
import SM.PCS.Graficos.Linea;
import SM.PCS.Graficos.Ovalo;
import SM.PCS.Graficos.Pera;
import SM.PCS.Graficos.Punto;
import SM.PCS.Graficos.Tipo;
import SMM.PCS.Eventos.LienzoEvent;
import SMM.PCS.Eventos.LienzoListener;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

/**
 *
 * @author pabloc
 */
public class Lienzo2D extends javax.swing.JPanel {
    ArrayList<LienzoListener>lienzoEventListeners = new ArrayList();
    
    private Color color = Color.black;
    private boolean relleno, alisar, editar, transparencia;
    private Point pAnterior;
    private int grosor;
    private Stroke trazo;
    private Point p = new Point (-10, -10);
    private Point p2 = new Point (-10, -10);
    private Herramienta herramienta = Herramienta.LAPIZ; //Por defecto, lápiz
    private ArrayList<Figura> figuras;
    private Figura figuraActual;
    private String tipoFuente;
    private boolean ventanaActiva;
    private Ellipse2D ventana;
    
    private Composite comp;
    private RenderingHints rh;
    
    public void addLienzoListener(LienzoListener listener) {
        if (listener != null) {
            lienzoEventListeners.add(listener);
        }
    }
    
    private void notifyFiguraAddedEvent(LienzoEvent evt) {
        if (!lienzoEventListeners.isEmpty()) {
            for (LienzoListener listener: lienzoEventListeners) {
                listener.figuraAdded(evt);
            }
        }
    }
    
    private void notifyPropertyChangeEvent(LienzoEvent evt) {
        if (!lienzoEventListeners.isEmpty()) {
            for (LienzoListener listener: lienzoEventListeners) {
                listener.propertyChange(evt);
            }
        }
    }
    
    public Lienzo2D() {
        initComponents();
        this.figuras = new ArrayList();
        this.figuraActual = new Figura();
        this.relleno = false;
        this.alisar = false;
        this.editar = false;
        this.transparencia = false;
        this.grosor = 1;
        this.trazo = new BasicStroke(this.grosor);
        this.tipoFuente = "aakar";
        this.ventana = new Ellipse2D.Float(0,0,500,500);
        this.pAnterior = null;
        this.comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        this.rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
    }
    
    @Override
    public void paint(Graphics g) {
        //Se sobrecarga
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setComposite(this.comp);
        g2d.setColor(this.color);
        g2d.addRenderingHints(this.rh);
        g2d.setStroke(this.trazo);
        
        for (Figura f: this.figuras) {
            if (f.getFigura() instanceof Pera) {
                Pera pera = (Pera) f.getFigura();
                pera.paint(g);
            }
            else {
                if (f.getFigura() instanceof Punto) {
                    g2d.fill(f.getFigura());
                }
                else if (f.getFigura() instanceof Linea) {
                    g2d.draw(f.getFigura());
                }
                else if (this.isRelleno()) {
                    g2d.fill(f.getFigura());
                }
                else {
                    g2d.draw(f.getFigura());
                }
            }
        }
        
        //this.pera.paint(g);
        
        //System.out.println("Herramienta con la que pinto: " + this.getHerramienta());
        //System.out.println("Relleno = " + this.relleno);
        //g.drawLine(20, 20, 200, 200);
        //g.fillOval(p.x-15, p.y-15, 20, 20);
        
    }
    
    public void setAtributos(){
        if (this.transparencia)
            this.comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        else
            this.comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        if (this.alisar){
            this.rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        else
            this.rh.clear();
        
        this.trazo = new BasicStroke(this.grosor);
        
        this.repaint();
    }
    
    public Color getColor() {
        return this.color; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setColor(Color color) {
        this.color = color;
        this.repaint();
    }

    public boolean isRelleno() {
        return this.relleno; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setRelleno(boolean activado) {
        this.relleno = activado;
        this.repaint();
        System.out.println("Relleno = " + this.relleno);
    }
    
    public boolean isAlisar() {
        return this.alisar;
    }
    
    public void setAlisar(boolean activado) {
        this.alisar = activado;
        this.repaint();
    }
    
    public boolean isEditar() {
        return this.editar;
    }
    
    public void setEditar(boolean activado) {
        this.editar = activado;
    }
    
    public boolean isTransparencia() {
        return this.transparencia;
    }
    
    public void setTransparencia(boolean activado) {
        this.transparencia = activado;
    }
    
    public void setGrosor(int g){
        this.grosor = g;
        System.out.println("Grosor cambiado a " + this.grosor);
    }
    
    public void setHerramienta(Herramienta h) {
        this.herramienta = h;
        System.out.println("Cambio a " + this.herramienta);
    }
    
    public Herramienta getHerramienta() {
        return this.herramienta;
    }
    
    public Figura getFiguraSeleccionada(Point paux) {
        for (Figura f: figuras) {
            if (f.contains(paux)) {
                //System.out.println("Figura seleccionada: " + f.getTipo()); //Comprobando que detecta
                return f;
            }
        }
        
        return null;
    }
    
    
    
    public void pressed(java.awt.event.MouseEvent evt) {
        this.p = evt.getPoint();
        
        this.createShape();
        
        this.repaint();
    }
    
    public void dragged(java.awt.event.MouseEvent evt) {
        this.p2 = evt.getPoint();
        
        this.updateShape();
        
        this.repaint();
    }
    
    public void released(java.awt.event.MouseEvent evt) {
        this.pAnterior = null;
    }
    
    public void createShape() {
        if (this.editar) {
            this.figuraActual = this.getFiguraSeleccionada(p);
            this.pAnterior = new Point(this.figuraActual.getPos());
            System.out.println("pAnterior pressed: " + pAnterior.x + ", " + pAnterior.y);
        }
        else {
            switch(this.herramienta) {
                case LAPIZ:
                    Punto punto = new Punto(p.x, p.y);
                    //this.figuraActual = new Figura(punto, true, Tipo.PUNTO);
                    this.figuras.add(new Figura(punto, true, Tipo.PUNTO));//, this.getColor()));
                    break;
                case LINEA:
                    Linea linea = new Linea(p, p);
                    //this.figuraActual = new Figura(linea, false, Tipo.LINEA);
                    this.figuras.add(new Figura(linea, false, Tipo.LINEA));//, this.getColor()));
                    break;
                case RECTANGULO:
                    Rectangle rec = new Rectangle(p.x, p.y, 0, 0);
                    //this.figuraActual = new Figura(rec, this.isRelleno(), Tipo.RECTANGULO);
                    this.figuras.add(new Figura(rec, this.isRelleno(), Tipo.RECTANGULO));//, this.getColor()));
                    break;
                case OVALO:
                    Ovalo ovalo = new Ovalo(p.x, p.y, 0, 0);
                    //this.figuraActual = new Figura(ovalo, this.isRelleno(), Tipo.OVALO);
                    this.figuras.add(new Figura(ovalo, this.isRelleno(), Tipo.OVALO));//, this.getColor()));
                    break;
                case PERA:
                    Pera pera = new Pera(p.x, p.y, 100, 140);
                    this.figuras.add(new Figura(pera, this.isRelleno(), Tipo.PERA));//, this.getColor()));
            }
        }
    }
    
    public void updateShape(){ //La figura se actualiza
        if (this.isEditar()) {
            //Ahora movemos la figura seleccionada
            if (this.figuraActual != null){
                this.figuraActual.setLocation(pAnterior, p2);
                //System.out.println("Moviendo una figura de tipo " + this.figuraActual.getTipo()); //Comprobar que la detecta
            }
        }
        else {
            if (this.figuras.size() > 0) {
                this.figuraActual = this.figuras.get(this.figuras.size()-1);
                if (this.figuraActual.getFigura() instanceof Linea){
                    //Linea linea = (Linea) this.figuraActual.getFigura();
                    //linea.setLine(p, p2);
                    ((Linea) this.figuraActual.getFigura()).setLine(p, p2);
                }
                if (this.figuraActual.getFigura() instanceof Rectangle) {
                    //Rectangle rec = (Rectangle) this.figuraActual.getFigura();
                    //rec.setFrameFromDiagonal(p, p2);
                    ((Rectangle) this.figuraActual.getFigura()).setFrameFromDiagonal(p, p2);
                }
                if (this.figuraActual.getFigura() instanceof Ovalo) {
                    //Ovalo ovalo = (Ovalo) this.figuraActual.getFigura();
                    //ovalo.setFrameFromDiagonal(p, p2);
                    ((Ovalo) this.figuraActual.getFigura()).setFrameFromDiagonal(p, p2);
                }
            }
        }
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
