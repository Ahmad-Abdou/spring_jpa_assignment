package com.example.demo.repository;

import com.example.demo.entity.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IngredientRepository extends CrudRepository<Ingredient,Integer> {


    public Ingredient findByIngredientName(@Param("ingredient") String name);
    public Ingredient findByIngredientNameContaining(String name);

}
