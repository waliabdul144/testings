package com.demo.services.services;

import com.demo.services.threads.Multithreading;
import org.springframework.stereotype.Service;

@Service
public class Services {

    public static void multithreading() {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Multithreading object = new Multithreading();
            object.start();
        }
    }
}
