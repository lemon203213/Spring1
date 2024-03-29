package com.example.week03springhwk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Week03springhwkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week03springhwkApplication.class, args);
    }

}
