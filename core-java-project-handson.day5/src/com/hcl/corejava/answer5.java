package com.hcl.corejava;

import java.util.*;

public class answer5 {

    int runs, over;
    float runRate;

    public static void main(String[] args) {
        answer5 runRateCalculator = new answer5();
        runRateCalculator.findRunRate();

    }

    public void findRunRate() {
        Scanner sc = new Scanner(System.in);
        try {
            over = 1;
            System.out.println("Enter Runs scored:\n");
            runs = sc.nextInt();
            System.out.println("Enter the total overs faced:\n " + runRate);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }
    }
}