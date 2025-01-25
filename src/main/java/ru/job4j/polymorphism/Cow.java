package ru.job4j.polymorphism;

public class Cow implements Animal {
    public void giveMilk() {
        System.out.println("дает человеку молоко.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Муу.");
    }
}
