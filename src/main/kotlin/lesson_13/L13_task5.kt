package org.example.lesson_13

class ContactData(
    val name: String,
    val number: Long,
    val company: String?
)

fun main(){

    print("Введите номер контакта: ")
    val contactNumber = readln()
    try {
        contactNumber.toLong()
    } catch (e: Exception){
        println("Возникла ошибка: ${e.javaClass.simpleName}")
    }

}