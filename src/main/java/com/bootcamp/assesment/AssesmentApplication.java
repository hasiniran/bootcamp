package com.bootcamp.assesment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bootcamp"})
public class AssesmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssesmentApplication.class, args);
    }

}
