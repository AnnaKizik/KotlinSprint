package org.example.lesson_16

class Gamer(
    val name: String,
    private var health: Int,
    private var impactForce: Int
) {
    fun takeDamage(damage: Int) {
        println("Получено $damage ед. урона")
        health -= damage
        if (health <= 0) becomeDead()
    }

    fun Heal(heal: Int) {
        if (health > 0) {
            println("Восстановлено $heal ед. здоровья")
            health += heal
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

    gamer.takeDamage(3)
    gamer.takeDamage(1)
    gamer.Heal(2)
    gamer.Heal(1)
    gamer.takeDamage(5)
    gamer.Heal(5)
}