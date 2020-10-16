package com.emts.books.Bookstore.service;

import com.emts.books.Bookstore.model.Customer;
import com.emts.books.Bookstore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findCustomers()
    {
       return  customerRepository.findAll();
    }

    public void deleteById(Long id)
    {
        customerRepository.deleteById(id);

    }
}
