package com.example.poroda.controller;

import com.example.poroda.dto.CatDTO;
import com.example.poroda.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cats")
public class CatController {

    private final CatService catService;

    @GetMapping
    public List<CatDTO> getAll() {
        return catService.getAll();
    }
}
