package org.example.Less_4

fun main() {
    var trainingDay: Byte = 5
    var isEvent: Boolean = true

    isEvent = ((trainingDay - TRAINING_DAY) % 2) == 0

    println(
        """
          Упражнения для рук:    ${isEvent}
          Упражнения для ног:    ${!isEvent}
          Упражнения для спины:  ${!isEvent}
          Упражнения для пресса: ${isEvent}
     """.trimIndent()
    )
}

const val TRAINING_DAY: Byte = 1