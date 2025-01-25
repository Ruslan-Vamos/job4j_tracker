package ru.job4j.polymorphism;

public class Dog implements Animal {
    public void runAfterCat() {
        System.out.println("не любит кошек, постоянно за ними гоняется.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Гав-гав.");
    }
}
