package com.example.poroda.entity.dog.test.answers.b4;

import lombok.Getter;

// Насколько шумных собак вы предпочитаете?
public enum Noise {
    FIRST("Неважно"),
    SECOND("Я предпочитаю собак, которые лают редко"),
    THIRD("Я люблю шумных собак"),
    FOURTH("Мне подходят очень шумные собаки");

    @Getter
    private final String answer;

    Noise(String answer) {
        this.answer = answer;
    }
}
