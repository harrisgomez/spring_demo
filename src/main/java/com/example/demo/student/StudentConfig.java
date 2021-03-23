package com.example.demo.student;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student djangus = new Student(
                "Djangus",
                "Djangus@gmail.com",
                LocalDate.of(2000, JANUARY, 5),
                21
            );

            Student roundstone = new Student(
                "Roundstone",
                "Roundstone@gmail.com",
                LocalDate.of(2004, FEBRUARY, 6),
                17
            );

            repository.saveAll(
                List.of(djangus, roundstone)
            );
        };
    }
}
