/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsmm;

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
    
    public void setLocation(Point2D pnew) {
        Point2D pFin = new Point2D.Float((float)pnew.getX()+this.width, (float)pnew.getY()+this.height); //El punto final
        
        this.setFrameFromDiagonal(pnew, pFin);
    }
    /*public boolean contains(Point2D p){
        return this
    }*/
}
