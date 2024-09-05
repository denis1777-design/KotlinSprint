package org.example.Lesson_2

fun main() {
    println("решение задачи 1 к Уроку 1")

    var numberOfOrder: Int = 75  // кол-во заказов указал ключ.словом var как изменяемую переменную. В разные дни кол-во заказов может меняться
    println("Количество заказов интернет-магазина: $numberOfOrder")

    val notificationText: String = "Спасибо, что приобрели наш продукт!"
    println(notificationText)
    println()

    var numOfPerson:Int = 2000

    //println(numOfPerson)
    numOfPerson -= 1  // 1 уволился

    println("количество работников магазина = $numOfPerson")
}
