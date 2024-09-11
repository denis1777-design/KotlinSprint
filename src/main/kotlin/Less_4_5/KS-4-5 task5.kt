package org.example.Less_4_5

fun main() {
    print("Наличие повреждений корпуса: ")
    val isdamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val theCompositionOfTheCrew = readln().toByte()

    print("количество ящиков с провизией на борту: ")
    val numberOfBox = readln().toByte()

    print("Благоприятность метеоусловий: ")
    val isWeatherToday = readln().toBoolean()

    println(
        "Корабль может (true) или не может (false) отправиться в плавание: " +
                "${
                    isdamage || (theCompositionOfTheCrew >= THE_COMPOS_OF_THE_CREW_MIN)
                            && (theCompositionOfTheCrew <= THE_COMPOS_OF_THE_CREW_MAX)
                            && (numberOfBox > BOX) && (isWeatherToday == true)
                }"
    )
}

const val THE_COMPOS_OF_THE_CREW_MIN: Byte = 55
const val THE_COMPOS_OF_THE_CREW_MAX: Byte = 70
const val BOX: Byte = 50
