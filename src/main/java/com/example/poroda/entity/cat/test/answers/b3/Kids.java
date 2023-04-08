package com.example.poroda.entity.cat.test.answers.b3;

import lombok.Getter;

// Вы ищете кошку, которая ладит с детьми?
public enum Kids {
    FIRST("Неважно"),
    SECOND("Да"),
    THIRD("Нет");

    @Getter
    private final String answer;

    Kids(String answer) {
        this.answer = answer;
    }
}
