package com.example.poroda.entity.dog.test.answers.b2;

import lombok.Getter;

// Сколько времени вы готовы уделять уходу за шерстью кошки?
public enum Time {
    FIRST("Неважно"),
    SECOND("Ежедневные получасовые прогулки"),
    THIRD("Час вдень"),
    FOURTH("Прогулки в течение одного-двух часов в день"),
    FIFTH("Прогулки более двух часов в день");

    @Getter
    private final String answer;

    Time(String answer) {
        this.answer = answer;
    }
}
