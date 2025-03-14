package ru.job4j.ex;

public class Factorial {

    public int calc(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should not be less than 0");
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new Factorial().calc(-1);
    }
}
