package org.example.Lesson1

fun main() {
    var totalTime: Short = 5409
    var minute: Short
    var sec: Byte

    minute = ((totalTime - (60*60) - 9)/60).toShort()
    totalTime = ((totalTime - (60*60/2) - 9)).toShort()
    sec = (totalTime - 1800).toByte()
    sec = (sec +  1).toByte()
    totalTime = (totalTime/(60*60)).toShort()

    println("$totalTime:$minute:0$sec")
}