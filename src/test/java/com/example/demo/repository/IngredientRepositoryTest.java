package com.example.demo.repository;

import com.example.demo.entity.Ingredient;
import com.example.demo.entity.Recipe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest
public class IngredientRepositoryTest {
    @Autowired
    IngredientRepository testObject;
    Ingredient ingredient;

    @BeforeEach
    public void setup(){
        List<Ingredient> ingredients = new ArrayList<>();
        ingredient = new Ingredient(0,"salt");
        ingredients.add(ingredient);

        testObject.save(ingredient);
    }
    @Test
    public void test_find_By_Id(){
       Optional<Ingredient> findIngredient = testObject.findById(1);
        Assertions.assertTrue(findIngredient.isPresent());
        Assertions.assertEquals("salt",findIngredient.get().getIngredientName());
        System.out.println("----------------------------------");
        System.out.println("FindIngredient.toString"+ findIngredient.toString());
    }
    @Test
    public void test_find_by_ingredient(){
        Ingredient findIngredient = testObject.findByIngredientName("salt");
        Assertions.assertEquals("salt",findIngredient.getIngredientName());
        System.out.println("----------------------------------");
        System.out.println("FindIngredient.toString() = " + findIngredient.toString());
    }
    @Test
    public void test_find_By_Ingredient_Name_Containing(){
        Ingredient findIngredient = testObject.findByIngredientNameContaining("alt");
        Assertions.assertEquals("salt",findIngredient.getIngredientName());
        System.out.println("----------------------------------");
        System.out.println("FindIngredient.toString() = " + findIngredient.toString());
    }

}
