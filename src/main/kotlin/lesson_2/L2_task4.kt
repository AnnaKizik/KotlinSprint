package org.example.lesson_2

const val INTO_PROPORTION = 0.01

fun main() {

    val amountOfCrystalOreNoBuff = 7
    val amountOfIronOreNoBuff = 11
    val bonus = 20

    val crystalOreBonus = (amountOfCrystalOreNoBuff * bonus * INTO_PROPORTION).toInt()
    val ironOreBonus = (amountOfIronOreNoBuff * bonus * INTO_PROPORTION).toInt()

    println("Бонус кристаллической руды: $crystalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}