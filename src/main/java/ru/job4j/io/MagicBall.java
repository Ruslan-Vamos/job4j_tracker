package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("Я великий оракул. Что ты хочешь узнать?");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 1 -> System.out.println("Да");
            case 2 -> System.out.println("Нет");
            default -> System.out.println("Может быть");
        }
    }
}
