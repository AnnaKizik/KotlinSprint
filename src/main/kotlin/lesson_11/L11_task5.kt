package org.example.lesson_11

private val forumMembers = mutableListOf<ForumMember>()
private val forumMessages = mutableListOf<ForumMessage>()
private var lastId = 0

class Forum() {

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
    var userId: Int,
    var userName: String,
)

class ForumMessage(
    var authorId: Int,
    var message: String,
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
