package com.haiyang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMian {
    public static void main(String[] args) {
        SpringApplication.run(AppMian.class, args);
        System.out.println("server start");
    }
}
