package com.traddis.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student mary = new Student(
              "Mary",
              "maryhadalittlelamb@gmail.com",
              LocalDate.of(2000, JANUARY,5)
            );

            Student alex = new Student(
                    "Alex",
                    "alexlexus@gmail.com",
                    LocalDate.of(2002, APRIL,20)
            );
            repository.saveAll(
                    List.of(mary,alex)
            );
        };
    }
}
