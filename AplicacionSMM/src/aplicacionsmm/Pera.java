/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsmm;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 *
 * @author pabloc
 */
public class Pera extends Applet{
    private Ellipse2D.Float c1;
    private Ellipse2D.Float c2;
    private Area a1, a2;
    private Line2D.Float rabillo;
    
    private float x1, y1;
    
    private float x2, y2;
    
    public Pera() {
        c1 = new Ellipse2D.Float(55, 60, 100, 100); //El cuerpo de la pera
        c2 = new Ellipse2D.Float(85, 30, 45, 45);   //La cabeza de la pera
        rabillo = new Line2D.Float(105, 33, 125, 20);
        a1 = new Area(c1);
        a2 = new Area(c2);
        
        a1.add(a2);
    }
    
    public Pera(float x, float y, float ancho, float alto) {
    
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.fill(a1);
        g2d.draw(rabillo);
    }
}
