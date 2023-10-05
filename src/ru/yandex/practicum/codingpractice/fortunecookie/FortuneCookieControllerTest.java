package ru.yandex.practicum.codingpractice.fortunecookie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {
    public static FortuneCookieController goodFactoryController;
    public static FortuneCookieController badFactoryController;

    @BeforeAll
    public static void beforeAll() {
        goodFactoryController = new FortuneCookieController(new FortuneCookieFactory(
                new FortuneConfig(true),
                singletonList("positive"),
                singletonList("negative")
        ));
        badFactoryController = new FortuneCookieController(new FortuneCookieFactory(
                new FortuneConfig(false),
                singletonList("positive"),
                singletonList("negative")
        ));
    }

    @Test
    public void shouldReturnPositiveFortune() {
        String cookieText = goodFactoryController.tellFortune().getFortuneText();
        Assertions.assertEquals("positive", cookieText);
    }

    @Test
    public void shouldReturnNegativeFortune() {
        String cookieText = badFactoryController.tellFortune().getFortuneText();
        Assertions.assertEquals("negative", cookieText);
    }
}
