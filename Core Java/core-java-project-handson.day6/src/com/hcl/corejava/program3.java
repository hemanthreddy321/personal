package com.hcl.corejava;

class MyRunnable implements Runnable {
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

public class program3 {


    public static void main(String[] args) {
        MyRunnable t1 = new MyRunnable();
        MyRunnable t2 = new MyRunnable();
        MyRunnable t3 = new MyRunnable();
        Thread t4 = new Thread(t1);
        Thread t5 = new Thread(t2);
        Thread t6 = new Thread(t3);
        t4.start();
        t5.start();
        t6.start();
    }
}