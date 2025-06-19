package org.example.lesson_21

class PlayerOne(
    val playerName: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun PlayerOne.isHealthy(): Boolean = currentHealth == maxHealth

fun main() {
    val player1 = PlayerOne("Max", 12, 20)
    val player2 = PlayerOne("Cooler", 12, 12)

    println(player1.isHealthy())
    println(player2.isHealthy())
}