package org.example.lesson_7

fun main() {

    print("Введите число: ")
    val userNumber = readln().toInt()
    val progression = 0 until userNumber

    for (i in progression) {
        if (i % 2 == 0) println("$i")
    }

}