/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsmm;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 *
 * @author pabloc
 */
public class Figura {
    private Shape figura;
    private boolean relleno;
    private Tipo tipo;
    private Color color;
    
    public Figura() {
        this.figura = null;
        this.relleno = false;
        this.tipo = null;
        this.color = Color.BLACK;
    }
    
    public Figura(Shape s, boolean r, Tipo t) {
        this.figura = s;
        this.relleno = r;
        this.tipo = t;
        this.color = Color.BLACK;
    }
    
    public Figura(Shape s, boolean r, Tipo t, Color c) {
        this.figura = s;
        this.relleno = r;
        this.tipo = t;
        this.color = c;
    }
    
    public Shape getFigura() { return this.figura;}
    public void setFigura(Shape s) { this.figura = s;}
    
    public boolean isRelleno() { return this.relleno;}
    public void setRelleno(boolean r) { this.relleno = r;}
    
    public Tipo getTipo() {return this.tipo;}
    
    public void setColor(Color c) { this.color = c;}
    public Color getColor() { return this.color;}
    
    public boolean contains(Point2D paux) {
        return this.figura.contains(paux);
    }
}
