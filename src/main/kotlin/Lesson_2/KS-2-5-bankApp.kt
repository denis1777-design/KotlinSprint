package org.example.Lesson_2

import kotlin.math.pow

fun main() {

    val summaVklada: Int = 70_000
    val procentVklada: Double = 16.7
    val periodVklada: Byte = 20

    println("Deposit after 20 years: ${String.format("%.3f", summaVklada * ((100 + procentVklada) / 100).pow(20))}")
}