package com.example.poroda.entity.cat.test.answers.b1;

import lombok.Getter;

// Насколько общительной должна быть ваша кошка?
public enum Communication {
    FIRST("Неважно"),
    SECOND("Общительная и преданная"),
    THIRD("Дружелюбная но независимая"),
    FOURTH("Независимая");

    @Getter
    private final String answer;

    Communication(String answer) {
        this.answer = answer;
    }
}
