/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.pcs.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;
//import sm.image.BufferedImageOpAdapter;

/**
 *
 * @author pabloc
 */
public class PosterizarOp extends BufferedImageOpAdapter{
    private float niveles;
    
    public PosterizarOp(float niveles) {
        this.niveles = niveles;
    }

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src image is null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int sample;
        float K = 256.F/this.niveles;
       
        for(int x = 0; x < src.getWidth(); x++){
            for(int y = 0; y < src.getHeight(); y++) {
                for (int band = 0; band < src.getRaster().getNumBands(); band++){
                    sample = srcRaster.getSample(x, y, band);
                   
                    sample = (int) (K * (int)(sample/K));       
                    
                    destRaster.setSample(x, y, band, sample);
                }
            }
        }
        
        return dest;
    }
    
}
