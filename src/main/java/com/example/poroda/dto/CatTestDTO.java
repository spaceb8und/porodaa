package com.example.poroda.dto;

import com.example.poroda.entity.cat.test.answers.b1.Activity;
import com.example.poroda.entity.cat.test.answers.b1.Communication;
import com.example.poroda.entity.cat.test.answers.b1.Talkativeness;
import com.example.poroda.entity.cat.test.answers.b2.Allergy;
import com.example.poroda.entity.cat.test.answers.b2.BodyType;
import com.example.poroda.entity.cat.test.answers.b2.Time;
import com.example.poroda.entity.cat.test.answers.b3.Condition;
import com.example.poroda.entity.cat.test.answers.b3.Kids;
import lombok.Data;

@Data
public class CatTestDTO {

    private Long id;

    private Activity activity;

    private Communication communication;

    private Talkativeness talkativeness;

    private Allergy allergy;

    private BodyType bodyType;

    private Time time;

    private Condition condition;

    private Kids kids;
}
