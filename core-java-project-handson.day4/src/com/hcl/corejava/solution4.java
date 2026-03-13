package com.hcl.corejava;

public class solution4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        class A {
            private int a = 100;

            public int getA() {
                return a;
            }

            public void setA(int value) {
                a = value;
            }
        }
        A objA = new A();
        System.out.println("in main(): ");
        System.out.println("objA.a = " + objA.a);
        objA.a = 222;


    }
}