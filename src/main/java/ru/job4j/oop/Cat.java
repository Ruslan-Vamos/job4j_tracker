package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        name = nick;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Food: " + food);
    }

    public void eat(String meat) {
        food = meat;
    }

    public String sound() {
        return "mau-mau";
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        System.out.println("There is gav's food:");
        gav.eat("cutlet");
        gav.show();
        Cat black = new Cat();
        System.out.println("There is black's food:");
        black.eat("fish");
        black.show();
    }
}
