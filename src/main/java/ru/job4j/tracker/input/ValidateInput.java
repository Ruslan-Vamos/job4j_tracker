package ru.job4j.tracker.input;

public class ValidateInput extends ConsoleInput {
    @Override
    public int askInt(String question) {
        int rst = -1;
        boolean invalid = true;
        do {
            try {
                rst = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Введите число");
            }
        } while (invalid);
        return rst;
    }
}
