package org.example.lesson_18

import kotlin.math.pow

abstract class Box {
    abstract fun calculateSurfaceArea()
}

class Parallelepiped(
    private val width: Double,
    private val length: Double,
    private val height: Double
) : Box() {
    override fun calculateSurfaceArea() {
        println("Площадь поверхности: %.2f".format(2 * (width * length + width * height + length * height)))
    }
}

class Cube(
    private val ribLength: Double
) : Box() {
    override fun calculateSurfaceArea() {
        println("Площадь поверхности: %.2f".format(6 * ribLength.pow(2)))
    }
}

fun main() {
    val boxList: List<Box> = listOf(Parallelepiped(2.3, 3.0, 6.8), Cube(4.5))

    boxList.forEach { box ->
        box.calculateSurfaceArea()
    }
}
