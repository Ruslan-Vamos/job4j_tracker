package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BackArrayTest {

    @Test
    void whenInputArrayHasEvenAmountElements() {
        String[] names = {"Ruslan", "Ivan", "Nik", "Vasya"};
        String[] expected = {"Vasya", "Nik", "Ivan", "Ruslan"};
        String[] result = new BackArray().turn(names);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenInputArrayHasOddAmountElements() {
        String[] names = {"Ruslan", "Ivan", "Andrey", "Nik", "Vasya"};
        String[] expected = {"Vasya", "Nik", "Andrey", "Ivan", "Ruslan"};
        String[] result = new BackArray().turn(names);
        assertThat(result).isEqualTo(expected);
    }
}