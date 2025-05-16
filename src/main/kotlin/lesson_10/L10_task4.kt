package org.example.lesson_10

const val MIN_DICE_ROLL = 1
const val MAX_DICE_ROLL = 6

fun main() {

    var winMessage: String?
    var winRounds = 0

    do {
        winMessage = roundProcess()
        if (winMessage == "Победило человечество")
            winRounds++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while (readln() == "Да")

    println("Игра окончна. Количество побед: $winRounds")
}

fun roundProcess(): String? {
    val userRoll = diceRoll()
    val computerRoll = diceRoll()
    var gameResult: String

    println("Ход игрока. Результат броска: $userRoll")
    println("Ход компьютера. Результат броска: $computerRoll")

    gameResult = when {
        userRoll > computerRoll -> "Победило человечество"
        userRoll < computerRoll -> "Победила машина"
        else -> "Победила дружба"
    }
    println(gameResult)
    return (gameResult)
}

fun diceRoll() = (MIN_DICE_ROLL..MAX_DICE_ROLL).random()
