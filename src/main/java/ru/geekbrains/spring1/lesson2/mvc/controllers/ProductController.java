package ru.geekbrains.spring1.lesson2.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.geekbrains.spring1.lesson2.mvc.services.ProductService;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    @ResponseBody
    public String getAllProducts(){
        return "products";
    }
}
