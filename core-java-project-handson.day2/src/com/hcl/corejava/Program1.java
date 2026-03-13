package com.hcl.corejava;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = in.nextDouble();
        System.out.println("Input the second number: ");
        double y = in.nextDouble();
        System.out.println("Input the third number: ");
        double z = in.nextDouble();
        System.out.println("The smallest number is" + smallest(x, y, z) + "\n");
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }
}
