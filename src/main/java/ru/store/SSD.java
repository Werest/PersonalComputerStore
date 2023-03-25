package ru.store;

//Interface segregation principle
//Разделение интерфейсов на маленькие, вместо одного общего
public class SSD extends Product implements WorkPrinciple, Storage{
    //Single-Responsibility principle - только SSD
    private final String name = "SSD";
    private final double price = 2000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void workPrinciple() {
        System.out.println("Пик");
    }

    @Override
    public void storage() {
        System.out.println("Можно хранить данные!");
    }
}
