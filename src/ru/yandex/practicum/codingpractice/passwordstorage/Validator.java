package ru.yandex.practicum.codingpractice.passwordstorage;

public interface Validator {
    void validate(String value) throws ValidateException;
}
