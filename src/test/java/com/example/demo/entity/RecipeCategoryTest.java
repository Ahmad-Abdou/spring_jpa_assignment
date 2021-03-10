package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecipeCategoryTest {

    RecipeCategory testObject;

    @BeforeEach
    public void setup(){
        testObject = new RecipeCategory(1,"hot");
    }
    @Test
    @DisplayName("Test1 Created Object")
    public void test_successfully_created() {
        Assertions.assertEquals(1, testObject.getCategoryId());
        Assertions.assertEquals("hot",testObject.getCategory());

    }
    @Test
    @DisplayName("Test2 Equal")
    public void test_equal() {
        RecipeCategory expected = new RecipeCategory(1, "hot");
        Assertions.assertTrue(testObject.equals(expected));
    }
    @Test
    @DisplayName("Test3 HashCode")
    public void test_hashCode() {
        RecipeCategory expected = new RecipeCategory(1, "hot");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }

}
