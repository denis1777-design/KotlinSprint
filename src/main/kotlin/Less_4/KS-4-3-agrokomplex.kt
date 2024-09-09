package org.example.Less_4

fun main() {
    val weather: Boolean = true
    val tent: Boolean = true
    val humidity: Int = 20
    val timeOfYear: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weather == WEATHER_TODAY) && (tent == TENT) && (humidity == HUMIDITY) && (timeOfYear == TIME_OF_YEAR)}")
}

const val WEATHER_TODAY: Boolean = true
const val TENT: Boolean = true
const val HUMIDITY: Int = 20
const val TIME_OF_YEAR: String = "не зима"