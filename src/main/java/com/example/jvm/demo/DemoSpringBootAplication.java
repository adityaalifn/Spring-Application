package com.example.jvm.demo;

import com.example.jvm.demo.entity.Car;
import com.example.jvm.demo.repository.CarRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootAplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepo carRepository){
        return args -> {
            carRepository.save(new Car("a", "a", "a", "a", 1));
            carRepository.save(new Car("a", "a", "a", "a", 1));
        };
    }
}

