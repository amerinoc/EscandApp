package com.merino.EscandApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.merino.EscandApp.entities.Recipe;

@EnableJpaRepositories
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{
    
}
