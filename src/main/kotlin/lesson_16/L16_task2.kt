package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    private val radius: Double
) {
    fun circleLength() = 2 * PI * radius
    fun circleSquare() = PI * radius.pow(2)
}

fun main() {
    val circle = Circle(2.3)
    println("Длина окружности: %.2f".format(circle.circleLength()))
    println("Площадь окружности: %.2f".format(circle.circleSquare()))
}