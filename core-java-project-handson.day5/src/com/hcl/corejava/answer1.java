package com.hcl.corejava;

import java.io.FileWriter;
import java.io.IOException;

public class answer1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("welcome to HCL:");
            fw.close();
            System.out.println("\nFile write done");
        } catch (IOException e) {
            System.out.println("There are some IOException.");
        }


    }
}     