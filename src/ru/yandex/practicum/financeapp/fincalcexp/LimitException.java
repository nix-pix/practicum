package ru.yandex.practicum.financeapp.fincalcexp;

public class LimitException extends RuntimeException {
    final int attempts;

    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }
}
