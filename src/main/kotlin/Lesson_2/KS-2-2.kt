package org.example.Lesson_2

fun main() {
    val man: Byte = 50
    var manPrice: Int = 30000
    val stajor: Byte = 30
    var stajorPrice: Int = 20000

    var middlePriceWorker = (((stajor * stajorPrice) + (man * manPrice)) / (man + stajor))

    println(middlePriceWorker)
}