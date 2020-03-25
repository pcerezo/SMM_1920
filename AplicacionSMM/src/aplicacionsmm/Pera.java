/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionsmm;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author pabloc
 */
public class Pera extends Ellipse2D.Float{
    private Ellipse2D.Float c1;
    private Ellipse2D.Float c2;
    private Area a1, a2;
    private Line2D.Float rabillo;
    
    private void construir() {
        /*c1 = new Ellipse2D.Float(x, y + (float) 40/140 * this.height, this.width, (float)(100/140)*this.height); //El cuerpo de la pera
        c2 = new Ellipse2D.Float(x + (30/100)*this.width, y + (10/140)*this.height, (1/2)*this.width, (float)(45/140)*this.height);   //La cabeza de la pera
        rabillo = new Line2D.Float(x + (1/2)*this.width, (13/140)*this.height, (70/100)*this.width, y);*/
        c1 = new Ellipse2D.Float(x, y + 40, this.width, this.height);
        c2 = new Ellipse2D.Float(x + 30, y + 10, this.width / 2, this.height / 2);
        this.rabillo = new Line2D.Float(x+ this.width/2, y+ this.height/10, (float) (x + this.width/1.5), y);
        a1 = new Area(c1);
        a2 = new Area(c2);
        
        a1.add(a2);
    }
    
    public Pera() {
        this.construir();
    }
    
    public Pera(float x, float y, float ancho, float alto) {
        this.x = x;
        this.y = y;
        this.width = ancho;
        this.height = alto;
        
        this.construir();
    }
    
    public void setLocation(Point2D p) {
        
    }
    
    @Override
    public void setFrameFromDiagonal(Point2D p1, Point2D p2) {
        this.x = (float) p1.getX();
        this.y = (float) p1.getY();
        
        float dx = (float) (p1.getX() - p2.getX());
        float dy = (float) (p1.getY() - p2.getY());
        
        this.width = dx;
        this.height = dy;
        
        /*c1.setFrameFromDiagonal(x, y + (float) 40/140 * this.height, this.width, (float)(100/140)*this.height);
        c2.setFrameFromDiagonal(x + (30/100)*this.width, y + (10/140)*this.height, (45/100)*this.width, (float)(45/100)*this.height);
        rabillo.setLine(x + (1/2)*this.width, (13/140)*this.height, (70/100)*this.width, y);*/
        
        c1.setFrameFromDiagonal(x, y + 40, this.width, this.height);
        c2.setFrameFromDiagonal(x + 30, y + 10, this.width / 2, this.height / 2);
        this.rabillo.setLine(x+ this.width/2, y+ this.height/10, (float) (x + this.width/1.5), y);
        
        //Borramos las áreas antiguas
        a1.reset();
        a2.reset();
        
        a1 = new Area(c1);
        a2 = new Area(c2);
        
        a1.add(a2);
    }
    
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.fill(a1);
        g2d.draw(rabillo);
    }
}
