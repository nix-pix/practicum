package ru.yandex.practicum.codingpractice.reversepolishnotationcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    /* 7 Спринт - Unit-тесты - Покрытие кода и покрытие требований
    Достаточно проверить, что код работает для операций +, -, *,
    а также что он правильно обрабатывает пробельные символы и отрицательные числа.*/

    private final ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldReturn2ForCalculateOneOnePlus() {
        int sum = calculator.calculatePolishNotation("1 1 +");
        Assertions.assertEquals(2, sum);
    }

    @Test
    public void shouldReturn0ForCalculateOneOneMinus() {
        int sum = calculator.calculatePolishNotation("1 1 -");
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void shouldReturn1ForCalculateOneOneMultiply() {
        int sum = calculator.calculatePolishNotation("1 1 *");
        Assertions.assertEquals(1, sum);
    }

    @Test
    public void shouldReturn2ForCalculateOneBlankOnePlus() {
        int sum = calculator.calculatePolishNotation("1  1 +");
        Assertions.assertEquals(2, sum);
    }

    @Test
    public void shouldReturn0ForCalculateOneMinusOnePlus() {
        int sum = calculator.calculatePolishNotation("1 -1 +");
        Assertions.assertEquals(0, sum);
    }
}