package org.skypro.skyshop.product;

import org.skypro.skyshop.interfaces.Searchable;

abstract public class Product implements Searchable {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   abstract public int getPrice();

   abstract public boolean isSpecial();


    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSearchTerm() {
        return getName();
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }
}




