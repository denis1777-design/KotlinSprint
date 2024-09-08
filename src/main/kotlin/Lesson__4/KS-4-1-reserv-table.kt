package org.example.Lesson__4

fun main() {
    val tableToday: Byte = 13
    val tableTomorrow: Byte = 9

    val checkingTableAvailabilityToday = tableToday < TABLE_COUNT
    println("Доступность столиков на сегодня: $checkingTableAvailabilityToday")
    val checkingTableAvailabilityTomorrow = tableTomorrow < TABLE_COUNT
    println("Доступность столиков на завтра: $checkingTableAvailabilityTomorrow")
}

const val TABLE_COUNT = 13