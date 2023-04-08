package com.example.poroda.entity.cat.test.answers.b1;

import lombok.Getter;

// Насколько активную кошку вы хотите?
public enum Activity {
    FIRST("Неважно"),
    SECOND("Мне нравятся спокойный кошки"),
    THIRD("Я хочу игривую и любопытную кошку"),
    FOURTH("Я хочу активную и любознательную кошку");

    @Getter
    private final String answer;

    Activity(String answer) {
        this.answer = answer;
    }
}
