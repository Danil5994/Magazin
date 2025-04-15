package org.skypro.skyshop;

import org.skypro.skyshop.ProductBasket;
import org.skypro.skyshop.Product;

 class App {
    public static void main(String[] args) {
        Product product1 = new Product("Продукт 1", 100);
        Product product2 = new Product("Продукт 2", 200);
        Product product3 = new Product("Продукт 3", 300);
        Product product4 = new Product("Продукт 4", 400);
        Product product5 = new Product("Продукт 5", 500);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        basket.printBasket();
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли продукт 'Продукт 2' в корзине? " + basket.hasProduct("Продукт 2"));
        System.out.println("Есть ли продукт 'Продукт 6' в корзине? " + basket.hasProduct("Продукт 6"));


        basket.clearBasket();
        basket.printBasket();
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли продукт 'Продукт 1' в корзине? " + basket.hasProduct("Продукт 1"));
    }
}