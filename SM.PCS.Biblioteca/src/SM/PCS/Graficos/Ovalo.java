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
        Point pFin = new Point((int)(pnew.x+this.width), (int)(pnew.y+this.height)); //El punto final
        //Point pIni = new Point((int)this.x, (int)this.y);
        
        this.setFrameFromDiagonal(pnew, pFin);  
    }
    /*public boolean contains(Point2D p){
        return this
    }*/
}
