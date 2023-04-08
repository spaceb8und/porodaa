package com.example.poroda.entity.dog.test.answers.b3;

import lombok.Getter;

public enum Allergy {
    FIRST("Ни у кого в моей семье нет аллергии на собак"),
    SECOND("Я ищу гипоаллергенную породу");

    @Getter
    private final String answer;

    Allergy(String answer) {
        this.answer = answer;
    }
}
