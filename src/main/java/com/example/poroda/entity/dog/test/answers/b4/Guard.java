package com.example.poroda.entity.dog.test.answers.b4;

import lombok.Getter;

// Должна ли ваша собака охранять вас и ваше имущество?
public enum Guard {
    FIRST("Неважно"),
    SECOND("Нет"),
    THIRD("Да, чтобы лаяла и охраняла"),
    FOURTH("Да, чтобы могла защитить");

    @Getter
    private final String answer;

    Guard(String answer) {
        this.answer = answer;
    }
}
