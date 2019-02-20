package io.fdlessard.codebites.customer.basic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Address implements Serializable {

    private Long id;
    private String number;
    private String street;
    private String city;
    private String postalCode;
    private String province;
    private String country;

}
