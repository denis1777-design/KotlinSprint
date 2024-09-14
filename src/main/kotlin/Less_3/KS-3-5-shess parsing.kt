package org.example.Less_3

fun main() {
    val messageFromServer: String = "D2-D4;0"
    val messagePart1: String = messageFromServer.substringBefore('-')
    var messagePart2: String = messageFromServer.substringAfter('-')
    val messagePart3: String = messageFromServer.substringAfterLast(";")
    var lstD4: List<String> = messagePart2.split("-", ";")

    lstD4 = listOf(lstD4[0])

    if (lstD4 is List<String>){
        println("list String")
    } else println("Char")

    println("$messagePart1")
    System.out.println(lstD4.toString().replace("^\\[|\\]$", ""));
    println("$messagePart3")
}