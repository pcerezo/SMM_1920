/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMM.PCS.Eventos;

/**
 *
 * @author pabloc
 */
public class LienzoAdapter implements LienzoListener{
    public LienzoAdapter() {
        super();
    }
    
    @Override
    public void figuraAdded(LienzoEvent evt) {
        System.out.println("Se ha añadido una nueva figura.");
    }
    
    @Override
    public void propertyChange(LienzoEvent evt) {
        System.out.println("Figura alterada.");
    }
}
