package io.fdlessard.codebites.customer.basic.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {

    private CustomerService customerService;

    @BeforeEach
    void init() {
        customerService = new CustomerServiceImpl();
    }

    @Test
    void getCustomerById() {
        System.out.println("TEST");
        assertEquals(Long.valueOf(0),  customerService.getCustomerById(0).getId());
    }

    @Test
    void geAllCustomers() {
        System.out.println(MediaType.APPLICATION_JSON);
    }
}