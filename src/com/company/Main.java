package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*Check if all arguments are given*/
        if (args.length < 3) {
            System.out.println("Please specify an input image file, a parameter for the output format, and an output file.");
            System.exit(1);
        }

        //Check if second parameter is legal
        if(!(args[1].toString().equals("asm") || args[1].toString().equals("hack"))) {
            System.out.println("Not a correct parameter for the output file format (asm|hack): " + args[1]);
            System.exit(1);
        }


	    ImageToHack ith = new ImageToHack();

        /* Load Image */
        ith.readImage(args[0]);
        System.out.println("Image file successfully loaded");

        /* Build two dimensional boolean array of pictures */
        boolean [][]bol = ith.ImageToBinaryArray();
        System.out.println("Image successfully transfered to boolean array");

        /* Translate each 16 bit boolean block to one dual number as a String */
        String[][] zeroAndOneStringArray = ith.BooleanArrayToDualArray(bol);
        System.out.println("Binary array successfully transformed to decimals");

        if (args[1].toString().equals("asm")) {

            /* Write the decimal Array and the hack instructions to a file*/
            ith.writeASMFile(zeroAndOneStringArray, args[2]);
            System.out.println("Assembler file successfully written to file system");
        }

        else if(args[1].toString().equals("hack")){

            /* Write the decimal Array and the hack instructions to a file*/
            ith.writeHACKFile(zeroAndOneStringArray, args[2]);
            System.out.println("Hack file successfully written to file system");

        }

    }

}
