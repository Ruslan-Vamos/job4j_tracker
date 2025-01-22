package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        System.out.println("На столе 11 спичек." + System.lineSeparator()
                + "Два игрока по очереди берут от 1 до 3 спичек." + System.lineSeparator()
                + "Выигрывает тот, кто забрал последние спички.");
        int matches = 11;
        boolean firstPlayer = true;
        while (true) {
            System.out.println();
            System.out.println("На столе сейчас " + matches + " спичек.");
            int playerNum = firstPlayer ? 1 : 2;
            System.out.println("Игрок " + playerNum + " берет спички:");
            int matchesTaken = Integer.parseInt(input.nextLine());
            if (matchesTaken < 1 || matchesTaken > 3) {
                System.out.println("Можно взять от 1 до 3 спичек.");
            } else if (matches - matchesTaken < 0) {
                System.out.println("На столе меньше спичек чем пытается взять Игрок " + playerNum);
            } else {
                matches -= matchesTaken;
                if (matches == 0) {
                    System.out.println("Игрок " + playerNum + " победил!");
                    break;
                }
                firstPlayer = !firstPlayer;
            }
            System.out.println();

        }
    }
}
