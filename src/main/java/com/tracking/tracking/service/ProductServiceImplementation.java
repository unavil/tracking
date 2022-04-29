package com.tracking.tracking.service;

import com.tracking.tracking.models.Product;
import com.tracking.tracking.repository.ProductRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import javax.validation.constraints.Min;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImplementation implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(@Min(value = 1L, message = "Invalid ID.") long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
