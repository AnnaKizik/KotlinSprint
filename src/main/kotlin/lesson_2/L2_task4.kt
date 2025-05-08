package org.example.lesson_2

const val INTO_PROPN = 0.01

fun main() {

    val amountOfCrystalOreNoBuff = 7
    val amountOfIronOreNoBuff = 11
    val bonus = 20

    val crystalOreBonus = (amountOfCrystalOreNoBuff * bonus * INTO_PROPN).toInt()
    val ironOreBonus = (amountOfIronOreNoBuff * bonus * INTO_PROPN).toInt()

    println("Бонус кристаллической руды: $crystalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}