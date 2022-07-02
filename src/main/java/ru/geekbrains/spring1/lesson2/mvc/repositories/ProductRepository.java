package ru.geekbrains.spring1.lesson2.mvc.repositories;

import org.springframework.stereotype.Repository;
import ru.geekbrains.spring1.lesson2.mvc.models.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>(Arrays.asList(
                new Product(1l, "Milk", 15),
                new Product(2l, "Bread", 10),
                new Product(3l, "Meat", 150),
                new Product(4l, "Water", 50),
                new Product(5l, "Cheese", 100)
        ));
    }

    public List<Product> getAll(){
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(Long id){
        for (Product p: products){
            if (p.equals(id)){
                return p;
            }
        }
        throw new RuntimeException("Product not found");
    }
    public void addProduct(Product p){
        products.add(p);
    }
}
