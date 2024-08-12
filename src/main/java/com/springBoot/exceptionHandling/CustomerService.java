package com.springBoot.exceptionHandling;

public interface CustomerService {

    Customer getCustomer(Long id);

    String addCustomer(Customer customer);

    // Method to update details of a Customer
    String updateCustomer(Customer customer);
}
