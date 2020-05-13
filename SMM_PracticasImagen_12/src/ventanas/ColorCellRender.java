/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author pabloc
 */
public class ColorCellRender implements ListCellRenderer<Color>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Color> jlist, Color e, int i, boolean bln, boolean bln1) {
//        JButton b = new JButton();
//        b.setBackground(e);
//        b.setPreferredSize(new Dimension(25, 25));

        PanelColor panel = new PanelColor(e);
        return panel;
    }
    
}
