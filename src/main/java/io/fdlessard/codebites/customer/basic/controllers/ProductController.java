package io.fdlessard.codebites.customer.basic.controllers;


import io.fdlessard.codebites.customer.basic.model.Product;
import io.fdlessard.codebites.customer.basic.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/products")
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/isAlive", produces = "application/json")
    public String isAlive() {
        log.info("ProductController.isAlive()");
        return "Hello World from ProductController";
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public Product get(@PathVariable long id) {
        log.info("ProductController.get({})", id);
        return productService.getProductById(id);
    }

    @GetMapping(value = "/", produces = "application/json")
    @ResponseBody
    public Iterable<Product> getAll() {
        log.info("ProductController.getAll()");
        return productService.geAllProducts();
    }
}
