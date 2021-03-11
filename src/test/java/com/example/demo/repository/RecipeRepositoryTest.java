package com.example.demo.repository;

import com.example.demo.entity.Ingredient;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.RecipeCategory;
import com.example.demo.entity.RecipeIngredient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.ArrayList;
import java.util.List;

@DataJpaTest
public class RecipeRepositoryTest {
    @Autowired
    RecipeRepository testObject;
    Recipe recipe;
    Ingredient ingredient;
    RecipeIngredient recipeIngredient;

    @BeforeEach
    public void setup(){
        recipe = new Recipe("pizza");
        ingredient = new Ingredient("salt");
        recipeIngredient = new RecipeIngredient(ingredient,recipe);
        testObject.save(recipe);

    }
    @Test
    public void test_find_Recipes_By_Recipe_Name_Containing(){
        List<Recipe> findRecipe = testObject.findRecipesByRecipeNameContaining("zza");
        Assertions.assertEquals("pizza",findRecipe.get(0).getRecipeName());
        System.out.println("----------------------------------");
        System.out.println("FindIngredient.toString() = " + findRecipe.toString());

    }
    //still need  to get fixed
    @Test
    public void test_find_Recipes_By_Ingredient(){
//        List<Recipe> findRecipe = testObject.findRecipesByIngredient(ingredient);
//        Assertions.assertEquals("pizza",findRecipe.get(0).getRecipeName());
//        System.out.println("----------------------------------");
//        System.out.println("FindIngredient.toString() = " + findRecipe.toString());

    }
    //still need to get fixed
    @Test
    public void test_find_Recipes_By_Categories(){
//        List<Recipe> findRecipe = testObject.findRecipesByCategories();
//        Assertions.assertEquals("hot pizza",findRecipe.get(1).getRecipeName());
//        System.out.println("----------------------------------");
//        System.out.println("FindIngredient.toString() = " + findRecipe.toString());
    }


}
