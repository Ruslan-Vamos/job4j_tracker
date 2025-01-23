package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус едет с остановками.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Автобус везет " + count + " пассажиров.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 50;
    }
}
