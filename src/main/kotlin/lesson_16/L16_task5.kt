package org.example.lesson_16

class Gamer(
    private val name: String,
    private var maxHealth: Int,
    private var impactForce: Int
) {
    var health = maxHealth

    fun takeDamage(damage: Int) {
        println("Получено $damage ед. урона")
        health -= damage
        if (health <= 0) becomeDead()
    }

    fun heal(heal: Int) {
        if (health > 0) {
            println("Восстановлено $heal ед. здоровья")
            health += heal
            if (health > maxHealth) health = maxHealth
        } else println("Лечение невозможно: персонаж мертв!")
    }

    private fun becomeDead() {
        println("Персонаж мертв!")
        impactForce = 0
        health = 0
    }
}

fun main() {
    val gamer = Gamer("Warrior", 5, 10)

    println("Текущий уровень здоровья: ${gamer.health} ед.")
    gamer.takeDamage(1)
    gamer.heal(3)
    println("Текущий уровень здоровья: ${gamer.health} ед.")
    gamer.takeDamage(3)
    gamer.takeDamage(1)
    gamer.heal(2)
    gamer.heal(1)
    gamer.takeDamage(5)
    gamer.heal(5)
}