package org.example.Less_5

fun main() {

    println("Введите 2 числа:")

    val numberBeingChecked1: Byte = readln().toByte()
    val numberBeingChecked2: Byte = readln().toByte()
    val number1: Byte = 13
    val number2: Byte = 22


    if (((number1 == numberBeingChecked1) && (number2 == numberBeingChecked2)) ||
        ((number2 == numberBeingChecked1) && (number1 == numberBeingChecked2)) &&
        (number1 >= RANGE_MIN) &&
        (number1 <= RANGE_MAX) &&
        (number2 >= RANGE_MIN) &&
        (number2 <= RANGE_MAX)
    ) println(
        "Поздравляем! Вы выиграли главный приз!"
    )
    else if ((number1 == numberBeingChecked1) ||
        (number1 == numberBeingChecked2) ||
        (number2 == numberBeingChecked1) ||
        (number2 == numberBeingChecked2) &&
        (number1 >= RANGE_MIN) &&
        (number1 <= RANGE_MAX) &&
        (number2 >= RANGE_MIN) &&
        (number2 <= RANGE_MAX)
    )
        println(
            "Вы выиграли утешительный приз!"
        )
    else println("Неудача!")

    println("Числа, которые нужны были для победы это: $number1 и $number2")
}

const val RANGE_MIN: Byte = 0
const val RANGE_MAX: Byte = 42