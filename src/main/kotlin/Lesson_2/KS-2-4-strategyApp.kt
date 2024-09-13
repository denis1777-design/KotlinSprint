package org.example.Lesson_2

import kotlin.math.roundToInt

fun main() {

    val ironOre: Byte = 11

    val crystallineOre: Byte = 7

    println("Bonus baff (iron): ${(ironOre * 1.2 - ironOre).roundToInt()}")

    println("Bonus baff (crystalline): ${(crystallineOre * 1.2 - crystallineOre).roundToInt()}")
}