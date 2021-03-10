package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IngredientTest {

    Ingredient testObject;

    @BeforeEach
    public void setup(){
        testObject = new Ingredient(1,"salt");
    }

    @Test
    @DisplayName("Test1 Created Object")
    public void test_successfully_created() {
        Assertions.assertEquals(1, testObject.getIngredientId());
        Assertions.assertEquals("salt",testObject.getIngredientName());

    }
    @Test
    @DisplayName("Test2 Equal")
    public void test_equal() {
        Ingredient expected = new Ingredient(1, "salt");
        Assertions.assertTrue(testObject.equals(expected));
    }
    @Test
    @DisplayName("Test3 HashCode")
    public void test_hashCode() {
        Ingredient expected = new Ingredient(1, "salt");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }
}
