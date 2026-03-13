package com.hcl.corejava;

import java.util.*;

public class MyCalculator {
    public static int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should be zero");
        } else {
            return ((int) Math.pow(n, p));
        }


    }


}