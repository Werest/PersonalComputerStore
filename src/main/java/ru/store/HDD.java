package ru.store;

//Interface segregation principle
//Раздение интерфейсов на маленькие, вместо одного общего (большого)
//Dependency inversion principle
//Не зависеть от деталей реализации класса, а зависеть от абстрации
//Можно выполнить Storage storage = new HDD(); или Storage storage = new SSD();
//т.е. сможем сконфигурировать компьютер покупателя изменив конструктор
public class HDD extends Product implements WorkPrinciple, Storage{
    //Single-Responsibility principle
    //class HDD описывает только HDD, а не что-то другое или например все продукты
    private final String name = "HDD";
    private final double price = 1000;

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
        System.out.println("Вжууууу...");
    }

    @Override
    public void storage() {
        System.out.println("Можно хранить данные!");
    }
}
