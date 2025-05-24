package org.example.lesson_13

class Contact(
    val name: String,
    val number: Long,
    val company: String? = null
)

fun main() {

    val contacts = listOf(
        Contact("Андрей", 897968),
        Contact("Александр", 998712, "Компания1"),
        Contact("Юлия", 780432, "null"),
        Contact("Олег", 906090, "Компания2"),
        Contact("Ольга", 896532)
    )

    val companies = contacts
        .mapNotNull { it.company }
        .filter { it != "null" }
        .distinct()

    println(companies)

}

