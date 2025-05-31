package org.example.lesson_14

import kotlin.math.PI

const val COLOR_WHITE = "белый"
const val COLOR_BLACK = "черный"

abstract class Figure(
    val color: String
) {
    abstract fun getSquare(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun getSquare() = (PI * radius * radius)
    override fun getPerimeter() = (2 * PI * radius)
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun getSquare() = width * height
    override fun getPerimeter() = (width + height) * 2
}

fun main() {

    val figure1 = Circle(COLOR_WHITE, 2.5)
    val figure2 = Circle(COLOR_BLACK, 5.8)
    val figure3 = Circle(COLOR_BLACK, 4.0)
    val figure4 = Rectangle(COLOR_WHITE, 4.8, 8.2)
    val figure5 = Rectangle(COLOR_WHITE, 7.9, 8.8)
    val figure6 = Rectangle(COLOR_BLACK, 5.6, 2.4)

    val figureList = listOf(figure1, figure2, figure3, figure4, figure5, figure6)

    val blackPerimeters = figureList.filter { it.color == COLOR_BLACK }.sumOf { it.getPerimeter() }
    val whiteSquares = figureList.filter { it.color == COLOR_WHITE }.sumOf { it.getSquare() }

    println("Сумма периметров всех черных фигур: %.2f".format(blackPerimeters))
    println("Сумма площадей всех белых фигур: %.2f".format(whiteSquares))

}