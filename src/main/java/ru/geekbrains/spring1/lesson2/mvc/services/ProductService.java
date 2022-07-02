package ru.geekbrains.spring1.lesson2.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import ru.geekbrains.spring1.lesson2.mvc.models.Product;
import ru.geekbrains.spring1.lesson2.mvc.repositories.ProductRepository;

import java.util.Collections;
import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return Collections.unmodifiableList(productRepository.getAll());
    }

    public Product getProductById(Long id){
        return productRepository.getProductById(id);
    }

    public void addProduct(Product p){
        productRepository.addProduct(p);
    }
}
