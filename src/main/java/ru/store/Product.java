package ru.store;

public class Product {
    private String name;
    private double price;

    private int countBuy;

    public int getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(int countBuy) {
        this.countBuy = countBuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
