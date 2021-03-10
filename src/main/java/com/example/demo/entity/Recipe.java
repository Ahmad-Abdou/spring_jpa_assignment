package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 255)
    private String recipeName;
    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> recipeIngredients;
    @OneToOne
    @JoinColumn(name = "instruction_id")
    private RecipeInstruction instruction;

    @ManyToMany
    @JoinTable(name = "recipe_recipe_category",joinColumns =@JoinColumn(name = "recipe_id")
            ,inverseJoinColumns = @JoinColumn (name = "recipe_category_id"))
    private List<RecipeCategory> categories;

    public Recipe() {
    }

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public Recipe(int recipeId, String recipeName) {
        this.id = recipeId;
        this.recipeName = recipeName;
    }

    public Recipe(int id, String recipeName, List<RecipeCategory> categories) {
        this.id = id;
        this.recipeName = recipeName;
        this.categories = categories;
    }

    public Recipe(String recipeName, List<RecipeIngredient> recipeIngredientList, RecipeInstruction instruction, List<RecipeCategory> categories) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredientList;
        this.instruction = instruction;
        this.categories = categories;
    }

    public Recipe(int recipeId, String recipeName, List<RecipeIngredient> recipeIngredientList, RecipeInstruction instruction, List<RecipeCategory> categories) {
        this.id = recipeId;
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredientList;
        this.instruction = instruction;
        this.categories = categories;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getRecipeIngredientList() {
        return recipeIngredients;
    }

    public void setRecipeIngredientList(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public RecipeInstruction getInstruction() {
        return instruction;
    }

    public void setInstruction(RecipeInstruction instruction) {
        this.instruction = instruction;
    }

    public List<RecipeCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<RecipeCategory> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(recipeIngredients, recipe.recipeIngredients) && Objects.equals(instruction, recipe.instruction) && Objects.equals(categories, recipe.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recipeName, recipeIngredients, instruction, categories);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeIngredientList=" + recipeIngredients +
                ", instruction=" + instruction +
                ", categories=" + categories +
                '}';
    }
}
