/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.PCS.Graficos;

import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 *
 * @author pabloc
 */
public class Ovalo extends Ellipse2D.Float{
    public Ovalo() {
        super();
    }
    
    public Ovalo(float x, float y, float ancho, float alto) {
        super(x, y, ancho, alto);
    }
    
    public void setLocation(Point pnew) {
        int dx = (int) (pnew.x - this.getX());
        int dy = (int) (pnew.y - this.getY());
        
        
        System.out.println("Antes x: " + this.x);
        System.out.println("Antes y: " + this.y);
        this.x = this.x + dx;
        this.y = this.y + dy;
        //System.out.println("dx: " + dx);
        //System.out.println("dy: " + dy);
        
        System.out.println("Después x: " + this.x);
        System.out.println("Después y: " + this.y);
        
        Point pFin = new Point((int)(this.x+this.width), (int)(this.y+this.height)); //El punto final
        Point pIni = new Point((int)this.x, (int)this.y);
        
        this.setFrameFromDiagonal(pIni, pFin);
        
    }
    /*public boolean contains(Point2D p){
        return this
    }*/
}
