package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = sum(7);
        int minus = minus(7);
        int multiply = calculator.multiply(7);
        int divide = calculator.divide(7);
        int sumAll = calculator.sumAllOperation(7);
        System.out.println("sum: " + sum);
        System.out.println("minus: " + minus);
        System.out.println("multiply: " + multiply);
        System.out.println("divide: " + divide);
        System.out.println("sumAll: " + sumAll);
    }
}
