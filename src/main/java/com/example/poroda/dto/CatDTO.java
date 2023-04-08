package com.example.poroda.dto;

import com.example.poroda.entity.cat.test.CatTest;
import lombok.Data;

@Data
public class CatDTO {

    private Long id;

    private String name;

    private String description;

    private String origin;

    private String originCountry;

    private String personality;

    private String behaviour;

    private String health;

    private String food;

    private String care;

    private String bestForKids;

    private CatTest test;
}
