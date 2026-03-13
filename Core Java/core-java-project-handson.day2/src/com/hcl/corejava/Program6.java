package com.hcl.corejava;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        Addition(num1, num2, num3, num4, num5, num6);
    }

    private static void Addition(int num1, int num2, int num3, int num4, int num5, int num6) {
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + (num1 + num2 + num3));
        System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "+" + num5 + "=" + (num1 + num2 + num3 + num4 + num5));
        System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "+" + num5 + "+" + num6 + "=" + (num1 + num2 + num3 + num4 + num5 + num6));

    }
}
