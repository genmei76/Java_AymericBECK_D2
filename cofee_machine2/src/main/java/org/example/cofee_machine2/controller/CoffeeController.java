package org.example.cofee_machine2.controller;

import jakarta.validation.Valid;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.example.cofee_machine2.dto.CoffeeCreateDto;
import org.example.cofee_machine2.dto.CoffeeDto;
import org.example.cofee_machine2.entity.Coffee;
import org.example.cofee_machine2.repository.CoffeeRepository;
import org.example.cofee_machine2.service.CoffeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("coffees")
@RequiredArgsConstructor
public class CoffeeController
{
    private final CoffeeService coffeeService;

    @PostMapping
    CoffeeDto createCoffee(@RequestBody @Valid CoffeeCreateDto createCoffee)
    {
        return coffeeService.createCoffee(createCoffee);
    }

    @GetMapping
    List<CoffeeDto> coffees()
    {
        return coffeeService.allCoffees();
    }

    @GetMapping("{id}")
    ResponseEntity<CoffeeDto> coffee(@PathVariable Long id)
    {
        return coffeeService.oneCoffee(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
