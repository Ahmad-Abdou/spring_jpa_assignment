package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecipeIngredientTest {

    RecipeIngredient testObject;
    Ingredient ingredient;
    Recipe recipe;
    @BeforeEach
    public void setup(){
        testObject = new RecipeIngredient(new Ingredient(0,"salt"));
         recipe = new Recipe("pizza");
         ingredient = new Ingredient("salt");
        testObject = new RecipeIngredient(ingredient,recipe);
    }
    @Test
    @DisplayName("Test1 Created Object")
    public void test_successfully_created() {
        Assertions.assertEquals(ingredient,testObject.getIngredient());

    }
    @Test
    @DisplayName("Test2 Equal")
    public void test_equal() {
        RecipeIngredient expected = new RecipeIngredient( new Ingredient("salt") );
        Assertions.assertTrue(testObject.equals(expected));
    }

}
