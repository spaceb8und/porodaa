package com.example.poroda.entity.dog.test.answers.b3;

import lombok.Getter;

// Есть ли у вас предпочтения к размеру вашей собаки?
public enum Size {
    FIRST("Неважно"),
    SECOND("Я предпочитаю карликовые породы собак, которых можно носить с собой"),
    THIRD("Мне идеально подходит собака маленького размера"),
    FOURTH("Мне нужна собака среднего размера"),
    FIFTH("Я предпочитаю больших собак"),
    SIXTH("Я предпочитаю очень крупные породы собак");

    @Getter
    private final String answer;

    Size(String answer) {
        this.answer = answer;
    }
}
