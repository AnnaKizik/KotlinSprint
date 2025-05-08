package org.example.lesson_6

import kotlin.io.println

fun main() {

    print("На сколько секунд поставить таймер? – ")
    var numberOfSeconds = readln().toInt()

    var cycleCounter = 0

    while (numberOfSeconds > 0) {
        println("Осталось секунд: $numberOfSeconds")
        numberOfSeconds--
        cycleCounter++
        Thread.sleep(1000)
    }

    println("Время вышло")

}