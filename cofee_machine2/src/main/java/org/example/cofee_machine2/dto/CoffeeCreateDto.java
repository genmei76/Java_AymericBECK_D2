package org.example.cofee_machine2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CoffeeCreateDto(
        @NotBlank(message = "Coffee name cannot be null")
        String name,
        @Positive(message = "Price should be positive")
        int price) {}
