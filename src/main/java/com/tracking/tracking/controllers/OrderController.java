package com.tracking.tracking.controllers;

import com.tracking.tracking.models.Order;
import com.tracking.tracking.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping
    public String displayOrders (Model model) {

        List<Order> orders = orderRepository.findAll();
        model.addAttribute("orders", orders);

        return "order";

    }

    @GetMapping("/new")
    public String displayOrderForm(Model model) {

        Order listedOrder = new Order();
        model.addAttribute("order", listedOrder);

        return "order";
    }

    @PostMapping("/save")
    public String createOrder(Order order, Model model){

        orderRepository.save(order);

        return "redirect:/products/new";
    }
}
