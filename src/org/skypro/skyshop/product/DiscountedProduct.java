package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int basedPrice;
    private int discount;

    public DiscountedProduct(int basedPrice, int discount, String name) {
        super(name);
        this.basedPrice = basedPrice;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return basedPrice - (basedPrice * discount / 100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + " (" + discount + "%)";
    }



}

