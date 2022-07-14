package com.aster.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class DataGet {
    public static void main(String[] args) {
        SpringApplication.run(DataGet.class, args);
    }
}
