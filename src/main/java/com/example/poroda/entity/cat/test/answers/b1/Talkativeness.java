package com.example.poroda.entity.cat.test.answers.b1;

import lombok.Getter;

// Что вы думаете о «разговорчивых» кошках?
public enum Talkativeness {
    FIRST("Неважно"),
    SECOND("Я хочу тихую кошку"),
    THIRD("Я хочу кошку, которая любит пообщаться"),
    FOURTH("Я хочу кошку, которая очень любит общаться");

    @Getter
    private final String answer;

    Talkativeness(String answer) {
        this.answer = answer;
    }
}
