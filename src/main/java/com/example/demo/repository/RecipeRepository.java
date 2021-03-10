package com.example.demo.repository;

import com.example.demo.entity.Ingredient;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.RecipeCategory;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Locale;

public interface RecipeRepository extends CrudRepository<Recipe,Integer> {

     List<Recipe> findRecipesByRecipeNameContaining(String name);

     @Query("select i from Recipe i where i.recipeIngredients = :ingredient")
     List<Recipe> findRecipesByIngredient (@Param("ingredient") Ingredient ingredient);

      @Query("select a from Recipe a where a.categories = :recipeCategory")
    List<Recipe> findRecipesByCategories(@Param("recipeCategory") List<RecipeCategory> recipeCategory);




}
