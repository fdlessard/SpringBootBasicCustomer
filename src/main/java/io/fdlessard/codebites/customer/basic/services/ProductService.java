package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(long id);

    List<Product> geAllProducts();
}


