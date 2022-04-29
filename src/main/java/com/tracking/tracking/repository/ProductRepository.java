package com.tracking.tracking.repository;

import com.tracking.tracking.models.Product;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    public List<Product> findAll();
}
