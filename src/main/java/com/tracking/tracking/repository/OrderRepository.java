package com.tracking.tracking.repository;

import com.tracking.tracking.models.Order;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface OrderRepository extends CrudRepository <Order, Long> {

    @Override
    public List<Order> findAll();
}
