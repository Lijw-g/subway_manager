package com.subway.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.subway.manager"})
@EnableSwagger2
public class ManagerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ManagerApplication.class, args);
    }

}
