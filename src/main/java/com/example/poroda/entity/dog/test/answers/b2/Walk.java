package com.example.poroda.entity.dog.test.answers.b2;

import lombok.Getter;

// Как вы представляете себе прогулки с вашим питомцем?
public enum Walk {
    FIRST("Неважно"),
    SECOND("Я ищу собаку для неспешных прогулок"),
    THIRD("Я предпочитаю активные прогулки с собакой"),
    FOURTH("Я предпочитаю очень активные прогулки с дополнительными физическими нагрузками для меня и собаки");

    @Getter
    private final String answer;

    Walk(String answer) {
        this.answer = answer;
    }
}
