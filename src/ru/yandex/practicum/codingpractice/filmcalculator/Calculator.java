package ru.yandex.practicum.codingpractice.filmcalculator;

import java.util.List;

public class Calculator {
    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double fullTime = 0;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Series) {
                Series series = (Series) mediaItem;
                fullTime = (series.getSeriesCount() * series.getRuntime()) + fullTime;
            } else if (mediaItem instanceof Movie) {
                Movie movie = (Movie) mediaItem;
                fullTime = movie.getRuntime() + fullTime;
            } else {
                System.out.println("Неизвестно");
            }
        }
        //return mediaItems.size();
        return fullTime / (60 * 24);
    }
}