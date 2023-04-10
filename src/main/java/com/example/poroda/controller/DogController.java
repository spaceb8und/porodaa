package com.example.poroda.controller;

import com.example.poroda.dto.CatDTO;
import com.example.poroda.dto.DogDTO;
import com.example.poroda.service.CatService;
import com.example.poroda.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/dogs")
public class DogController {

    private final DogService dogService;

    @GetMapping
    public List<DogDTO> getAll() {
        return dogService.getAll();
    }

}
