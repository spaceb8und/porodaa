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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "dog_name")
    private String name;

    @NotNull
    @NotEmpty
    @Column(name = "picture", columnDefinition = "TEXT")
    private String picture;

    @NotNull
    @NotEmpty
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @NotNull
    @NotEmpty
    @Column(name = "origin", columnDefinition = "TEXT")
    private String origin;

    @NotNull
    @NotEmpty
    @Column(name = "personality", columnDefinition = "TEXT")
    private String personality;

    @NotNull
    @NotEmpty
    @Column(name = "behaviour", columnDefinition = "TEXT")
    private String behaviour;

    @NotNull
    @NotEmpty
    @Column(name = "health", columnDefinition = "TEXT")
    private String health;

    @NotNull
    @NotEmpty
    @Column(name = "physical_activity", columnDefinition = "TEXT")
    private String physicalActivity;

    @NotNull
    @NotEmpty
    @Column(name = "food", columnDefinition = "TEXT")
    private String food;

    @NotNull
    @NotEmpty
    @Column(name = "care", columnDefinition = "TEXT")
    private String care;

    @NotNull
    @NotEmpty
    @Column(name = "best_for_kids", columnDefinition = "TEXT")
    private String bestForKids;

    @NotNull
    @OneToOne
    @JoinColumn(name = "test_id")
    private DogTest test;
}
