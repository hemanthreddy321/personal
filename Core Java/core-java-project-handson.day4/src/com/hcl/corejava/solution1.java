package com.hcl.corejava;

import java.util.Scanner;


public class solution1 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Circle\nSquare\nRectangle\nEnter the Shape name : ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals("Circle")) {
            System.out.println("Enter the radius :");
            int r = sc.nextInt();
            Circle c = new Circle(name, r);
            c.setRadius(r);
            System.out.printf("Area of circle = %.2f  ", c.CalculatedArea());
        }
        if (name.equals("Square")) {
            System.out.println("Enter side value");
            int side = sc.nextInt();
            Square sq = new Square(name, side);
            sq.setSide(side);
            System.out.println("Area of Square = " + sq.CalculatedArea());

        }
        if (name.equals("Rectangle")) {
            System.out.println("Enter Length value");
            int l = sc.nextInt();
            System.out.println("Enter Breadth value");
            int b = sc.nextInt();
            Rectangle r = new Rectangle(name, l, b);
            r.setLength(l);
            r.setBreadth(b);
            System.out.println("Area of Rectangle = " + r.CalculatedArea());
        }


    }


}