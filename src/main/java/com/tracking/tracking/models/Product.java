package com.tracking.tracking.models;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

//Class with constructors, getters and setters
//With Hibernate annotations mapped to MySQL

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;

    private String productStatus;

    private String productCategory;

    private String productDescription;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime productCreatedAt;

    public Product() {
    }

    public Product(String productName, String productStatus, String productCategory,
                   String productDescription, LocalDateTime productCreatedAt) {

        this.productName = productName;
        this.productStatus = productStatus;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productCreatedAt = productCreatedAt;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public LocalDateTime getProductCreatedAt() {
        return productCreatedAt;
    }

    public void setProductCreatedAt(LocalDateTime productCreatedAt) {
        this.productCreatedAt = productCreatedAt;
    }
}