package io.fdlessard.codebites.customer.basic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Product implements Serializable {

    private Long id;
    private String name;
    private String sku;
    private String description;
}
