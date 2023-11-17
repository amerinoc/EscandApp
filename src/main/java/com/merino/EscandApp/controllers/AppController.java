package com.merino.EscandApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.merino.EscandApp.entities.Ingredient;
import com.merino.EscandApp.entities.IngredientType;
import com.merino.EscandApp.repositories.IngredientTypeRepository;
import com.merino.EscandApp.repositories.IngredientRepository;
import com.merino.EscandApp.repositories.RecipeIngredientRepository;
import com.merino.EscandApp.repositories.RecipeRepository;

@Controller
public class AppController {
    
    @Autowired
    private RecipeRepository recipeRepo;

    @Autowired
    private IngredientRepository ingredientRepo;

    @Autowired
    private RecipeIngredientRepository recipeIngredientRepo;
    
    @Autowired
    private IngredientTypeRepository ingredientTypeRepo;
    
    @GetMapping("/")
    public String viewHomePage() {
        return "index";
    }

    // Ingredient
    @GetMapping("/register_ingredient")
    public String showRegisterIngredient(Model model) {
        model.addAttribute("ingredient", new Ingredient());
        List<IngredientType> ingredientsTypeList = ingredientTypeRepo.searchByType();
        model.addAttribute("ingredientTypesOption", ingredientsTypeList);
        return "register_ingredient";
    }

    @PostMapping("/ingredient_registration")
    public String ingredientRegistration(Ingredient ingredient) {
        ingredientRepo.save(ingredient);
        return "index";
    }

    @GetMapping("/show_ingredient")
    public String showIngredients() {
        return "show_ingredient";
    }
    
    // Recipe
    @GetMapping("/register_recipe")
    public String showRegisterRecipe() {
        return "register_recipe";
    }    

    @GetMapping("/show_recipe")
    public String showRecipes() {
        return "show_recipe";
    }

    // Calculator
    @GetMapping("/calculator") 
    public String showCalculator() {
        return "calculator";
    }

    @PostMapping("/escandallo_calculation")
    public String escandalloCalculation() {
        return "escandallo_calculation";
    }
}
