package com.tracking.tracking.service;

import com.sun.istack.NotNull;
import com.tracking.tracking.models.Order;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import java.util.Optional;

@Validated
public interface OrderService {
    @NotNull
    Iterable<Order> getAllOrders();

    Optional<Order> getOrder(@Min(value = 1L, message = "Invalid ID.") long id);

    Order save (Order order);
}
