package org.example.Less_5

fun main() {

    var year: Int = 2024

    val userAge = readln().toInt()

    if (year - userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    if (year - userAge < AGE_OF_MAJORITY) {
        println("Вернуться на главный экран")
    }
}

const val AGE_OF_MAJORITY = 18