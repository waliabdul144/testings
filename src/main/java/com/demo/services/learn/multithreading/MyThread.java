package com.demo.services.learn.multithreading;

public class MyThread extends Thread {
    private static MyThread myThread;

    public static MyThread getInstance() {
        if (myThread == null) {
            synchronized (MyThread.class) {
                if (myThread == null) {
                    myThread = new MyThread();
                }
            }
        }
        return myThread;
    }
    int count = 0;
    public void run() {

//        System.out.println(Thread.currentThread().getName() + " is starting.");
//        try {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread().getName() + " is running: " + i);
//                Thread.sleep(500); // Simulate some work
//            }
//        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName() + " was interrupted.");
//        }
//        System.out.println(Thread.currentThread().getName() + " has finished.");


        count++;
        System.out.println("Count value for " + Thread.currentThread().getName() + " : " + count);
    }
}
