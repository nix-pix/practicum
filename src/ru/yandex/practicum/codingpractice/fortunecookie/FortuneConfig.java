package ru.yandex.practicum.codingpractice.fortunecookie;

public class FortuneConfig { // Хранит конфигурацию фабрики по производству печенек с предсказаниями.
    private final boolean isPositive;

    public FortuneConfig(boolean isPositive) {
        this.isPositive = isPositive;
    }

    public boolean isPositive() {
        return isPositive;
    }
}