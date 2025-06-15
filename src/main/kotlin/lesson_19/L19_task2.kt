package org.example.lesson_19

enum class Categories {
    CLOTHES,
    STATIONERY,
    OTHERS;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "одежда"
            STATIONERY -> "канцелярские товары"
            OTHERS -> "разное"
        }
    }
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Categories
) {
    fun getProductInfo() {
        println(
            """
            Товар: $name
            ID товара: $id
            Категория: ${category.getCategoryName()}
        """.trimIndent()
        )
    }
}

fun main() {
    val product1 = Product("Брюки", 3456, Categories.CLOTHES)
    val product2 = Product("Бумага А4", 5609, Categories.STATIONERY)
    val product3 = Product("Собачий корм", 4481, Categories.OTHERS)

    product1.getProductInfo()
    product2.getProductInfo()
    product3.getProductInfo()
}