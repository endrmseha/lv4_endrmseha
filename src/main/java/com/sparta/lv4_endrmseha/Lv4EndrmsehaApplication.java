package com.sparta.lv4_endrmseha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Lv4EndrmsehaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lv4EndrmsehaApplication.class, args);
    }

}
