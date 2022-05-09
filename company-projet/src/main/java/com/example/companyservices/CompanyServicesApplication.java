package com.example.companyservices;

import com.example.companyservices.DAO.CompanyRepository;
import com.example.companyservices.Entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CompanyServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyServicesApplication.class, args);
    }

    //on utilise cette méthode pour pouvoir injecter les donnees dans la mémoire h2
    @Bean
    CommandLineRunner start(CompanyRepository companyRepository) {
        return args -> {
            Stream.of("A","B","C").forEach(cn ->{
                companyRepository.save(new Company(null,cn,100+Math.random()*900));
            });
            companyRepository.findAll().forEach(System.out::println);
        };
    }
}


