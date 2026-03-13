package com.hcl.corejava;


public class program2 {


    public static void main(String[] args) {
// TODO Auto-generated method stub
        SleepThread1 thread_1 = new SleepThread1();
        SleepThread1 thread_2 = new SleepThread1();
        thread_1.start();
        thread_2.start();


    }


}

class SleepThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " :+i");
        }
    }


}