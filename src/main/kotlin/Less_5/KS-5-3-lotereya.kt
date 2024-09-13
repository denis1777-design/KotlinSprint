package org.example.Less_5

import org.w3c.dom.ranges.Range
import kotlin.random.Random

fun main() {

    println("Введите 2 числа:")

    val numberBeingChecked1: Byte = readln().toByte()
    val numberBeingChecked2: Byte = readln().toByte()
    val range: IntRange = 0..42
    val number1: Int = Random.nextInt(0, 42)
    val number2: Int = Random.nextInt(0, 42)

    if (((number1.toByte() == numberBeingChecked1) && (number2.toByte() == numberBeingChecked2)) ||
        ((number2.toByte() == numberBeingChecked1) && (number1.toByte() == numberBeingChecked2)) &&
        (number1 in range) && (number2 in range)
    ) println(
        "Поздравляем! Вы выиграли главный приз!"
    )
    else if ((number1.toByte() == numberBeingChecked1) ||
        (number1.toByte() == numberBeingChecked2) ||
        (number2.toByte() == numberBeingChecked1) ||
        (number2.toByte() == numberBeingChecked2) &&
        (number1 in range) && (number2 in range)

    )
        println(
            "Вы выиграли утешительный приз!"
        )
    else println("Неудача!")

    println("Числа, которые нужны были для победы это: $number1 и $number2")
}
