package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Address;

import java.util.List;

public interface AddressService {

    Address getAddressById(Long id);
    List<Address> geAllAddresses();
}


