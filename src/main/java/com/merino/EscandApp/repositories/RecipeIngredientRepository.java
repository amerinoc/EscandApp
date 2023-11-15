package com.merino.EscandApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.merino.EscandApp.entities.RecipeIngredient;
import com.merino.EscandApp.entities.RecipeIngredientKey;

@EnableJpaRepositories
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, RecipeIngredientKey>{

    
}