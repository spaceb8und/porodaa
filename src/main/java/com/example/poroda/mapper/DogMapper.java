package com.example.poroda.mapper;

import com.example.poroda.dto.CatTestDTO;
import com.example.poroda.dto.DogDTO;
import com.example.poroda.entity.cat.test.CatTest;
import com.example.poroda.entity.dog.Dog;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DogMapper {
    DogMapper DOG_MAPPER = Mappers.getMapper(DogMapper.class);

    Dog toEntity(DogDTO dogDTO);

    DogDTO toDTO(Dog dog);

    List<Dog> allToEntity(List<DogDTO> dogDTOS);

    List<DogDTO> allToDTO(List<Dog> dogList);
}
