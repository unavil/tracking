package com.tracking.tracking.models;
import com.tracking.tracking.models.Product;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

//Class with constructors, getters and setters
//With Hibernate annotations mapped to MySQL

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    private String orderedProductName;

    private String orderedProductStatus;

    private String orderedProductCategory;

    private String orderedProductDescription;

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    private LocalDateTime orderedProductCreatedAt;

    public Order() {
    }

    public Order(String orderedProductName, String orderedProductStatus, String orderedProductCategory,
                 String orderedProductDescription, LocalDateTime orderedProductCreatedAt) {
        this.orderedProductName = orderedProductName;
        this.orderedProductStatus = orderedProductStatus;
        this.orderedProductCategory = orderedProductCategory;
        this.orderedProductDescription = orderedProductDescription;
        this.orderedProductCreatedAt = orderedProductCreatedAt;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderedProductName() {
        return orderedProductName;
    }

    public void setOrderedProductName(String orderedProductName) {
        this.orderedProductName = orderedProductName;
    }

    public String getOrderedProductStatus() {
        return orderedProductStatus;
    }

    public void setOrderedProductStatus(String orderedProductStatus) {
        this.orderedProductStatus = orderedProductStatus;
    }

    public String getOrderedProductCategory() {
        return orderedProductCategory;
    }

    public void setOrderedProductCategory(String orderedProductCategory) {
        this.orderedProductCategory = orderedProductCategory;
    }

    public String getOrderedProductDescription() {
        return orderedProductDescription;
    }

    public void setOrderedProductDescription(String orderedProductDescription) {
        this.orderedProductDescription = orderedProductDescription;
    }

    public LocalDateTime getOrderedProductCreatedAt() {
        return orderedProductCreatedAt;
    }

    public void setOrderedProductCreatedAt(LocalDateTime orderedProductCreatedAt) {
        this.orderedProductCreatedAt = orderedProductCreatedAt;
    }
}
