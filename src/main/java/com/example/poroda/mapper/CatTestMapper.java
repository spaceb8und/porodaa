package com.example.poroda.mapper;

import com.example.poroda.dto.CatDTO;
import com.example.poroda.dto.CatTestDTO;
import com.example.poroda.entity.cat.Cat;
import com.example.poroda.entity.cat.test.CatTest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CatTestMapper {
    CatTestMapper CAT_TEST_MAPPER = Mappers.getMapper(CatTestMapper.class);

    CatTest toEntity(CatTestDTO catTestDTO);

    CatTestDTO toDTO(CatTest catTest);

    List<CatTest> allToEntity(List<CatTestDTO> catTestDTOS);

    List<CatTestDTO> allToDTO(List<CatTest> catTestList);
}
