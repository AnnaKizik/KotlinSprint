package org.example.lesson_3

fun main() {

    val numberForMultiplicationTable = 5

    println((1..10).joinToString("\n") { "${numberForMultiplicationTable} x $it = ${numberForMultiplicationTable * it}" })

}