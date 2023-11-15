package com.merino.EscandApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.merino.EscandApp.entities.Ingredient;

@EnableJpaRepositories
public interface IngredientRepository extends JpaRepository<Ingredient, String>{

    @Query("SELECT ingredientType FROM Ingredient WHERE ingredientType = %?1%")
    public List<Ingredient> searchByType(String keyword);
    
} 
