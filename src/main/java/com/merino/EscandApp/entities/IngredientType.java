package com.merino.EscandApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ingredient_Type")
public class IngredientType {
    
    @Id
    @Column(name = "ingredientTypeName")
    public String ingredientTypeName;

    @ManyToOne
    @JoinColumn(name="ingredient", nullable = false)
    private Ingredient ingredient;

    // init
    public IngredientType() {}

    public IngredientType(String ingredientTypeName) {
        this.ingredientTypeName = ingredientTypeName;
    }

    // getters / setters
    public String getIngredientTypeName() {
        return ingredientTypeName;
    }

    public void setIngredientTypeName(String ingredientTypeName) {
        this.ingredientTypeName = ingredientTypeName;
    }
}
