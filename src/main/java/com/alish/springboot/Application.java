package com.alish.springboot;

import com.fasterxml.jackson.core.JsonPointer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        System.out.println("pass ::: " + new BCryptPasswordEncoder().encode("123"));
        SpringApplication.run(Application.class, args);
    }

}
