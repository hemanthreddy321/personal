package com.hcl.corejava;

public class solution5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FirstClass objA = new FirstClass();
        SecondClass objB = new SecondClass();
        System.out.println("in main(): ");
        System.out.println("objA.a = " + objA.getFirstClass());
        System.out.println("objB.b = " + objB.getSecondClass());
        objA.setFirstClass(222);
        objB.setSecondClass(333.33);
        System.out.println("objA.a = " + objA.getFirstClass());
        System.out.println("objB.b = " + objB.getSecondClass());
    }
}

class FirstClass {
    int a = 100;

    public FirstClass() {
        System.out.println("in the constructor of class FirstClass: ");
        System.out.println("a = " + a);
        a = 333;
        System.out.println("a = " + a);
    }

    public int getFirstClass() {
        return a;
    }

    public void setFirstClass(int value) {
        a = value;
    }
} //class

class SecondClass {
    double b = 123.45;

    public SecondClass() {
        System.out.println("-----in the constructor of class B: ");
        System.out.println("b = " + b);
        b = 3.14159;
        System.out.println("b = " + b);
    }

    public double getSecondClass() {
        return b;


    }

    public void setSecondClass(double value) {
        b = value;
    }
}