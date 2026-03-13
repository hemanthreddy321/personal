package com.hcl.corejava;

public class Program3 {

    public static void main(String[] args) {
        String s = "Hcl Technologies ";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                count++;
        }
        System.out.println("Number of vowels in a string: " + count);
    }

}
