package org.example.Lesson_3

fun main() {
    val year: Int = 1961
    var hour: Byte = 9
    var minute: Byte = 7

    println("---Взлет---")
    println("Год полета – $year")
    println("%02d".format(hour))
    println("%02d".format(minute))

    hour = 10
    minute = 55

    println("---Посадка---")
    println("$hour:$minute")
}