package org.example.Lesson_2

import kotlin.math.roundToInt

fun main() {

    val ironOre: Byte = 11

    val crystallineOre: Byte = 7

    val procent: Int = 20

    println("Bonus baff (iron): ${(ironOre * (1 + (procent.toDouble().div(100))) - ironOre).roundToInt()}")

    println(
        "Bonus baff (crystalline): ${
            (crystallineOre * (1 + (procent.toDouble().div(100))) - crystallineOre).roundToInt()
        }"
    )
}