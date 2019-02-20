package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
    }

    public Customer getCustomerById(long id) {

        log.debug("CustomerServiceImpl.get({})", id);
        return new Customer(id, "lastName" + id, "firstName" + id, "company" + id);
    }

    public List<Customer> geAllCustomers() {

        log.debug("CustomerController.getAll()");

        return Arrays.asList(
                new Customer(0L, "lastName" + 0, "firstName" + 0, "company" + 0),
                new Customer(1L, "lastName" + 1, "firstName" + 1, "company" + 1),
                new Customer(2L, "lastName" + 2, "firstName" + 2, "company" + 2)
        );
    }


}
