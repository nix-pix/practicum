package ru.yandex.practicum.codingpractice.keywordsgame;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

public class WayToExit {
    private static class DivideByZeroExit implements Runnable {
        @Override
        public void run() {
            final int result = 10 / 0;
            System.out.println(result);
        }
    }

    private static class NullPointerExit implements Runnable {
        @Override
        public void run() {
            final Object obj = null;
            System.out.println(obj.hashCode());
        }
    }

    private static class OutOfBoundaryExit implements Runnable {
        @Override
        public void run() {
            final String[] run = {};
            System.out.println(run[10]);
        }
    }

    private static final List<Runnable> wayToExit = List.of(
            new DivideByZeroExit(), new NullPointerExit(), new OutOfBoundaryExit()
    );

    public void exit() {
        final Random random = new SecureRandom();
        int way = random.nextInt(wayToExit.size());
        wayToExit.get(way).run();
    }
}
