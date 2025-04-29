package org.example.lesson_2

import kotlin.math.pow

const val INTO_PROPORTION = 0.01

fun main() {

    val enteredSum = 70_000
    val interestRate = 16.7
    val annualAccruals = 1
    val depositPeriod = 20

    val futureDeposit =
        enteredSum * (1 + interestRate * INTO_PROPORTION / annualAccruals).pow(annualAccruals * depositPeriod)

    println("Размер вклада через 20 лет составит: ${"%.3f".format(futureDeposit)}")

}