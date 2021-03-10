package com.example.demo.repository;

import com.example.demo.entity.RecipeIngredient;
import org.springframework.data.repository.CrudRepository;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient,String> {
}
