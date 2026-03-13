package com.hcl.corejava;


public class program5 {


    public static void main(String[] args) {
        Runnable r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
        Runnable r3 = new Runnable3();
        Thread t3 = new Thread(r3);
        t3.start();


    }


}

class Runnable1 implements Runnable {
    int n1 = 5;

    public void run() {
        System.out.println("multiples of 5 :");
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n1);
        }
    }
}

class Runnable2 implements Runnable {
    int n2 = 7;

    public void run() {
        System.out.println("multiples of 7 :");
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n2);
        }
    }
}

class Runnable3 implements Runnable {
    int n3 = 9;

    public void run() {
        System.out.println("multiples of 9 :");
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n3);
        }
    }
}