package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String
) {
    abstract fun getSquare(): Int
    abstract fun getPerimeter(): Int
}

class Circle(
    color: String,
    val radius: Int
) : Figure(color) {
    override fun getSquare() = (PI * radius * radius).toInt()
    override fun getPerimeter() = (2 * PI * radius).toInt()
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun getSquare() = width * height
    override fun getPerimeter() = (width + height) * 2
}

fun main() {

    val figure1 = Circle("белый", 2)
    val figure2 = Circle("черный", 5)
    val figure3 = Circle("черный", 4)
    val figure4 = Rectangle("белый", 4, 8)
    val figure5 = Rectangle("белый", 7, 8)
    val figure6 = Rectangle("черный", 5, 2)

    val figureList = listOf(figure1, figure2, figure3, figure4, figure5, figure6)
    var blackPerimeters = 0
    var whiteSquares = 0

    for (i in figureList) {
        if (i.color == "белый")
            whiteSquares += i.getSquare()
        else
            blackPerimeters += i.getPerimeter()
    }

    println("Сумма периметров всех черных фигур: ${blackPerimeters}")
    println("Сумма площадей всех белых фигур: $whiteSquares")

}



