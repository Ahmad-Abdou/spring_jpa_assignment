package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RecipeTest {

    Recipe testObject;
    List<RecipeCategory> hot = new ArrayList<>();


    @BeforeEach
    public void setup(){
        testObject = new Recipe(1,"Pizza");
        testObject = new Recipe(2,"Hot Pizza",hot);
    }
    @Test
    @DisplayName("Test1 Created Object")
    public void test_successfully_created() {
        Assertions.assertEquals(1, testObject.getId());
        Assertions.assertEquals("Pizza", testObject.getRecipeName());
    }

    @Test
    @DisplayName("Test2 Equal")
    public void test_equal() {
        Recipe expected = new Recipe(1, "Pizza");
        Assertions.assertTrue(testObject.equals(expected));
    }

    @Test
    @DisplayName("Test3 HashCode")
    public void test_hashCode() {
        Recipe expected = new Recipe(1, "Pizza");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }
}
