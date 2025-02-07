package com.example.app.controller;

import com.example.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/")
    public String getUsersPage(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }
}
