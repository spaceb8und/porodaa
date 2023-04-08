package com.example.poroda.entity.cat.test.answers.b3;

import lombok.Getter;

// В каких условиях будет жить ваша кошка?
public enum Condition {
    FIRST("Неважно"),
    SECOND("Только в помещении"),
    THIRD("Ограниченный доступ на улицу"),
    FOURTH("Свободный доступ на улицу");

    @Getter
    private final String answer;

    Condition(String answer) {
        this.answer = answer;
    }
}
