package ru.geekbrains.spring1.lesson2.mvc.models;

public class Product {
    private Long id;
    private String title;
    private int price;

    public Product(){

    }

    public Product(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setCost(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " " + "Title: " + title + " " + "Cost: " + price;
    }
}
