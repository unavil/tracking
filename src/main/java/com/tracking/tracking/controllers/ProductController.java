package com.tracking.tracking.controllers;

import com.tracking.tracking.models.Product;
import com.tracking.tracking.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/new")
    public String displayProductForm(Model model) {

        Product listedProduct = new Product();
        model.addAttribute("product", listedProduct);

        return "product";
    }

    @PostMapping("/save")
    public String createProduct(Product product, Model model){

        productRepository.save(product);

        return "redirect:/products/new";

    }


}
