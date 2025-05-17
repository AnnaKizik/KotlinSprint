package org.example.lesson_11

class Room(
    val cover: String,
    val name: String,
    val members: MutableList<Users>,

    ) {

    fun addMember(newMember: Users) {
        members.add(newMember)
    }

    fun updateUserInformation(userName: Users) {
        print("Имя пользователя: ")
        userName.nikname = readln()
        print("Укажите статус: ")
        userName.status = readln()
    }

}

class Users(
    val foto: String,
    var nikname: String,
    var status: String? = null,
)

val room1 = Room(
    "Изображение",
    "Рабочий чат",
    mutableListOf(
        Users(
            "Фото 1",
            "Денис",
        ),
        Users(
            "Фото 2",
            "Антон",
        ),
        Users(
            "Фото 3",
            "Лена",
        ),
    ),
)