package org.example.lesson_15

abstract class ForumMember(
    val memberName: String
) {
    fun createMessage() {
        println("Пользователь $memberName написал сообщение")
    }

    fun readMessage() {
        println("Пользователь $memberName прочитал сообщение")
    }
}

class BasicUser(val userName: String) : ForumMember(memberName = userName)

class Admin(val adminName: String) : ForumMember(memberName = adminName) {

    fun deleteMessage(name: ForumMember) {
        println("Администратор $adminName удалил сообщение пользователя ${name.memberName}")
    }

    fun deleteUser(name: ForumMember) {
        println("Администратор $adminName удалил пользователя ${name.memberName}")
    }
}

fun main() {

    val basicUser1 = BasicUser("Andrew")
    val basicUser2 = BasicUser("Bob")
    val admin1 = Admin("Anna")

    basicUser1.createMessage()
    basicUser2.readMessage()
    admin1.readMessage()
    admin1.deleteMessage(basicUser1)
    admin1.deleteUser(basicUser1)
}