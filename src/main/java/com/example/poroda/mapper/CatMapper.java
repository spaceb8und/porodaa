package com.example.poroda.mapper;

import com.example.poroda.dto.CatDTO;
import com.example.poroda.entity.cat.Cat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface CatMapper {
    CatMapper Cat_MAPPER = Mappers.getMapper(CatMapper.class);

    Cat toEntity(CatDTO catDTO);

    CatDTO toDTO(Cat cat);

    List<Cat> allToEntity(List<CatDTO> catDTOS);

    List<CatDTO> allToDTO(List<Cat> catList);
}
