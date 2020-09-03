package com.soulrebel.hotel.reactivespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;

@SpringBootApplication(exclude = MongoDataAutoConfiguration.class)
public class ReactivespringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactivespringApplication.class, args);
    }

}
