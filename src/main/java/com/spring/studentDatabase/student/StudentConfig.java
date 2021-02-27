package com.spring.studentDatabase.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "John Doe",
                    "john.doe@gmail.com",
                    LocalDate.of(1990, Month.MARCH, 25)
            );

            Student alex = new Student(
                    "Jane Doe",
                    "jane.doe@gmail.com",
                    LocalDate.of(1995, Month.JULY, 15)
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}
