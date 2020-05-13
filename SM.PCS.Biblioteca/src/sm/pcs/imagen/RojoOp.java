/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.pcs.imagen;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 *
 * @author pabloc
 */
public class RojoOp extends BufferedImageOpAdapter{
    private int umbral;
    
    public RojoOp(int umbral) {
        this.umbral = umbral;
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
        int[] pixelComp = new int[srcRaster.getNumBands()];
        int[] pixelCompDest = new int[srcRaster.getNumBands()];
        float media;
        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {
                srcRaster.getPixel(x, y, pixelComp);
                if (pixelComp[0] - pixelComp[1] - pixelComp[2] < this.umbral) {
                    media = (pixelComp[0]+pixelComp[1]+pixelComp[2])/3;
                    
                    for (int i = 0; i < pixelCompDest.length; i++) {
                        pixelCompDest[i] = (int)media;
                    }
                }
                else{
                    for (int i = 0; i < pixelCompDest.length; i++) {
                            pixelCompDest[i] = pixelComp[i]; //Paso los píxeles tal cual están
                        }
                }
                destRaster.setPixel(x, y, pixelCompDest);
            }
        }
    
        return dest ;
    }
    
}
