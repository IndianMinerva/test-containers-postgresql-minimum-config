package com.penguin.itest.example.repository;

import com.penguin.itest.example.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
