package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
    }

    public Customer getCustomerById(long id) {

        log.debug("CustomerServiceImpl.get({})", id);
        pause(1);
        return buildCustomer(id);
    }

    public List<Customer> geAllCustomers() {

        log.debug("CustomerController.getAll()");

        return Arrays.asList(
                buildCustomer(0L),
                buildCustomer(1L),
                buildCustomer(2L)
        );
    }

    private void pause(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);

        } catch (Exception e) {

        }

    }

    private Customer buildCustomer(Long id) {
        return Customer.builder()
                .id(id)
                .lastName("lastName" + id)
                .firstName("firstName" + id)
                .company("company" + id)
                .addressId(id + 1)
                .productId(id + 2)
                .build();
    }


}
