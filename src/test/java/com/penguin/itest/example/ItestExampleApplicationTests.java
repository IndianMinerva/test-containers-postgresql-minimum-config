package com.penguin.itest.example;

import com.penguin.itest.example.entity.Customer;
import com.penguin.itest.example.repository.CustomerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ItestExampleApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void contextLoads() {
        Assertions.assertFalse(customerRepository.findAll().iterator().hasNext());
        customerRepository.save(new Customer(null, "One"));
        Assertions.assertTrue(customerRepository.findAll().iterator().hasNext());
        customerRepository.deleteAll();
    }

}
