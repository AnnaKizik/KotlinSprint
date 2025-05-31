package org.example.lesson_14

open class Chat(
    val chatMessages: MutableList<Message> = mutableListOf()
) {
    var lastMessageId = chatMessages.size

    fun addMessage(author: String, message: String) {
        chatMessages.add(Message(++lastMessageId, author, message))
    }

    fun addThreadMessage(author: String, message: String, parentMessageId: Int) {
        chatMessages.add(ChildMessage(++lastMessageId, author, message, parentMessageId))
    }

    fun printChat() {
        val parentMessages = chatMessages.filterNot { it is ChildMessage }.sortedBy { it.messageId }
        val messagesByParentId = chatMessages.groupBy {
            if (it is ChildMessage)
                it.parentMessageId
            else
                it.messageId
        }

        for (i in parentMessages) {
            println("${i.messageAuthor}: ${i.messageText}")

            val thread = messagesByParentId[i.messageId]
                ?.filterIsInstance<ChildMessage>()
                ?.sortedBy { it.messageId }

            thread?.forEach { reply ->
                println("\t${reply.messageAuthor}: ${reply.messageText}")
            }
        }

    }
}

open class Message(
    val messageId: Int,
    val messageAuthor: String,
    val messageText: String
)

class ChildMessage(
    messageId: Int,
    messageAuthor: String,
    messageText: String,
    val parentMessageId: Int,
) : Message(messageId, messageAuthor, messageText)

fun main() {

    val chat1 = Chat().apply {
        addMessage("Миша", "Всем привет!")
        addMessage("Лена", "Привет!")
        addThreadMessage("Миша", "Что думаете о последних новостях?", 1)
        addThreadMessage("Лена", "Какие планы на выходные?", 2)
        addThreadMessage("Юлия", "Думаю, что не хочу об этом думать 0-0", 1)
        addThreadMessage("Олег", "Морально готовиться к будням :(", 2)
    }

    chat1.printChat()

}