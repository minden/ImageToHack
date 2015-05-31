package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


	    ImageToHack ith = new ImageToHack();

        /* Load Image */
        ith.readImage("FullSizeTestImage.jpg");

        /* Build two dimensional boolean array of pictures */
        boolean [][]bol = ith.ImageToBinaryArray();

        /* Translate each 15+1 bit boolean block to one decimal number */
        int[][] finish = ith.BinaryArrayToDecimalArray(bol);

        /* Write the decimal Array and the hack instructions to a file*/
        ith.writeDecimalToFile(finish);
    }

}
