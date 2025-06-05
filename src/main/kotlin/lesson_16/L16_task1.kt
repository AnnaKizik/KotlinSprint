package org.example.lesson_16

class Cube {
    private val valueOnTheCube = (1..6).random()

    fun getCubeValue() {
        println("Число на кубике: $valueOnTheCube")
    }
}

fun main() {
    val cube = Cube()
    cube.getCubeValue()
}