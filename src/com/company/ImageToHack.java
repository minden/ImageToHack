package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by indenml on 30.05.15.
 */
public class ImageToHack {

    public BufferedImage img = null;

    public void readImage (String path){
        try{
            this.img = ImageIO.read(new File(path));
        } catch (IOException e){
            System.out.println("Could not find the image");
        }
    }

    public void printImageToConsole (){
        int height = img.getHeight();
        int width = img.getWidth();

        for (int y = 0; y < height; y++){
            for (int x = 0; x <width; x++){
                System.out.println(img.getRGB(x,y));
            }
        }
    }
    //returns String with (0|1) for each pixel
    public boolean[][] ImageToBinary(){
        int height = img.getHeight();
        int width = img.getWidth();
        boolean [][]output = new boolean[512][256];

        for (int y = 0; y < height; y++){
            for (int x = 0; x <width; x++){
                int test = img.getRGB(x,y);
                switch(img.getRGB(x,y)){
                    case -1: output[x][y] = false; break;
                    default: output[x][y] = true;
                }

            }
        }

        return output;

    }


}
