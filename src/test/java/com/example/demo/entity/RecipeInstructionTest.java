package com.example.demo.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecipeInstructionTest {
    RecipeInstruction testObject;

    @BeforeEach
    public void setup(){
        testObject = new RecipeInstruction("simple instruction");
    }
    @Test
    @DisplayName("Test1 Created Object")
    public void test_successfully_created() {
        Assertions.assertEquals("simple instruction", testObject.getInstructions());
    }

}
