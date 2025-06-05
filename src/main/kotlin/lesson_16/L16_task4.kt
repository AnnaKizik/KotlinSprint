package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var status: String
) {
    private fun changeOrderStatus(newStatus: String) {
        status = newStatus
    }

    fun sendRequest(newStatus: String) {
        changeOrderStatus(newStatus)
    }

    fun getStatus() = status
}

fun main() {
    val order = Order(23, "в пути")
    order.sendRequest("готов к выдаче")
    println("Статус заказа изменен. Новый статус: ${order.getStatus()}")
}