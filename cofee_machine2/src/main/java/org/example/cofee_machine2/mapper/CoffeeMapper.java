package org.example.cofee_machine2.mapper;

import org.example.cofee_machine2.dto.CoffeeCreateDto;
import org.example.cofee_machine2.dto.CoffeeDto;
import org.example.cofee_machine2.entity.Coffee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CoffeeMapper
{
    CoffeeDto toDto(Coffee coffee);

    @Mapping(target = "id", ignore = true)
    Coffee toEntity(CoffeeCreateDto dto);

}
