package org.example.lesson_11

import java.net.URL

class RecipeCategory(
    val categoryId: Int,
    val categoryImageUrl: String,
    val categoryName: String,
    val categoryDescription: String,
    val categoryRecipes: List<Recipe>,
)

class Recipe(
    val recipeId: Int,
    val categoryId: Int,
    val recipeImageUrl: String,
    val recipeName: String,
    val cookingMethod: List<String>,
    val isInFavorites: Boolean,
    val recipeIngredients: List<Ingredient>,
)

class Ingredient(
    val ingredientName: String,
    val quantity: Int,
    val measurementUnits: String,
)