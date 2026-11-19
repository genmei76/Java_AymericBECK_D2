package org.example.cofee_machine2.repository;

import org.example.cofee_machine2.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>
{
    
}
