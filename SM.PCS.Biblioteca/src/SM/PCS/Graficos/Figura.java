/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.PCS.Graficos;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author pabloc
 */
public class Figura { //Clase que distingue los distintos tipos de figuras y en función de ello accede a los métodos correspondientes
    private Shape figura;
    //private boolean relleno;
    private Color color;
    
    public Figura() {
        this.figura = new Ellipse2D.Float(0,0,0,0);
        //this.relleno = false;
        //this.tipo = null;
        this.color = Color.BLACK;
    }
    
    public Figura(Shape s, boolean r, Tipo t) {
        this.figura = s;
        //this.relleno = r;
        //this.tipo = t;
        this.color = Color.BLACK;
    }
    
    public Figura(Shape s, boolean r, Tipo t, Color c) {
        this.figura = s;
        //this.relleno = r;
        //this.tipo = t;
        this.color = c;
    }
    
    public Shape getFigura() { return this.figura;}
    public void setFigura(Shape s) { this.figura = s;}
    
    //public boolean isRelleno() { return this.relleno;}
    //public void setRelleno(boolean r) { this.relleno = r;}
    
    //public Tipo getTipo() {return this.tipo;}
    
    public void setColor(Color c) { this.color = c;}
    public Color getColor() { return this.color;}
    
    public boolean contains(Point2D paux) {
        /*switch (this.getTipo()) {
            case LINEA:
                Linea linea = (Linea) this.figura;
                linea.contains(paux);
                break;
            
        }*/
        
        return this.figura.contains(paux);
    }
    
    public void setLocation(Point pAnterior, Point pnew) {
        if (this.getFigura() instanceof Linea) {
            
            int ancho = (int) pnew.getX() - (int) ((Linea) this.figura).getX1();
            int alto = (int) pnew.getY() - (int) ((Linea) this.figura).getY1();

            ((Linea) this.figura).setLine(pnew.getX(), pnew.getY(), ((Linea) this.figura).getX2()+ancho, ((Linea) this.figura).getY2()+alto);
        }
        else if(this.getFigura() instanceof Rectangle){
            ((Rectangle) this.figura).setLocation((Point) pnew);
        }
        else if (this.getFigura() instanceof Ovalo) {    
            int dx = (int) (pnew.x - pAnterior.x);
            int dy = (int) (pnew.y - pAnterior.y);
            System.out.println("dx: " + dx);
            System.out.println("dy: " + dy);
            System.out.println("x antes: " + pAnterior.x);
            System.out.println("y antes: " + pAnterior.y);
            System.out.println("pnew.x: " + pnew.x);
            System.out.println("pnew.y: " + pnew.y);
            ((Ovalo) this.figura).setLocation(pnew);
        }
    }
    
    public Point getPos() {
        int x, y;
        Point pos = null;
        if (this.getFigura() instanceof Linea) {
            pos = new Point((int)((Linea) this.figura).getX1(), (int)((Linea) this.figura).getX2());
        }
        else if (this.getFigura() instanceof Rectangle) {
            pos = new Point((int)((Rectangle) this.figura).getX(), (int) ((Rectangle) this.figura).getY());
        }
        else if (this.getFigura() instanceof Ovalo){
            x = (int)((Ovalo) this.figura).getX();
            y = (int) ((Ovalo)this.figura).getY();
            pos = new Point(x, y);
        }
                
        return pos;
    }
}
