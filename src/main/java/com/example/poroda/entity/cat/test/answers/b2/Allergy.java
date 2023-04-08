package com.example.poroda.entity.cat.test.answers.b2;

import lombok.Getter;

// Есть ли у кого-то из вашей семьи аллергия на кошек?
public enum Allergy {
    FIRST("Нет"),
    SECOND("Есть. Мне нужна гипоаллергенная порода.");

    @Getter
    private final String answer;

    Allergy(String answer) {
        this.answer = answer;
    }
}
