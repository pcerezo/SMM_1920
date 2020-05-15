/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author pabloc
 */
public class ContrasteCellRender implements ListCellRenderer<String>{

    @Override
    public Component getListCellRendererComponent(JList<? extends String> jlist, String e, int i, boolean bln, boolean bln1) {
        PanelContraste panel = new PanelContraste(e);
        return panel;
    }

    
    
}
