package com.tracking.tracking.service;

import com.sun.istack.NotNull;
import com.tracking.tracking.models.Product;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Min;
import java.util.Optional;

//Services interact with transactions - save, get, screen, delete
//Stored in a separate package - Service interfaces and Service classes that implement them

@Validated
public interface ProductService {
    @NotNull Iterable<Product> getAllProducts();

    Optional<Product> getProduct(@Min(value = 1L, message = "Invalid ID.") long id);

    Product save (Product product);
}
