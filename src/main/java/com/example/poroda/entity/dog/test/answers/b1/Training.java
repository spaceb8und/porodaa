package com.example.poroda.entity.dog.test.answers.b1;

import lombok.Getter;

// Насколько активно вы готовы дрессировать вашу собаку?
public enum Training {
    FIRST("Неважно"),
    SECOND("Мне было бы комфортнее, если бы породе требовалась только базовая дрессировка"),
    THIRD("Мне подзодит порода, которой требуются дополнительные часы дрессировки"),
    FOURTH("У меня есть опыть и я комфортно себя чувствую с любой породой");

    @Getter
    private final String answer;

    Training(String answer) {
        this.answer = answer;
    }
}
