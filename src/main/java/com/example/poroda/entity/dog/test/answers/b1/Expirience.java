package com.example.poroda.entity.dog.test.answers.b1;

import lombok.Getter;

// Вы новичок или опытный владелец собаки?
public enum Expirience {
    FIRST("Неважно"),
    SECOND("Нет, это моя первая собака и я готов учиться"),
    THIRD("У менять есть опыт ухода за собакой"),
    FOURTH("У меня большой опыт по уходу за собакой");

    @Getter
    private final String answer;

    Expirience(String answer) {
        this.answer = answer;
    }
}
