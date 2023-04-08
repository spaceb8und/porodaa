package com.example.poroda.dto;

import com.example.poroda.entity.dog.test.answers.b1.Expirience;
import com.example.poroda.entity.dog.test.answers.b1.Training;
import com.example.poroda.entity.dog.test.answers.b2.Time;
import com.example.poroda.entity.dog.test.answers.b2.Walk;
import com.example.poroda.entity.dog.test.answers.b3.Allergy;
import com.example.poroda.entity.dog.test.answers.b3.Size;
import com.example.poroda.entity.dog.test.answers.b3.Spit;
import com.example.poroda.entity.dog.test.answers.b3.Wool;
import com.example.poroda.entity.dog.test.answers.b4.Guard;
import com.example.poroda.entity.dog.test.answers.b4.Kids;
import com.example.poroda.entity.dog.test.answers.b4.Noise;
import com.example.poroda.entity.dog.test.answers.b4.OtherAnimals;
import lombok.Data;

@Data
public class DogTestDTO {

    private Long id;

    private Expirience expirience;

    private Training training;

    private Walk walk;

    private Time time;

    private Size size;

    private Spit spit;

    private Wool wool;

    private Allergy allergy;

    private Noise noise;

    private Guard guard;

    private OtherAnimals otherAnimals;

    private Kids kids;
}
