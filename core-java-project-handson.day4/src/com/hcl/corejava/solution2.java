package com.hcl.corejava;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}


public class solution2 {


    public static void main(String[] args) {
        System.out.println("Enter r n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MyCalculator c = new MyCalculator();
        System.out.println(c.divisor_sum(n) + "\n");
    }
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum1 = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                sum1 = sum1 + i;
            }
        }
        return sum1;
    }
}