package com.hcl.corejava;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
                sum = sum + rem;
            }
            n = n / 10;
        }

        if (sum % 2 == 0) {
            System.out.println("Sum of odd digits is even");
        } else {
            System.out.println("Sum of odd digits is odd");
        }
    }

}
