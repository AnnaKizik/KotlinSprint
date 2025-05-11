package org.example.lesson_9

fun main() {

    val forOnePortion = listOf(2, 50, 15)

    print("Укажите количество порций: ")
    val numberOfPortions = readln().toInt()

    val quantityOfIngredients = forOnePortion.map { it * numberOfPortions }
    println(
        """
        На $numberOfPortions порций вам понадобится:
        Яиц – ${quantityOfIngredients[0]} шт;
        Молока – ${quantityOfIngredients[1]} мл;
        Сливочного масла – ${quantityOfIngredients[2]} г.
    """.trimIndent()
    )

}