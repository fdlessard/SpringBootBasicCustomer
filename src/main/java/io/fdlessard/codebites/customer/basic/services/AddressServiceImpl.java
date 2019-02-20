package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Address;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class AddressServiceImpl implements AddressService {


    public AddressServiceImpl() {
    }

    public Address getAddressById(Long id) {

        log.debug("AddressServiceImpl.getAddressById({})", id);

        return Address.builder()
                .id(id)
                .number("number" + id)
                .street("street" + id)
                .city("city" + id)
                .postalCode("postalCode" + id)
                .province("province")
                .country("country" + id)
                .build();

    }


    public List<Address> geAllAddresses() {

        log.debug("AddressServiceImpl.geAllAddresses()");

        List<Address> addresses = new ArrayList<>();
        addresses.add(buildAddress(0L));
        addresses.add(buildAddress(1L));
        addresses.add(buildAddress(2L));

        return addresses;

    }

    private Address buildAddress(Long id) {
        return  Address.builder()
                .id(id)
                .number("number" + id)
                .street("street" + id)
                .city("city" + id)
                .postalCode("postalCode" + id)
                .province("province")
                .country("country" + id)
                .build();
    }

}
