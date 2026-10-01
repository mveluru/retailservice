package org.brite.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.brite.retail")
public class RetailServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetailServiceApplication.class, args);
    }

}
