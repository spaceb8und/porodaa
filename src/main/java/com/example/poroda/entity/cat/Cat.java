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
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "cat_name")
    private String name;

    @NotNull
    @NotEmpty
    @Column(name = "origin")
    private String origin;

    @NotNull
    @NotEmpty
    @Column(name = "origin_country")
    private String originCountry;

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
    private CatTest test;
}
