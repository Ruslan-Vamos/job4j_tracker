package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет на колесах.");
    }

    @Override
    public void beep() {
        System.out.println(getClass().getSimpleName() + " громко бибикает.");
    }
}