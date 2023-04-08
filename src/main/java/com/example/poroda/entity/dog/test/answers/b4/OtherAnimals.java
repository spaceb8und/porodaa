package com.example.poroda.entity.dog.test.answers.b4;

import lombok.Getter;

//Ваша собака должна хорошо ладить с другими животными?
public enum OtherAnimals {
    FIRST("Неважно"),
    SECOND("Да"),
    THIRD("Нет");

    @Getter
    private final String answer;

    OtherAnimals(String answer) {
        this.answer = answer;
    }
}
