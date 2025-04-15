package org.skypro.skyshop;

public class Product {
    private static String name;
    private static int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}


