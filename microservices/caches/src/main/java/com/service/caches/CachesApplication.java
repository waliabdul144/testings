package com.service.caches;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachesApplication {
    public static void main(String[] args) {
        SpringApplication.run(CachesApplication.class, args);
    }
}