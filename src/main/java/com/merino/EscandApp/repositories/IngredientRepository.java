package com.merino.EscandApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.merino.EscandApp.entities.Ingredient;

@EnableJpaRepositories
public interface IngredientRepository extends JpaRepository<Ingredient, String>{

} 
