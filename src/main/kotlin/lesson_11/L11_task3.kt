package org.example.lesson_11

class Room(
    val cover: String,
    val name: String,
    val members: MutableList<User>,
) {

    fun addMember(newMember: User) {
        members.add(newMember)
    }

    fun updateUserInformation(userName: String, newStatus: String) {
        members.find { it.nikname == userName }?.status = newStatus
    }
}

class User(
    val foto: String,
    var nikname: String,
    var status: String,
)

fun main() {

    val room1 = Room(
        "Изображение",
        "Рабочий чат",
        mutableListOf(),
    )

    room1.addMember(User("Фото1", "Антон", "микрофон выключен"))
    room1.addMember(User("Фото2", "Юля", "микрофон выключен"))
    println(room1.members.joinToString { "${it.nikname} (${it.status})" })

    room1.updateUserInformation("Юля", "разговаривает")
    println(room1.members.joinToString { "${it.nikname} (${it.status})" })
}