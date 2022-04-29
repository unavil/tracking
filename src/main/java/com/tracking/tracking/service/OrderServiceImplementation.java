package com.tracking.tracking.service;

import com.tracking.tracking.models.Order;
import com.tracking.tracking.repository.OrderRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import javax.validation.constraints.Min;
import java.util.Optional;

//Services interact with transactions - save, get, screen, delete
//Stored in a separate package - Service interfaces and Service classes that implement them

@Service
@Transactional
public class OrderServiceImplementation implements OrderService{
    private OrderRepository orderRepository;

    public OrderServiceImplementation(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrder(@Min(value = 1L, message = "Invalid ID.") long id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

}
