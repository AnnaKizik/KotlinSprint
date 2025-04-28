package org.example.lesson_2

fun main() {

    val amountOfCrystalOreNoBuff = 7
    val amountOfIronOreNoBuff = 11
    val bonus = 0.2

    val crystalOreBonus = (amountOfCrystalOreNoBuff * bonus).toInt()
    val ironOreBonus = (amountOfIronOreNoBuff * bonus).toInt()

    println("Бонус кристаллической руды: $crystalOreBonus")
    println("Бонус железной руды: $ironOreBonus")

}