package org.example.Lesson_3

fun main() {
    val messageFromServer: String = "D2-D4;0"
    val messagePart1: String = messageFromServer.substringBefore('-')
    var messagePart2: String = messageFromServer.split('-', ';').toString()
    val messagePart3: String = messageFromServer.substringAfterLast(";")

    messagePart2 = messagePart2[5].toString() + messagePart2[6].toString()

    println("$messagePart1")
    println("$messagePart2")
    println("$messagePart3")
}