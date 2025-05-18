package org.example.lesson_11

class Forum(
    val forumMembers: MutableList<ForumMember> = mutableListOf(),
    val forumMessages: MutableList<ForumMessage> = mutableListOf(),
    var lastId: Int = 0,
) {
    fun createNewUser(userName: String): ForumMember {
        lastId++
        val user = ForumMember(lastId, userName)
        forumMembers.add(user)
        return (user)
    }

    fun createNewMessage(authorId: Int, message: String): Boolean {
        for (member in forumMembers) {
            if (member.userId == authorId) {
                forumMessages.add(ForumMessage(authorId, message))
                return true
            }
        }
        return false
    }

    fun printThread() {
        forumMessages.forEach { message ->
            forumMembers.forEach { user ->
                if (user.userId == message.authorId) {
                    println("${user.userName}: ${message.message}")
                }
            }
        }
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {

    val forum = Forum()

    val user1 = forum.createNewUser("Анна")
    val user2 = forum.createNewUser("Борис")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user1.userId, "Скучаю(")

    forum.createNewMessage(user2.userId, "Привет!")
    forum.createNewMessage(user2.userId, "Я тоже скучаю(")

    forum.printThread()
}
