package ru.yandex.practicum.codingpractice.passwordstorage;

public class NameValidator implements Validator { // допишите код класса

    @Override
    public void validate(String value) throws ValidateException {
        if (value == null) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}
