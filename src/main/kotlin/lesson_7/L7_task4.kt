package org.example.lesson_7

fun main() {

    print("Сколько секунд засечь? – ")
    var numberOfSeconds = readln().toInt()
    val timeAmount = numberOfSeconds downTo 1

    for (i in timeAmount) {
        println("Осталось ${numberOfSeconds--} сек.")
        Thread.sleep(1000)
    }

    println("Время вышло")

}