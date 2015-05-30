package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printWorkingDir(){

        String current = null;
        try {
            current = new java.io.File( "." ).getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Current dir:"+current);
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);

    }
}
