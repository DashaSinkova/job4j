package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (; index < products.length - 1; index++) {
            products[index] = products[index + 1];
        }
        products[products.length - 1] = null;
        return products;
    }


}

