package org.example.lesson_13

class ContactInfo(
    val name: String,
    val number: Long,
    val company: String?
) {
    fun printContactInformation() =
        println("- Имя: $name\n- Номер: $number\n- Компания: ${company ?: "не указано"}\n")
}

fun main() {

    val contactsList: MutableList<ContactInfo> = mutableListOf()
    var contactName: String
    var contactNumber: Long?
    var contactCompany: String?
    var newEntry = "нет"

    do {
        print("Введите имя контакта: ")
        contactName = readln()

        print("Введите номер контакта: ")
        contactNumber = readln().toLongOrNull()
        if (contactNumber == null) {
            println("Вы не ввели номер!")
            continue
        }

        print("Введите название компании: ")
        if (readln().isEmpty())
            contactCompany = null
        else
            contactCompany = readln()

        contactsList.add(ContactInfo(contactName, contactNumber, contactCompany))

        print("Добавить еще контакт (да/нет)? – ")
        newEntry = readln()
    } while (newEntry.contains("да", ignoreCase = true))

    contactsList.forEach { it.printContactInformation() }

}
