package org.example.lesson_21

fun List<Int>.evenNumberSum(): Int {
    var evenNumberSum = 0
    forEach {
        if (it % 2 == 0) evenNumberSum += it
    }
    return evenNumberSum
}

fun main() {

    val listOfInt = listOf(3, 2, 6, 2, 8, 5, 7, 9, 2)

    println(listOfInt.evenNumberSum())
}