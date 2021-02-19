package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int item = index; item < products.length - 1; item++) {
            products[item] = products[item + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
