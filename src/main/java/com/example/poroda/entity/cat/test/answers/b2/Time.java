package com.example.poroda.entity.cat.test.answers.b2;

import lombok.Getter;

// Сколько времени вы готовы уделять уходу за шерстью кошки?
public enum Time {
    FIRST("Неважно"),
    SECOND("У меня есть немного времени, чтобы ежедневно ухаживать за шерстью кошки"),
    THIRD("Я хочу заниматься уходом за шерстью кошки один раз в неделю");

    @Getter
    private final String answer;

    Time(String answer) {
        this.answer = answer;
    }
}
