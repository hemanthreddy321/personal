package com.hcl.corejava;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        String temp = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            temp = temp + A.charAt(i);
        }
        if (A.equals(temp)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
