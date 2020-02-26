package com.lrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication 注解标明此类为springboot 启动类
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        //此语句启动springboot
        SpringApplication.run(App.class,args);
    }
}
