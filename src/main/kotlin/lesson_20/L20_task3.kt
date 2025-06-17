package org.example.lesson_20

class Player1(val hasKey: Boolean)

fun main() {
    val checkKey: (Player1) -> String = { player ->
        if (player.hasKey == true) "Игрок открыл дверь"
        else "Дверь заперта"
    }

    val player1 = Player1(true)
    val player2 = Player1(false)

    println(checkKey(player1))
    println(checkKey(player2))
}