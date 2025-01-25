package ru.job4j.cast;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит.");
    }

    @Override
    public void beep() {
        System.out.println(getClass().getSimpleName() + " не умеет бибикать.");
    }
}
