package org.example.Lesson_2

fun main() {
    var firstHour: Byte = 9
    var firstMinute: Byte = 39
    val totalTimeOnWay: Short = 457
    val lastHour: Byte
    val lastMinute: Byte

    lastHour = (totalTimeOnWay / 60).toByte()
    lastMinute = (totalTimeOnWay - lastHour * 60).toByte()
    firstHour = ((firstHour + lastHour) + 1).toByte()
    firstMinute = ((firstMinute + lastMinute) - 60).toByte()

    println("$firstHour:$firstMinute")
}