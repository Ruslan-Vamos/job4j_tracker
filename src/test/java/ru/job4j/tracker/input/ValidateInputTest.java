package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.*;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Input input = new MockInput(
                new String[]{"99"}
        );
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(99);
    }

    @Test
    void whenMultiValidInput() {
        Input input = new MockInput(
                new String[]{"20", "31", "52526", "2"}
        );
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(20);
        selected = validateInput.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(31);
        selected = validateInput.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(52526);
        selected = validateInput.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(2);
    }

    @Test
    void whenNegativeInput() {
        Input input = new MockInput(
                new String[]{"-2"}
        );
        Output output = new StubOutput();
        ValidateInput validateInput = new ValidateInput(output, input);
        int selected = validateInput.askInt("Выбрать: ");
        assertThat(selected).isEqualTo(-2);
    }
}