package ru.yandex.practicum.codingpractice.passwordstorage;

import java.io.IOException;

public class PasswordStorage {
    void open() throws IOException;
    void store(String user, String password) throws IOException;
    String get(String user) throws IOException;
    void close();
}
