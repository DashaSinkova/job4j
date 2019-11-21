package ru.job4j.pojo;

/**
 * 3. Удаление моделей из массива.[#188336]
 */
public class Store {
    public static void main(String[] args) {
        Product bread = new Product("Bread", 4);
        Product milk = new Product("Milk", 10);
        Product egg = new Product("Egg", 19);
        Product[] product = new Product[5];
        product[0] = bread;
        product[1] = milk;
        product[2] = egg;
        product[3] = new Product("Chocolate", 10);
        product[4] = new Product("Tea", 2);
       for (int i = 0; i < product.length; i++) {
            Product pr = product[i];
            if (pr != null) {
                System.out.println(pr.getName() + " " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println(System.lineSeparator() + "Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        product[1] = oil;
        for (int i = 0; i < product.length; i++) {
            Product pr = product[i];
            if (pr != null) {
                System.out.println(pr.getName() + " " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println(System.lineSeparator() + "Shown only product.count > 10");
        for (int i = 0; i < product.length; i++) {
            Product pr = product[i];
            if (pr != null && pr.getCount() > 10) {
                System.out.println(pr.getName() + " " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println(System.lineSeparator() + "When cell = null");
        product[1] = null;
        for (int i = 0; i < product.length; i++) {
            Product pr = product[i];
            if (pr != null) {
                System.out.println(pr.getName() + " " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println(System.lineSeparator() + "Move null cell:");
        product[1] = product[2];
        product[2] = null;
        for (int i = 0; i < product.length; i++) {
            Product pr = product[i];
            if (pr != null) {
                System.out.println(pr.getName() + " " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println(System.lineSeparator() + "Move all array:");
        Shop shop = new Shop();
        product = shop.delete(product, 2);
        for (int i = 0; i < product.length; i++) {
            Product pr = product[i];
            if (pr != null) {
                System.out.println(product[i].getName() + " " + product[i].getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}

