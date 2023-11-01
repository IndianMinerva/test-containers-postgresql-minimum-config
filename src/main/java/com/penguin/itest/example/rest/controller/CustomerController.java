package com.penguin.itest.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public void getAllCustomers() {

    }

    @GetMapping("/{id}")
    public void getCustomerById(@PathVariable String id) {

    }
}
