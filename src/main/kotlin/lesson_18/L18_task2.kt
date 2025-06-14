package org.example.lesson_18

const val DICE_MIN = 1

abstract class Dice(private val numberOfFaces: Int) {
    fun rollDice() {
        println("Результат броска (d$numberOfFaces): ${(DICE_MIN..numberOfFaces).random()}")
    }
}

class Dice4() : Dice(4)

class Dice6() : Dice(6)

class Dice8() : Dice(8)

fun main() {
    val diceList: List<Dice> = listOf(Dice4(), Dice6(), Dice8())

    diceList.forEach { dice ->
        dice.rollDice()
    }
}