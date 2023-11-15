package com.merino.EscandApp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merino.EscandApp.repositories.IngredientRepository;
import com.merino.EscandApp.entities.Ingredient;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepo;

    public List<Ingredient> listAll(String keyword) {
        if(keyword != null) {
            return ingredientRepo.searchByType(keyword);
        }
        return ingredientRepo.findAll();
    }
}
