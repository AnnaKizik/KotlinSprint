package org.example.lesson_6

const val TO_MILISECONDS = 1000

fun main() {

    print("На сколько секунд поставить таймер? – ")
    val numberOfSeconds = readln().toInt()
    val miliseconds = (numberOfSeconds * TO_MILISECONDS).toLong()

    Thread.sleep(miliseconds)
    println("Прошло $numberOfSeconds секунд")

}