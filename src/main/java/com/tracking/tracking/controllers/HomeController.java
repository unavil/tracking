package com.tracking.tracking.controllers;

import com.tracking.tracking.models.Product;
import com.tracking.tracking.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

//Controller class is used for receiving and processing requests
// and returning the view in response

@Controller
public class HomeController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/home")
    public String displayHome (Model model) {

        List <Product> products = productRepository.findAll();
        model.addAttribute("products", products);

        return "home";
    }

}










