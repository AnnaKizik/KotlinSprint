package org.example.lesson_18

const val DICE_MIN = 1
const val MAX_FOR_D4 = 4
const val MAX_FOR_D6 = 6
const val MAX_FOR_D8 = 8

abstract class Dice(private val numberOfFaces: Int) {
    abstract fun rollDice()
}

class Dice4() : Dice(4) {
    override fun rollDice() {
        println("Результат броска (d4): ${(DICE_MIN..MAX_FOR_D4).random()}")
    }
}

class Dice6() : Dice(6) {
    override fun rollDice() {
        println("Результат броска (d6): ${(DICE_MIN..MAX_FOR_D6).random()}")
    }
}

class Dice8() : Dice(8) {
    override fun rollDice() {
        println("Результат броска (d8): ${(DICE_MIN..MAX_FOR_D8).random()}")
    }
}

fun main() {
    val diceList: List<Dice> = listOf(Dice4(), Dice6(), Dice8())

    diceList.forEach { dice ->
        dice.rollDice()
    }
}