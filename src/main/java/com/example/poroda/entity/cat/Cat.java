package com.example.poroda.entity.cat;

import com.example.poroda.entity.cat.test.CatTest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "cat")
public class Cat {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "cat_name")
    private String name;

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
    @Column(name = "origin_country", columnDefinition = "TEXT")
    private String originCountry;

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
    @JoinColumn(name = "test_id", columnDefinition = "TEXT")
    private CatTest test;
}
