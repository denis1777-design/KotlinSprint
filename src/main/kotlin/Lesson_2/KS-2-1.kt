package org.example.Lesson_2

fun main() {
    val man1Ball: Byte = 3
    val man2Ball: Byte = 4
    val man3Ball: Byte = 3
    val man4Ball: Byte = 5

    println(String.format("%.2f", (((man1Ball + man2Ball + man3Ball + man4Ball) / 4).toFloat())))
}