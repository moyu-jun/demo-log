package com.startdt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moyu
 */
@SpringBootApplication(scanBasePackages = {"com.startdt.simba.common", "com.startdt.demo"})
public class DemoLogApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoLogApplication.class, args);
    }
}
