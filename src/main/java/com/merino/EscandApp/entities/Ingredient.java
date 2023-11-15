package com.merino.EscandApp.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ingredient")
public class Ingredient {
    
    @Id
    public String ingredientName;

    @Column(nullable = false, name = "ingredientType")
    public String ingredientType;

    @Column(nullable = false, name = "ingredientCalories")
    public int ingredientCalories;

    @ManyToMany
    Set<Recipe> recipeIngredientFK;

    //init
    public Ingredient() {}
    public Ingredient(String ingredientName, String ingredientType, int ingredientCalories, Set<Recipe> recipeIngredientFK) {
        this.ingredientName = ingredientName;
        this.ingredientType = ingredientType;
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

    public String getIngredientType() {
        return ingredientType;    
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
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
