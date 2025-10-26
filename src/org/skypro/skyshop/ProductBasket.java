package org.skypro.skyshop;

public class ProductBasket {
    private  Product[] products = new Product[5];
    private  int price;

    public void addProduct(Product product){
        if (price < products.length){
            products[price++]= product;
        }else{
            System.out.println("Невозможно добавить продукт");
        }
}
public int getTotalPrice() {
    int total= 0;
    for (int i = 0; i< price; i++){
        total += products[i].getPrice();
    }
    return total;
}
    public void printBasket() {
        if (price == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        for (int i = 0; i < price; i++) {
            System.out.println(products[i].getName() + ": " + products[i].getPrice());
        }
        System.out.println("Итого: " + getTotalPrice());
    }

    public boolean hasProduct(String name) {
        for (int i = 0; i < price; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < price; i++) {
            products[i] = null;
        }
        price = 0;
    }

}