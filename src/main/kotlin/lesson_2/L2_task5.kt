package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val enteredSum = 70_000
    val interestRate = 0.167
    val annualAccruals = 1
    val depositPeriod = 20


    val futureDeposit = enteredSum * (1 + interestRate / annualAccruals).pow(annualAccruals * depositPeriod)

    println("Размер вклада через 20 лет составит: ${"%.3f".format(futureDeposit)}")

}