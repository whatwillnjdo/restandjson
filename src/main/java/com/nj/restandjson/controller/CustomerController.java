package com.nj.restandjson.controller;

import com.nj.restandjson.model.Customer;
import com.nj.restandjson.view.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{cid}")
    public Optional<Customer> getCustomer(@PathVariable("cid") Integer cid) {
        return customerRepository.findById(cid);
    }

    @PostMapping("/customer")
    public Customer addCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }
}
