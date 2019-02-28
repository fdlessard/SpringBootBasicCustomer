package io.fdlessard.codebites.customer.basic.services;


import io.fdlessard.codebites.customer.basic.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
    }

    public Product getProductById(long id) {

        log.debug("ProductServiceImpl.get({})", id);
        return buildProduct(id);
    }

    public List<Product> geAllProducts() {

        log.debug("ProductServiceImpl.getAll()");

        return Arrays.asList(
                buildProduct(0L),
                buildProduct(1L),
                buildProduct(2L)
        );
    }

    private Product buildProduct(Long id) {
        return Product.builder()
                .id(id)
                .name("name" + id)
                .sku("sku" + id)
                .description("description" + id)
                .build();
    }
}
