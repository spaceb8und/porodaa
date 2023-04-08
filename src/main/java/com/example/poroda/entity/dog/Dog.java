package com.example.poroda.entity.dog;

import com.example.poroda.entity.dog.test.DogTest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "dog")
public class Dog {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "dog_name")
    private String name;

    @NotNull
    @NotEmpty
    @Column(name = "origin")
    private String origin;

    @NotNull
    @NotEmpty
    @Column(name = "personality")
    private String personality;

    @NotNull
    @NotEmpty
    @Column(name = "behaviour")
    private String behaviour;

    @NotNull
    @NotEmpty
    @Column(name = "health")
    private String health;

    @NotNull
    @NotEmpty
    @Column(name = "physical_activity")
    private String physicalActivity;

    @NotNull
    @NotEmpty
    @Column(name = "food")
    private String food;

    @NotNull
    @NotEmpty
    @Column(name = "care")
    private String care;

    @NotNull
    @NotEmpty
    @Column(name = "best_for_kids")
    private String bestForKids;

    @NotNull
    @OneToOne
    @JoinColumn(name = "test_id")
    private DogTest test;
}
