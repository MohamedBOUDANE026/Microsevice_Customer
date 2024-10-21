package org.ma.customerservice.services;

import org.ma.customerservice.Dao.entities.Customer;
import org.ma.customerservice.Dao.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class CustomerDataServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDataServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("X").email("X@gmail.com").build());
            customerRepository.save(Customer.builder().name("Y").email("Y@gmail.com").build());
        };
    }
}
