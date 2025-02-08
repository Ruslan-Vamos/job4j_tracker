package ru.job4j.tracker.input;

import ru.job4j.tracker.output.Output;

public class ValidateInput implements Input {
    private final Output output;
    private final Input input;

    public ValidateInput(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        int rst = -1;
        boolean invalid = true;
        do {
            try {
                rst = input.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Введите число");
            }
        } while (invalid);
        return rst;
    }
}
