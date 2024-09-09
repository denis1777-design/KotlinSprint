package org.example.Less_4

fun main() {
    val weight1: Byte = 20
    val volume1: Byte = 80
    val weight2: Byte = 50
    val volume2: Byte = 100

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${(weight1 > WEIGHT_KG_MIN) && (weight1 <= WEIGHT_KG_MAX) && (volume1 < VOLUME_L)}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${(weight2 > WEIGHT_KG_MIN) && (weight2 <= WEIGHT_KG_MAX) && (volume2 < VOLUME_L)}")
}

const val WEIGHT_KG_MIN = 35
const val WEIGHT_KG_MAX = 100
const val VOLUME_L = 100