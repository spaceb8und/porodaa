package com.example.poroda.entity.cat.test;

import com.example.poroda.entity.cat.test.answers.b1.Activity;
import com.example.poroda.entity.cat.test.answers.b1.Communication;
import com.example.poroda.entity.cat.test.answers.b1.Talkativeness;
import com.example.poroda.entity.cat.test.answers.b2.Allergy;
import com.example.poroda.entity.cat.test.answers.b2.BodyType;
import com.example.poroda.entity.cat.test.answers.b2.Time;
import com.example.poroda.entity.cat.test.answers.b3.Condition;
import com.example.poroda.entity.cat.test.answers.b3.Kids;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "cat_test")
public class CatTest {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "activity")
    private Activity activity = Activity.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "communication")
    private Communication communication = Communication.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "talkativeness")
    private Talkativeness talkativeness = Talkativeness.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "allergy")
    private Allergy allergy = Allergy.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "body_type")
    private BodyType bodyType = BodyType.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "time")
    private Time time =  Time.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "condition")
    private Condition condition = Condition.FIRST;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "kids")
    private Kids kids = Kids.FIRST;
}
