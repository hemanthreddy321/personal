package com.hcl.corejava;


class MyRunnable1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2);
                System.out.println("running child Thread in loop:" + i);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }


}

public class program4 {


    public static void main(String[] args) {
        MyRunnable1 t1 = new MyRunnable1();
        MyRunnable1 t2 = new MyRunnable1();
        MyRunnable1 t3 = new MyRunnable1();
        Thread t4 = new Thread(t1);
        Thread t5 = new Thread(t2);
        Thread t6 = new Thread(t3);
        t4.start();
        t5.start();
        t6.start();
    }
}