package com.hcl.corejava;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(display(s));
    }

    public static String display(String s) {
        StringBuffer sb = new StringBuffer();
        char a = s.charAt(0);
        char b = s.charAt(1);
        if (a != 'j' && b != 'b')
            sb.append(s.substring(2));
        else if (a == 'j' && b != 'b')
            sb.append("j").append(s.substring(2));
        else if (a != 'j' && b == 'b')
            sb.append(s.substring(1));
        else
            sb.append(s.substring(0));
        return sb.toString();

    }

}
