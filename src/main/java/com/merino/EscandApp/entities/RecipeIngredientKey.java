package com.merino.EscandApp.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class RecipeIngredientKey implements Serializable{

    @Column(name = "recipeID")
    int recipeID;

    @Column(name = "ingredientName")
    String ingredientName;

    // init
    public RecipeIngredientKey() {}
    public RecipeIngredientKey(int recipeID, String ingredientName) {
        this.recipeID = recipeID;
        this.ingredientName = ingredientName;
    }

    // getters / setters
    public int getRecipeID() {
        return recipeID;
    }
    
    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + recipeID;
        result = prime * result + ((ingredientName == null) ? 0 : ingredientName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecipeIngredientKey other = (RecipeIngredientKey) obj;
        if (recipeID != other.recipeID)
            return false;
        if (ingredientName == null) {
            if (other.ingredientName != null)
                return false;
        } else if (!ingredientName.equals(other.ingredientName))
            return false;
        return true;
    }

    // hash code / equals 
    
    
}
