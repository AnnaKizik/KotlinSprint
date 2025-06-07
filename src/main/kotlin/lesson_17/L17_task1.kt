package org.example.lesson_17

class Quiz(
    question: String,
    answer: String
) {
    private val quest = question
        get() = field
    private var answr = answer
        get() = field
        set(value) {
            field = value
        }
}