package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int item = index; item < products.length; item++) {
            if (item < products.length - 1) {
                products[item] = products[item + 1];
                products[item + 1] = null;
            } else {
                products[item] = null;
            }
        }
        return products;
    }
}
