package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomerById(long id);
    List<Customer> geAllCustomers();
}


