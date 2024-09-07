package org.example.Lesson_3

fun main() {
    val messageFromServer: String = "D2-D4;0"
    val messagePart1: String = "D2-D4;0".substringBefore('-')
    var messagePart2: String = "D2-D4;0".substringAfter('-')
    val messagePart3: String = "D2-D4;0".substringAfterLast(";")

    messagePart2 = messagePart2.substringBefore(';')

    println("$messagePart1")
    println("$messagePart2")
    println("$messagePart3")
}