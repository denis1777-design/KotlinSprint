package org.example.Lesson_3

fun main() {
    val year: Int = 1961
    var hour: Byte = 9
    var minute: Byte = 7

    println("---Взлет---")
    println("Год полета – $year")
    println(hour)  // println - переносит
    print(minute) //не переносит курсор на следущую строку

    hour = 10
    minute = 55
    println()
    println("---Посадка---")
    println("$hour:$minute")
}