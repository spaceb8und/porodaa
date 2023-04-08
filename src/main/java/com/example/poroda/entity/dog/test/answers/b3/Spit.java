package com.example.poroda.entity.dog.test.answers.b3;

import lombok.Getter;

// Как вы относитесь к собакам с активным слюноотделением?
public enum Spit {
    FIRST("Неважно"),
    SECOND("Слюни? Пусть их будет поменьше!"),
    THIRD("Слюни? Немножко — нестрашно."),
    FOURTH("У всех собак в некоторой степени текут слюни.");

    @Getter
    private final String answer;

    Spit(String answer) {
        this.answer = answer;
    }
}
