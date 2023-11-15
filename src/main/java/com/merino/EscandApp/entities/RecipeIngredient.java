package com.merino.EscandApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class RecipeIngredient {
    
    @EmbeddedId
    RecipeIngredientKey id;

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "recipeID")
    Recipe recipeId;

    @ManyToOne
    @MapsId("ingredientID")
    @JoinColumn(name = "ingredientName")
    Ingredient ingredientName;

    @Column(nullable = true, name = "ri_Quantity")
    int ri_Quantity;

    @Column(nullable = true, name = "ri_TotalWeight")
    float ri_TotalWeight;

    @Column(nullable = true, name = "ri_NetWeight")
    float ri_NetWeight;

}
