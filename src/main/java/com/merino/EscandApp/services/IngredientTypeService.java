package com.merino.EscandApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merino.EscandApp.entities.IngredientType;
import com.merino.EscandApp.repositories.IngredientTypeRepository;


@Service
public class IngredientTypeService {
    @Autowired
    private IngredientTypeRepository ingredientTypeRepo;

    public List<IngredientType> listAll() {
        return ingredientTypeRepo.findAll();
    }
}
