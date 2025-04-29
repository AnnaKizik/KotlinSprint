package org.example.lesson_2

fun main() {

    val amountOfCrystalOreNoBuff = 7
    val amountOfIronOreNoBuff = 11
    val bonus = 20
    val intoProportion = 0.01

    val crystalOreBonus = (amountOfCrystalOreNoBuff * bonus * intoProportion).toInt()
    val ironOreBonus = (amountOfIronOreNoBuff * bonus * intoProportion).toInt()

    println("Бонус кристаллической руды: $crystalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}