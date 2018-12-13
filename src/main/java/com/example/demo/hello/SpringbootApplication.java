package com.example.demo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootApplication {

        public static void main(String[] args) {
                SpringApplication.run(SpringbootApplication.class, args);
        }
    @RestController
    public class HelloController {
        @GetMapping("/hello")
        String hello() {
            return "Hello Kubernauts!";
        }
    }
}