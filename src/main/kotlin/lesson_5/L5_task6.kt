package org.example.lesson_5

import kotlin.math.pow

const val TO_METERS = 100

fun main() {

    print("Введите свой вес (кг): ")
    val userWeight = readln().toDouble()

    print("Введите свой рост (см): ")
    val userHeight = readln().toDouble()

    val heightMeters = userHeight / TO_METERS
    val bodyMassIndex = userWeight / heightMeters.pow(2)

    val lowLimit = 18.5
    val normLimit = 25
    val upLimit = 30

    val result = when {
        bodyMassIndex < lowLimit -> "ИМТ < 18.5: Недостаточная масса тела"
        bodyMassIndex >= lowLimit && bodyMassIndex < normLimit -> "18.5 ≤ ИМТ < 25: Нормальная масса тела"
        bodyMassIndex >= normLimit && bodyMassIndex < upLimit -> "25 ≤ ИМТ < 30: Избыточная масса тела"
        else -> "ИМТ ≥ 30: Ожирение"
    }

    println(result)

    println("Ваш ИМТ = %.2f".format(bodyMassIndex))

}