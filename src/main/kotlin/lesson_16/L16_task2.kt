package org.example.lesson_16

import kotlin.math.pow

class Circle(
    private val radius: Double
) {
    private val pi = 3.14

    fun circleLength() = 2 * pi * radius
    fun circleSquare() = pi * radius.pow(2)
}

fun main() {
    val circle = Circle(2.3)
    println("Длина окружности: %.2f".format(circle.circleLength()))
    println("Площадь окружности: %.2f".format(circle.circleSquare()))
}