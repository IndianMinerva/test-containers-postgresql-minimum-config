package com.penguin.itest.example;

import com.penguin.itest.example.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItestExampleApplicationTests {


	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {

	}

}
