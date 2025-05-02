package org.example.lesson_3

fun main() {

    val currentStroke = "D2-D4;0"

    val parts = currentStroke.split("-", ";")

    val fromWhere = parts[0]
    val toWhere = parts[1]
    val strokeNumber = parts[2]

    println(fromWhere)
    println(toWhere)
    println(strokeNumber)

}