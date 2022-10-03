package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                Student sai =  new Student(
                        "sai",
                        "sai@gmail.com",
                        LocalDate.of(2000,02,20),
                        22
                );
            Student kumar =  new Student(
                    "kumar",
                    "kumar@gmail.com",
                    LocalDate.of(2001,01,23),
                    21
            );

            repository.saveAll(List.of(sai,kumar));
        };
    }
}
