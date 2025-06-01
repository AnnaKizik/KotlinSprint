package org.example.lesson_16

class Gamer(
    val name: String,
    private var health: Int,
    var impactForce: Int
) {
    fun takeDamage(damage: Int) {
        println("Получено $damage ед. урона")
        health = health - damage
        if (health <= 0) becomeDead()
    }

    fun takeHeal(heal: Int) {
        if (health > 0) {
            println("Восстановлено $heal ед. здоровья")
            health = health + heal
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
    gamer.takeHeal(2)
    gamer.takeHeal(1)
    gamer.takeDamage(5)
    gamer.takeHeal(5)
}