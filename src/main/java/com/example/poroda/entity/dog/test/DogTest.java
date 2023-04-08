package com.example.poroda.entity.dog.test;

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
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "dog_test")
public class DogTest {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "expirience")
    private Expirience expirience = Expirience.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "training")
    private Training training = Training.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "walk")
    private Walk walk = Walk.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "time")
    private Time time = Time.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "size")
    private Size size = Size.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "spit")
    private Spit spit = Spit.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "wool")
    private Wool wool = Wool.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "allergy")
    private Allergy allergy = Allergy.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "noise")
    private Noise noise = Noise.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "guard")
    private Guard guard = Guard.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "other_animals")
    private OtherAnimals otherAnimals = OtherAnimals.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "kids")
    private Kids kids = Kids.FIRST;


}
