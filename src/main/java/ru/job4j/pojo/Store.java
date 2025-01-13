package ru.job4j.pojo;

public class Store {

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] products = new Product[3];
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName() + " - " + product.getCount());
        }
        System.out.println("Show only products whose quantity is more than 10");
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCount() > 10) {
                System.out.println(products[i].getName() + " - " + products[i].getCount());
            }
        }
    }
}
