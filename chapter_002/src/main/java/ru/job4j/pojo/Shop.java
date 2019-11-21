package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        for(int i = 0; i < products.length; i++) {
            if(i == index) {
                products[i] = null;
                for( ; i < products.length - 1; i++) {
                    products[i] = products[i + 1];
                }
                products[products.length - 1] = null;
            }

        }
        return products;
    }
}
