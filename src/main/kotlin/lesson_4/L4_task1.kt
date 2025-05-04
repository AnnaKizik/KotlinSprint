package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {

    val bookedForToday = 13
    val bookedForTomorrow = 9

    println("Доступность столиков на сегодня: ${NUMBER_OF_TABLES != bookedForToday} \nДоступность столиков на завтра: ${NUMBER_OF_TABLES != bookedForTomorrow}")

}