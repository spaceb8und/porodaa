package com.example.poroda.entity.cat.test.answers.b2;

import lombok.Getter;

// Кошки с каким типом телосложения вам нравятся больше всего?
public enum BodyType {
    FIRST("Неважно"),
    SECOND("Предпочитаю стройные и элегантные породы"),
    THIRD("Предпочитаю кошек средней комплекции"),
    FOURTH("Предпочитаю крупные породы");

    @Getter
    private final String answer;

    BodyType(String answer) {
        this.answer = answer;
    }
}
