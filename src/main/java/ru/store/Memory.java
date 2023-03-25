package ru.store;

//Open-closed principle добавляя интерфейс WorkPrinciple
//добавляем классу функциональности при этом не модифицируя
public class Memory extends Product implements WorkPrinciple{
    //Single-Responsibility principle - только Memory
    private final String name = "Memory";
    private final double price = 800;

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
        System.out.println(".....");
    }
}
