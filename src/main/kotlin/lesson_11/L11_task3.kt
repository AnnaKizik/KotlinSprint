package org.example.lesson_11

class Room(
    val cover: String,
    val name: String,
    val members: MutableList<User> = mutableListOf(),
) {

    fun addMember(newMember: User) {
        members.add(newMember)
    }

    fun updateUserInformation(userName: User, userStatus: User) {
        print("Имя пользователя: ")
        userName.nikname = readln()
        print("Укажите статус: ")
        userName.status = readln()
    }

}

class User(
    val foto: String,
    var nikname: String,
    var status: String? = null,
)

val room1 = Room(
    "Изображение",
    "Рабочий чат",
    mutableListOf(
        User(
            "Фото 1",
            "Денис",
        ),
        User(
            "Фото 2",
            "Антон",
        ),
        User(
            "Фото 3",
            "Лена",
        ),
    ),
)