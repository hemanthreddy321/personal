package com.hcl.corejava;

public class program1 {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        SleepThread thread_1 = new SleepThread();
        SleepThread thread_2 = new SleepThread();
        thread_1.start();
        thread_2.start();
    }
}

class SleepThread extends Thread {
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " :+i");
        }
    }
}