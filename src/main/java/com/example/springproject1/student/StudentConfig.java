package com.example.springproject1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam= new Student(
                            "Mariam",
                            "ma@gmail.com",
                            LocalDate.of(2000, Month.DECEMBER,8)
            );
            Student alex= new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2008, Month.MARCH,8)
            );
            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
