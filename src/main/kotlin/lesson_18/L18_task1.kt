package org.example.lesson_18

class OrderInfo(private val number: Int) {
    fun getOrderInfo(item: String) {
        println("Заказан товар: $item")
    }

    fun getOrderInfo(items: List<String>) {
        println("Заказаны следующие товары: $items")
    }
}

fun main() {
    val order1 = OrderInfo(12)
    val order2 = OrderInfo(45)

    order1.getOrderInfo("Салатник")
    order2.getOrderInfo(listOf("Маска для волос", "Шампунь", "Бальзам"))
}