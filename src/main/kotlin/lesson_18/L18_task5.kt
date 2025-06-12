package org.example.lesson_18

enum class ShapeType(val rusName: String) {
    CIRCLE("круг"),
    SQUARE("квадрат"),
    POINT("точка")
}

class Screen() {
    fun draw(
        shape: ShapeType,
        x: Int,
        y: Int
    ) {
        println("Нарисована фигура: ${shape.rusName} ($x; $y)")
    }

    fun draw(
        shape: ShapeType,
        x: Float,
        y: Float
    ) {
        println("Нарисована фигура: ${shape.rusName} ($x; $y)")
    }
}

fun main() {
    val picture1 = Screen()
    val picture2 = Screen()
    val picture3 = Screen()

    picture1.draw(ShapeType.POINT, 2, 5)
    picture2.draw(ShapeType.SQUARE, 3.49f, 61.22f)
    picture3.draw(ShapeType.CIRCLE, 45, 67)
}