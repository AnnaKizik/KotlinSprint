package org.example.lesson_20

class Player(
    val playerName: String,
    var currentHealth: Int,
    val maxHealth: Int
)

val heal: (Player) -> Unit = { player ->
    println("Здоровье игрока ${player.playerName} восстановлено на ${player.maxHealth - player.currentHealth}")
    player.currentHealth = player.maxHealth
}

fun main() {
    val player1 = Player("TheBest", 12, 20)
    heal(player1)
}