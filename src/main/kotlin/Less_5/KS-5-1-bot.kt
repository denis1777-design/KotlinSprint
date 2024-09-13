package org.example.Less_5

fun main() {

    val number1: Byte = 32
    val number2: Byte = 10
    val numberChecked: Byte = readln().toByte()

    print("Сколько будет 32 + 10 = ")

    if (numberChecked == (number1 + number2).toByte()) println("Добро пожаловать!")
    else println("Доступ запрещен!")
}