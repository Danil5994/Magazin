package org.skypro.skyshop;

import org.skypro.skyshop.interfaces.SearchEngine;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;

import java.util.Arrays;

class App {
    public App() {
    }

    public static void main(String[] args) {
        SimpleProduct product1 = new SimpleProduct("Сидр", 100);
        DiscountedProduct product2 = new DiscountedProduct(45, 10, "Хлеб");
        FixPriceProduct product3 = new FixPriceProduct("Доширак");

        ProductBasket basket = new ProductBasket();

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);


        basket.printBasket();
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли продукт " + product2 + " в корзине? " + basket.hasProduct("Хлеб"));
        System.out.println("Есть ли продукт " + product3 + " в корзине? " + basket.hasProduct("Доширак"));


        basket.clearBasket();
        basket.printBasket();
        System.out.println("Общая стоимость корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли продукт " + product1 + " в корзине? " + basket.hasProduct("Сидр"));

        SearchEngine proverka = new SearchEngine(10);
        proverka.addItem(product1);
        proverka.addItem(product2);
        proverka.addItem(product3);

        System.out.println(Arrays.toString(proverka.searchAll("Сидр")));
        //Алишев

    }

}