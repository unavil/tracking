package com.tracking.tracking.repository;

import com.tracking.tracking.models.Order;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

//Repositories (Crud, Jpa, ...) provide access to methods to perform operations on objects
//There are many built-in methods
// Additional methods can be created

public interface OrderRepository extends CrudRepository <Order, Long> {

    @Override
    public List<Order> findAll();
}
