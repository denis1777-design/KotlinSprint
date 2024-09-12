package org.example.Lesson_5

import kotlin.random.Random

fun main() {

    println("Введите 3 числа:")

    val numberBeingChecked1: Byte = readln().toByte()
    val numberBeingChecked2: Byte = readln().toByte()
    val numberBeingChecked3: Byte = readln().toByte()
    val number1: Int = Random.nextInt(0, 10)
    val number2: Int = Random.nextInt(0, 10)
    val number3: Int = Random.nextInt(0, 10)
    var sizeList: Byte = 0


    var rndLuckyNumbers: MutableList<Byte> =
        mutableListOf(numberBeingChecked1, numberBeingChecked2, numberBeingChecked3)
    println(rndLuckyNumbers)
    var rndNumbers: MutableList<Int> = mutableListOf(number1, number2, number3)
    println(rndNumbers)

    sizeList = rndLuckyNumbers.count().toByte()
    println(sizeList)

    var intersection = rndLuckyNumbers.intersect(rndNumbers)

    if (rndLuckyNumbers == intersection.toMutableList() && (rndNumbers.size == 3)) {
        println(
            "Поздравляем! Вы угадали все 3 числа и взяли джекпот!"
        )
        intersection = setOf(rndLuckyNumbers.count().toByte())
        println(intersection)
    }

    else if (rndLuckyNumbers == intersection.toMutableList() && (rndNumbers.size == 2))

        println(
            "Вы угадали 2 числа и получаете крупный приз!"
        )
    else if (rndLuckyNumbers == intersection.toMutableList() && (rndNumbers.size == 1))  println ("Вам утешительный приз!")
    else println("Вы не угадали")

    println("Числа, которые нужны были для победы это: $number1 $number2 и $number3")
}
