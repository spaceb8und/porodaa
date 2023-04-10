package com.example.poroda.service;

import com.example.poroda.dto.CatDTO;
import com.example.poroda.dto.DogDTO;
import com.example.poroda.dto.DogTestDTO;
import com.example.poroda.entity.cat.Cat;
import com.example.poroda.entity.dog.Dog;
import com.example.poroda.entity.dog.test.DogTest;
import com.example.poroda.mapper.CatMapper;
import com.example.poroda.mapper.DogMapper;
import com.example.poroda.mapper.DogTestMapper;
import com.example.poroda.repo.DogRepository;
import com.example.poroda.repo.DogTestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    private final DogRepository dogRepository;
    private final DogTestRepository dogTestRepository;

    public DogService(DogRepository dogRepository, DogTestRepository dogTestRepository) {
        this.dogRepository = dogRepository;
        this.dogTestRepository = dogTestRepository;
    }

    public List<DogDTO> getAll() {
        return allDogToDTO(dogRepository.findAll());
    }

    private Dog toDogEntity(DogDTO audioDTO) {
        return DogMapper.DOG_MAPPER.toEntity(audioDTO);
    }

    private DogDTO toDogDTO(Dog audio) {
        return DogMapper.DOG_MAPPER.toDTO(audio);
    }

    private List<Dog> allDogToEntity(List<DogDTO> audioDTOS) {
        return DogMapper.DOG_MAPPER.allToEntity(audioDTOS);
    }

    private List<DogDTO> allDogToDTO(List<Dog> audioList) {
        return DogMapper.DOG_MAPPER.allToDTO(audioList);
    }

    private DogTest toDogTestEntity(DogTestDTO audioDTO) {
        return DogTestMapper.DOG_TEST_MAPPER.toEntity(audioDTO);
    }

    private DogTestDTO toDogTestDTO(DogTest audio) {
        return DogTestMapper.DOG_TEST_MAPPER.toDTO(audio);
    }

    private List<DogTest> allDogTestToEntity(List<DogTestDTO> audioDTOS) {
        return DogTestMapper.DOG_TEST_MAPPER.allToEntity(audioDTOS);
    }

    private List<DogTestDTO> allDogTestToDTO(List<DogTest> audioList) {
        return DogTestMapper.DOG_TEST_MAPPER.allToDTO(audioList);
    }
}
