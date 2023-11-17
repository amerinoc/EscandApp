package com.merino.EscandApp.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Recipe")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int recipeID;

    @Column(nullable = false, name = "recipeName")
    public String recipeName;

    @Column(nullable = false, name = "recipePreparation")
    public String recipePreparation;

    @Column(nullable = false, name = "recipePrepTimeMin")
    public int recipePrepTimeMin;

    @Column(nullable = true, name = "recipeCalories")
    public int recipeCalories;

    @Column(nullable = true, name = "recipePrice")
    public float recipePrice;

    // many to many relationship
    @ManyToMany
    Set<Ingredient> ingredientRecipeFK;

    //init 
    public Recipe() {}

    public Recipe(int recipeID, String recipeName, String recipePreparation, int recipePrepTimeMin, int recipeCalories, float recipePrice, Set<Ingredient> ingredientRecipeFK) {
        this.recipeID = recipeID;
        this.recipeName = recipeName;
        this.recipePreparation = recipePreparation;
        this.recipePrepTimeMin = recipePrepTimeMin;
        this.recipeCalories = recipeCalories;
        this.recipePrice = recipePrice;
    }

    //getters / setters
    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipePreparation() {
        return recipePreparation;
    }

    public void setRecipePreparation(String recipePreparation) {
        this.recipePreparation = recipePreparation;
    }

    public int getRecipePrepTimeMin() {
        return recipePrepTimeMin;
    }

    public void setRecipePrepTimeMin(int recipePrepTimeMin) {
        this.recipePrepTimeMin = recipePrepTimeMin;
    }
    
    public int getRecipeCalories() {
        return recipeCalories;
    }

    public void setRecipeCalories(int recipeCalories) {
        this.recipeCalories = recipeCalories;
    } 

    public Float getRecipePrice() {
        return recipePrice;
    }

    public void setRecipePrice(float recipePrice) {
        this.recipePrice = recipePrice;
    }

    public Set<Ingredient> setIngredientRecipeFK() {
        return ingredientRecipeFK;
    }

    public void setIngredientRecipeFK(Set<Ingredient> ingredientRecipeFK) {
        this.ingredientRecipeFK = ingredientRecipeFK;

    }

}
