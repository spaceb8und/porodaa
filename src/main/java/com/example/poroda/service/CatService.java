package com.example.poroda.service;

import com.example.poroda.dto.CatDTO;
import com.example.poroda.dto.CatTestDTO;
import com.example.poroda.entity.cat.Cat;
import com.example.poroda.entity.cat.test.CatTest;
import com.example.poroda.mapper.CatMapper;
import com.example.poroda.mapper.CatTestMapper;
import com.example.poroda.repo.CatRepository;
import com.example.poroda.repo.CatTestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {

    private final CatRepository catRepository;
    private final CatTestRepository catTestRepository;

    public CatService(CatRepository catRepository, CatTestRepository catTestRepository) {
        this.catRepository = catRepository;
        this.catTestRepository = catTestRepository;
    }

    public List<CatDTO> getAll() {
        return allCatToDTO(catRepository.findAll());
    }

    private Cat toCatEntity(CatDTO audioDTO) {
        return CatMapper.Cat_MAPPER.toEntity(audioDTO);
    }

    private CatDTO toCatDTO(Cat audio) {
        return CatMapper.Cat_MAPPER.toDTO(audio);
    }

    private List<Cat> allCatToEntity(List<CatDTO> audioDTOS) {
        return CatMapper.Cat_MAPPER.allToEntity(audioDTOS);
    }

    private List<CatDTO> allCatToDTO(List<Cat> audioList) {
        return CatMapper.Cat_MAPPER.allToDTO(audioList);
    }

    private CatTest toCatTestEntity(CatTestDTO audioDTO) {
        return CatTestMapper.CAT_TEST_MAPPER.toEntity(audioDTO);
    }

    private CatTestDTO toCatTestDTO(CatTest audio) {
        return CatTestMapper.CAT_TEST_MAPPER.toDTO(audio);
    }

    private List<CatTest> allCatTestToEntity(List<CatTestDTO> audioDTOS) {
        return CatTestMapper.CAT_TEST_MAPPER.allToEntity(audioDTOS);
    }

    private List<CatTestDTO> allCatTestToDTO(List<CatTest> audioList) {
        return CatTestMapper.CAT_TEST_MAPPER.allToDTO(audioList);
    }

}
