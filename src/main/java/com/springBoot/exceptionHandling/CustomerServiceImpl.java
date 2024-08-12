package com.springBoot.exceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CustomerServiceImpl
        implements CustomerService {

    @Autowired
    private CustomerRepository customerRespository;

    // Method to get customer by Id.Throws
    // NoSuchElementException for invalid Id
        public Customer getCustomer(Long id)
    {

        Customer customer=  customerRespository.findById(id);
        if (customer == null) {
            throw  new NoSuchElementException(
                    "NO CUSTOMER PRESENT WITH ID = " + id);
        }else {
            return customer;
        }
    }

    // Method to add new customer details to database.Throws
    // CustomerAlreadyExistsException when customer detail
    // already exist
    public String addCustomer(Customer customer)
    {
        Customer existingCustomer
                = customerRespository.findById(customer.getId());
        if (existingCustomer == null) {
            customerRespository.save(customer);
            return "Customer added successfully";
        }
        else
            throw new CustomerAlreadyExistsException(
                    "Customer already exists!!");
    }

    // Method to update customer details to database.Throws
    // NoSuchCustomerExistsException when customer doesn't
    // already exist in database
    public String updateCustomer(Customer customer)
    {
        Customer existingCustomer
                = customerRespository.findById(customer.getId());
        if (existingCustomer == null)
            throw new NoSuchCustomerExistsException(
                    "No Such Customer exists!!");
        else {
            existingCustomer.setName(customer.getName());
            existingCustomer.setAddress(
                    customer.getAddress());
            customerRespository.save(existingCustomer);
            return "Record updated Successfully";
        }
    }
}
