package com.demo.services.learn;

import com.demo.services.learn.multithreading.MyThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();


        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) counter.increment();
        });

        System.out.println(counter.count);

        t1.start();
        System.out.println(counter.count);

        t2.start();
        System.out.println(counter.count);

        t1.join();
        System.out.println(counter.count);

        t2.join();

        System.out.println(counter.count);

    }

}


class Counter {
    int count = 0;

    void increment() {
        count++;
    }
}