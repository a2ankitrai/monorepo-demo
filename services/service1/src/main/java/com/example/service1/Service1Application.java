package com.example.service1;

import com.example.lib1.Helper1;
import com.example.lib2.Helper2;
import com.example.lib3.Helper3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service1Application {

    @GetMapping("/")
    public String home() {

        System.out.println(Helper1.sayHi());
        System.out.println(Helper2.sayHello());
        System.out.println(Helper3.sayYo());

        return "hello from Service1";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }

}
