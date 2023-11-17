package com.merino.EscandApp.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ingredient")
public class Ingredient {
    
    @Id
    public String ingredientName;

    @OneToMany(mappedBy = "ingredient")
    private Set<IngredientType> ingredientTypes;

    @Column(nullable = false, name = "ingredientCalories")
    public int ingredientCalories;

    @ManyToMany
    Set<Recipe> recipeIngredientFK;

    //init
    public Ingredient() {}
    public Ingredient(String ingredientName, Set<IngredientType> ingredientTypes, int ingredientCalories, Set<Recipe> recipeIngredientFK) {
        this.ingredientName = ingredientName;
        this.ingredientTypes = ingredientTypes;
        this.ingredientCalories = ingredientCalories;
        this.recipeIngredientFK = recipeIngredientFK;
    }

    //getters / setters
    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public Set<IngredientType> getIngredientType() {
        return ingredientTypes;    
    }

    public void setIngredientType(Set<IngredientType> ingredientTypes) {
        this.ingredientTypes = ingredientTypes;
    }

    public int getIngredientCalories() {
        return ingredientCalories;
    }

    public void setIngredientCalories(int ingredientCalories) {
        this.ingredientCalories = ingredientCalories;
    }

    public Set<Recipe> getRecipeIngredientFK() {
        return recipeIngredientFK;
    }

    public void setRecipeIngredientFK(Set<Recipe> recipeIngredientFK) {
        this.recipeIngredientFK = recipeIngredientFK;
    }

}
