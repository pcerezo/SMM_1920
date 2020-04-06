/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SM.PCS.Graficos;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 *
 * @author pabloc
 */
public class Punto extends Ellipse2D.Float{
    public Punto() {
        super();
    }
    
    public Punto(float x, float y) {
        super(x, y, 5, 5);
    }
    
}
