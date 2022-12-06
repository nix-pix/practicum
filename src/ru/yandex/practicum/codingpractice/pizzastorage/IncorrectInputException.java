package ru.yandex.practicum.codingpractice.pizzastorage;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(String message) {
        super(message);
    }
}