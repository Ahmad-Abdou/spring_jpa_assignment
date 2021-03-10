package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class RecipeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(length = 255)
    private String category;



    public RecipeCategory() {
    }

    public RecipeCategory(String category) {
        this.category = category;
    }

    public RecipeCategory(int recipe_categoryId, String category) {
        this.id = recipe_categoryId;
        this.category = category;
    }

    public RecipeCategory(String category, List<Recipe> recipes) {
        this.category = category;
//        this.recipes = recipes;
    }

    public RecipeCategory(int recipe_categoryId, String category, List<Recipe> recipes) {
        this.id = recipe_categoryId;
        this.category = category;
//        this.recipes = recipes;
    }

    public int getCategoryId() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return id == that.id && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}

