package io.fdlessard.codebites.customer.basic.controllers;


import io.fdlessard.codebites.customer.basic.model.Address;
import io.fdlessard.codebites.customer.basic.services.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/addresses")
public class AddressController {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/isAlive", produces = "application/json")
    public String isAlive() {
        log.info("AddressController.isAlive()");
        return "Hello World from AddressController";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public Address get(@PathVariable long id) {
        log.info("AddressController.get({})", id);
        return addressService.getAddressById(id);
    }

    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public Iterable<Address> getAll() {
        log.debug("AddressController.getAll()");
        return addressService.geAllAddresses();
    }

}
