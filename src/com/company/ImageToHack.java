package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

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


    //returns String with (0|1) for each pixel
    public boolean[][] ImageToBinaryArray(){
        int height = 256;
        int width = 512;
        boolean [][]output = new boolean[512][256];

        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                int test = img.getRGB(x,y);
                switch(img.getRGB(x,y)){
                    case -1: output[x][y] = false; break;
                    default: output[x][y] = true;
                }

            }
        }

        return output;

    }

    public int[][] BinaryArrayToDecimalArray(boolean[][] input){
        int[][] output = new int[256][32];
        String binaryString = "";
        int x = 0;

        for (int y = 0; y < 256; y++){
            for(int i = 0; i < 32; i++){
                binaryString = "";
                for(int j = 0; j<15;j++){
                    if(input[x][y] == true) binaryString = "1" + binaryString ;
                    else binaryString = "0" + binaryString ;
                    if((x+1)<512) x++; else x=0;

                }
                if(x+1<512) x++; else x=0;
                output[y][i] = Integer.parseInt(binaryString,2);
            }
        }

        return output;
    }

    public void writeDecimalToFile(int[][] input) throws IOException {
        File fout = new File("out.asm");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));


        int i = 16384;


        for (int y = 0; y < 256; y++){
            for (int x = 0; x < 32; x++){

                if(input[y][x]  >0){

                bw.write("@" + input[y][x]);
                bw.newLine();
                bw.write("D = A");
                bw.newLine();
                bw.write("@" + i);

                bw.newLine();
                bw.write("M = D");
                bw.newLine();}
                i++;

            }

        }

        bw.close();

    }


}
