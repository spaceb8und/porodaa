package com.example.poroda.dto;

import com.example.poroda.entity.dog.test.DogTest;
import lombok.Data;

@Data
public class DogDTO {

    private Long id;

    private String name;

    private String origin;

    private String personality;

    private String behaviour;

    private String health;

    private String physicalActivity;

    private String food;

    private String care;

    private String bestForKids;

    private DogTest test;
}
