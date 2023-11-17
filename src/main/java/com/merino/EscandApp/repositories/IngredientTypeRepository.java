package com.merino.EscandApp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.merino.EscandApp.entities.IngredientType;

@EnableJpaRepositories
public interface IngredientTypeRepository extends JpaRepository<IngredientType, String>{
     @Query("SELECT ingredientTypeName FROM IngredientType")
    public List<IngredientType> searchByType();    
}
