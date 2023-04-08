package com.example.poroda.entity.dog.test.answers.b4;

import lombok.Getter;

// Ваша собака должна ладить с детьми?
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
