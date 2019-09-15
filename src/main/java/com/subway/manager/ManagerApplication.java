package com.subway.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.subway.manager"}
)

public class ManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ManagerApplication.class, args);
    }

}
