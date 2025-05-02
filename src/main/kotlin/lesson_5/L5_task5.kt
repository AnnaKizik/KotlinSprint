package org.example.lesson_5

fun main() {

    val minNumber = 0
    val maxNumber = 42
    val count = 3

    val winNumbers = List(count) { (minNumber..maxNumber).random() }
    val userNumbers = mutableListOf<Int>()

    for (i in 1..count) {
        print("Введите целое число от 0 до 42: ")
        val userNumber = readln().toInt()
        userNumbers.add(userNumber)
    }

    val result = userNumbers.intersect(winNumbers)
    val winNumbersCount = result.size

    val winOrLose = when {
        winNumbersCount == 3 -> "Вы угадали все числа и выиграли джекпот!"
        winNumbersCount == 2 -> "Вы угадали два числа и выиграли крупный приз!"
        winNumbersCount == 1 -> "Вы угадали одно число и выиграли утешительный приз!"
        else -> "Вы не угадали ни одного числа"
    }

    println(winOrLose)

    println("Выигрышные числа: $winNumbers")

}

