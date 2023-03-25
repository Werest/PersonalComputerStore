import ru.store.HDD;
import ru.store.Memory;
import ru.store.Product;
import ru.store.SSD;

import java.util.Scanner;

import static ru.store.Constants.*;

public class Main {
    public static void main(String[] args) {
        //В нашем магазине продаются сделающие товары
        //Liskov substitution principle
        //наследуемые объекты класса Product могут играть роль предка
        Product[] products = {
            new HDD(),
            new SSD(),
            new Memory()
        };

        printProducts(products);
        separate();

        Scanner scanner = new Scanner(System.in);
        //Выберите товар и его количество - заполняем корзину
        while(true) {
            System.out.println("Выберете товар и его количество, либо end (закончить работу)");
            System.out.println("Пример, 1 10 - 1 товар 10 штук");
            separate();
            String line = scanner.nextLine();
            if(line.equals("end")) {
                break;
            }
            try {
                String[] split = line.split(" ");
                if (split.length > 2) {
                    throw new ArrayIndexOutOfBoundsException();
                } else {
                    int numberProduct = Integer.parseInt(split[0]) - 1;
                    int countBuy = products[numberProduct].getCountBuy() + Integer.parseInt(split[1]);
                    products[numberProduct].setCountBuy(countBuy);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Изучите инструкцию по выбору товара!");
                separate();
            }

        }
        separate();
        System.out.println("Корзина:");
        printShoppingCart(products);
    }

    //DRY вывод продуктов вынесен в отдельный метод
    public static void printProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i] + " - " + products[i].getPrice() + CURRENCY);
        }
    }

    public static void separate() {
        System.out.println("-------------------------------------------------------");
    }

    public static void printShoppingCart(Product[] products) {
        double totalAmountProduct = 0;
        for (Product product : products) {
            if (product.getCountBuy() > 0) {
                double amountProduct = product.getPrice() * product.getCountBuy();
                totalAmountProduct += amountProduct;
                System.out.println(product + " (" + product.getCountBuy() + " шт.) " + " " + amountProduct + CURRENCY);
            }
        }
        System.out.println("К оплате: " + totalAmountProduct + CURRENCY);
    }
}