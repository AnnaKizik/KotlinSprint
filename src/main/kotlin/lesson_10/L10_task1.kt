package org.example.lesson_10

const val MIN_DICE_ROLL = 1
const val MAX_DICE_ROLL = 6

fun main() {

    val userRoll = diceRoll()
    val computerRoll = diceRoll()

    println("Ход игрока. Результат броска: $userRoll")
    println("Ход компьютера. Результат броска: $computerRoll")

    val gameResult = when {
        userRoll > computerRoll -> "Победило человечество"
        userRoll < computerRoll -> "Победила машина"
        else -> "Победила дружба"
    }

    println(gameResult)
}

fun diceRoll() = (MIN_DICE_ROLL..MAX_DICE_ROLL).random()
