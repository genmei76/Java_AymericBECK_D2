package org.example.cofee_machine2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CoffeeUpdateDto(
        String name,
        @Positive(message = "Price should be positive")
        Integer price) {}
