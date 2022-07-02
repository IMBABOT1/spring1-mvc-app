package ru.geekbrains.spring1.lesson2.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.geekbrains.spring1.lesson2.mvc.models.Product;
import ru.geekbrains.spring1.lesson2.mvc.services.ProductService;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public String getAllProducts(Model model){
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/add_product")
    public String addProduct(@RequestParam Long id, @RequestParam String title, @RequestParam int price){
        Product p = new Product(id, title, price);
        productService.addProduct(p);
        return "redirect:/all";
    }
}
