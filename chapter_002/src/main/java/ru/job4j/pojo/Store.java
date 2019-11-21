package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product bread = new Product("Bread", 4);
        Product milk = new Product("Milk", 10);
        Product egg = new Product("Egg", 19);
        Product[] product = new Product[3];
        product[0] = bread;
        product[1] = milk;
        product[2] = egg;
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i].getName() + " " + product[i].getCount());
        }
        System.out.println("\nReplace milk to oil.");
        Product oil = new Product("Oil", 11);
        product[1] = oil;
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i].getName() + " " + product[i].getCount());
        }
        System.out.println("Shown only product.count > 10");
        for (int i = 0; i < product.length; i++) {
            if (product[i].getCount() > 10) {
                System.out.println(product[i].getName() + " " + product[i].getCount());
            }
        }
    }
}
