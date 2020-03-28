/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsmm;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.math.*;
import java.util.ArrayList;
import java.util.Map;
import sun.java2d.pipe.RenderingEngine;

/**
 *
 * @author pablo
 */
public class Lienzo extends javax.swing.JPanel {
    private Color color = Color.black;
    private boolean relleno;
    private boolean editar;
    private Point p = new Point (-10, -10);
    private Point p2 = new Point (-10, -10);
    private Herramienta herramienta = Herramienta.LAPIZ; //Por defecto, lápiz
    private ArrayList<Figura> figuras;
    private Figura figuraActual;
    private String tipoFuente;
    private boolean ventanaActiva;
    private Ellipse2D ventana;
    //private Pera pera;
    
    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        initComponents();
        this.figuras = new ArrayList();
        this.figuraActual = new Figura();
        this.relleno = false;
        this.editar = false;
        this.tipoFuente = "aakar";
        this.ventana = new Ellipse2D.Float(0,0,500,500);
        //this.pera = new Pera();
    }
    
    @Override
    public void paint(Graphics g) {
        //Se sobrecarga
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        //Usar switch o if-else para comparar con el enumerado la herramienta que esté activa
        //Consultar si está seleccionado el relleno o no
        //g2d.setColor(this.color);
        if (this.ventanaActiva) {
            g2d.setClip(this.ventana);
        }
        else{
            this.setAtributos(g2d);
        }
        
        for (Figura f: this.figuras) {
            g2d.setColor(f.getColor());
            if (f.getTipo() == Tipo.PERA) {
                Pera pera = (Pera) f.getFigura();
                pera.paint(g);
            }
            else {
                if (f.isRelleno()) {
                    g2d.fill(f.getFigura());
                }
                else {
                    g2d.draw(f.getFigura());
                }
            }
        }
        
        //this.pera.paint(g);
        
        System.out.println("Herramienta: " + this.getHerramienta());
        //g.drawLine(20, 20, 200, 200);
        //g.fillOval(p.x-15, p.y-15, 20, 20);
        
    }
    
    private void setAtributos(Graphics2D g2d) {
        Stroke trazo;
        float patronDiscontinuidad[] = {15.0f, 15.0f};
        trazo = new BasicStroke(10.0f, BasicStroke.JOIN_ROUND, BasicStroke.CAP_SQUARE, 5.0f, patronDiscontinuidad, 2.0f);
        //g2d.setStroke(trazo);
        
        Paint r = new Color(255, 100, 0);
        Point paux1 = new Point(200,200), paux2 = new Point(600, 600);
        r = new GradientPaint(paux1, Color.BLUE, paux2, Color.RED);
        g2d.setPaint(r);
        
        Composite comp;
        comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        g2d.setComposite(comp);
        
        Rectangle rec = new Rectangle(30, 30, 80, 80);
        /*g2d.draw(rec);
        
        AffineTransform trans = new AffineTransform();//g2d.getTransform();
        trans.setToIdentity();
        trans.translate(rec.getCenterX(),rec.getCenterY());
        trans.scale(0.5,0.5);
        trans.translate(-rec.getCenterX(),-rec.getCenterY());
        g2d.setTransform(trans);
        g2d.draw(rec);*/
        
        Font fuente;
        fuente = new Font(this.tipoFuente, Font.BOLD | Font.ITALIC, 45);
        Map atributos = fuente.getAttributes();
        atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        g2d.setFont(new Font(atributos));
        //g2d.drawString("Hola", 200, 220);
        
        g2d.drawString("Texto renderizado", 200, 220);
        RenderingHints render;
        render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(render);
        g2d.drawString("Texto sin renderizar", 200, 420);
        
        Shape clip;
        
        this.repaint();
    }
    
    public void setVentanaActiva(boolean activada) {
        this.ventanaActiva = activada;
    }
    
    public boolean isVentanaActiva() {
        return this.ventanaActiva;
    }
    
    public void setTipoFuente(String tipo) {
        this.tipoFuente = tipo;
    }
    
    public String getTipoFuente() {
        return this.tipoFuente;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }
    

    public void setRelleno(boolean marcado) {
        this.relleno = marcado;
    }
    
    public boolean isEditar() {
        return this.editar;
    }
    
    public void setEditar(boolean e) {
        this.editar = e;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
    
    public void setP2(Point p) {
        this.p2 = p;
    }
    
    public Point getP2(Point p) {
        return this.p2;
    }
    
    public void setHerramienta(Herramienta h) {
        this.herramienta = h;
    }
    
    public Herramienta getHerramienta() {
        return this.herramienta;
    }
    
    public Figura getFiguraSeleccionada(Point paux) {
        for (Figura f: figuras) {
            if (f.contains(paux)) {
                System.out.println("Figura seleccionada: " + f.getTipo()); //Comprobando que detecta
                return f;
            }
        }
        
        return null;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (this.herramienta == Herramienta.LAPIZ) {
            p = evt.getPoint();
            this.repaint();
        }        
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        p = evt.getPoint();
        
        if (this.isEditar()) {
            this.figuraActual = this.getFiguraSeleccionada(p); //Obtenemos la figura que seleccionamos
        }
        else {
            switch(this.herramienta) {
                case LAPIZ:
                    Ellipse2D.Float punto = new Ellipse2D.Float(p.x, p.y, 5, 5);
                    //this.figuraActual = new Figura(punto, true, Tipo.PUNTO);
                    this.figuras.add(new Figura(punto, true, Tipo.PUNTO, this.getColor()));
                    break;
                case LINEA:
                    Linea linea = new Linea(p, p);
                    //this.figuraActual = new Figura(linea, false, Tipo.LINEA);
                    this.figuras.add(new Figura(linea, false, Tipo.LINEA, this.getColor()));
                    break;
                case RECTANGULO:
                    Rectangle rec = new Rectangle(p.x, p.y, 0, 0);
                    //this.figuraActual = new Figura(rec, this.isRelleno(), Tipo.RECTANGULO);
                    this.figuras.add(new Figura(rec, this.isRelleno(), Tipo.RECTANGULO, this.getColor()));
                    break;
                case OVALO:
                    Ovalo ovalo = new Ovalo(p.x, p.y, 0, 0);
                    //this.figuraActual = new Figura(ovalo, this.isRelleno(), Tipo.OVALO);
                    this.figuras.add(new Figura(ovalo, this.isRelleno(), Tipo.OVALO, this.getColor()));
                    break;
                case PERA:
                    Pera pera = new Pera(p.x, p.y, 100, 140);
                    this.figuras.add(new Figura(pera, this.isRelleno(), Tipo.PERA, this.getColor()));
            }
        }
        
        //p2 = p;
        this.repaint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        /*p2 = evt.getPoint();
        this.repaint();*/
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        p2 = evt.getPoint();
        
        if (this.isEditar()) {
            //Ahora movemos la figura seleccionada
            if (this.figuraActual != null){
                this.figuraActual.setLocation(p2);
                System.out.println("Moviendo una figura de tipo " + this.figuraActual.getTipo()); //Comprobar que la detecta
            }
        }
        else {
            if (this.figuras.size() > 0) {
                this.figuraActual = this.figuras.get(this.figuras.size()-1);
                switch (this.figuraActual.getTipo()) {
                    case LINEA:
                        Linea linea = (Linea) this.figuraActual.getFigura();
                        linea.setLine(p, p2);
                        break;
                    case RECTANGULO:
                        Rectangle rec = (Rectangle) this.figuraActual.getFigura();
                        rec.setFrameFromDiagonal(p, p2);
                        break;
                    case OVALO:
                        Ovalo ovalo = (Ovalo) this.figuraActual.getFigura();
                        ovalo.setFrameFromDiagonal(p, p2);
                        break;
                    /*case PERA:
                        Pera p = (Pera) this.figuraActual.getFigura();
                        p.setFrameFromDiagonal(this.p, this.p2);
                        break;*/
                }
            }
        }
        
        this.repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if (this.ventanaActiva) {
            Point esquina = new Point(evt.getX()+(int)this.ventana.getWidth()/2, evt.getY()+(int)this.ventana.getHeight()/2);
            this.ventana.setFrameFromCenter(evt.getPoint(), esquina);
            this.repaint();
        }
    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
