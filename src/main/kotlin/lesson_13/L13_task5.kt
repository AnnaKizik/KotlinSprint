package org.example.lesson_13

class ContactData(
    val name: String,
    val number: Long,
    val company: String?
)

fun main() {

    print("Введите номер контакта: ")
    val contactNumber = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println("Возникла ошибка: ${e::class.simpleName}")
    }

}