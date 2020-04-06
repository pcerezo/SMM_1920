/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMM.PCS.Eventos;

import java.util.EventListener;

/**
 *
 * @author pabloc
 */
public interface LienzoListener extends EventListener{
    public void figuraAdded(LienzoEvent evt);
    public void propertyChange(LienzoEvent evt);
}
