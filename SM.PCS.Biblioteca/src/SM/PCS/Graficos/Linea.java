/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.PCS.Graficos;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author pabloc
 */
public class Linea extends Line2D.Float{
    public Linea() {
        super();
    }
    
    public Linea(float x1, float y1, float x2, float y2) {
        super(x1, y1, x2, y2);
    }
    
    public Linea(Point2D p1, Point2D p2) {
        super(p1, p2);
    }
    
    @Override
    public boolean contains(Point2D p) {
        return this.isNear(p);
    }
    
    public boolean isNear(Point2D p) {
        return this.ptLineDist(p) <= 2;
    }
    
    
}
