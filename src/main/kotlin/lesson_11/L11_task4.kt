package org.example.lesson_11

class RecipeCategory(
    val categoryImage: String,
    val categoryName: String,
    val categoryDescription: String,
    val categoryRecipes: List<Recipe>,
)

class Recipe(
    val recipeCategory: String,
    val recipeName: String,
    val isInFavorites: Boolean,
    val recipeIngredients: List<Ingredient>,
)

class Ingredient(
    val ingredientName: String,
    val forOnePortion: Int,
)