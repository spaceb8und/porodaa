package com.example.poroda.entity.dog.test.answers.b3;

import lombok.Getter;

// Как часто вы готовы ухаживать за шерстью вашей собаки?
public enum Wool {
    FIRST("Неважно"),
    SECOND("Я могу ухаживать за шерстью раз в неделю"),
    THIRD("У меня есть время для ухода за шерстью раз в два дня"),
    FOURTH("Я могу вычесывать собаку каждый день");

    @Getter
    private final String answer;

    Wool(String answer) {
        this.answer = answer;
    }
}
