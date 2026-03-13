package com.hcl.corejava;

import java.util.*;

public class answer2 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the integers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int data = num1 / num2;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


    }


}