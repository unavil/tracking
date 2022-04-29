package com.tracking.tracking.repository;

import com.tracking.tracking.models.Product;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

//Repositories (Crud, Jpa, ...) provide access to methods to perform operations on objects
//There are many built-in methods
// Additional methods can be created

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    public List<Product> findAll();
}
