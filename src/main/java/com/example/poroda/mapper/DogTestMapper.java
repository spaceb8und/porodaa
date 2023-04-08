package com.example.poroda.mapper;

import com.example.poroda.dto.DogDTO;
import com.example.poroda.dto.DogTestDTO;
import com.example.poroda.entity.dog.Dog;
import com.example.poroda.entity.dog.test.DogTest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DogTestMapper {
    DogTestMapper DOG_TEST_MAPPER = Mappers.getMapper(DogTestMapper.class);

    DogTest toEntity(DogTestDTO dogTestDTO);

    DogTestDTO toDTO(DogTest dogTest);

    List<DogTest> allToEntity(List<DogTestDTO> dogTestDTOS);

    List<DogTestDTO> allToDTO(List<DogTest> dogTestList);
}
