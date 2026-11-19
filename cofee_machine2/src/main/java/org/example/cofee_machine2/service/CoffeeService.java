package org.example.cofee_machine2.service;

import org.example.cofee_machine2.dto.CoffeeCreateDto;
import org.example.cofee_machine2.dto.CoffeeDto;
import org.example.cofee_machine2.entity.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeService
{
    public List<CoffeeDto> allCoffees();
    public Optional<CoffeeDto> oneCoffee(Long id);
    CoffeeDto createCoffee(CoffeeCreateDto coffee);


    CoffeeDto updateCoffee(CoffeeDto coffee);

}
