package org.example.Less_4

fun main() {
    var trainingDay: Byte = 5

    println(
        """
          Упражнения для рук:    ${((trainingDay - TRAINING_DAY) % 2) == 0}
          Упражнения для ног:    ${((trainingDay - TRAINING_DAY) % 2) == 1}
          Упражнения для спины:  ${((trainingDay - TRAINING_DAY) % 2) == 1}
          Упражнения для пресса: ${((trainingDay - TRAINING_DAY) % 2) == 0}
     """.trimIndent()
    )
}

const val TRAINING_DAY: Byte = 1