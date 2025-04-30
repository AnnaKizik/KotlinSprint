package org.example.lesson_3

fun main() {

    val numberForMultiplicationTable = 5
    val multiplicationIndex = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i in multiplicationIndex) {
        println(
            """
        |$numberForMultiplicationTable x $i = ${numberForMultiplicationTable * i}
    """.trimMargin()
        )
    }
}