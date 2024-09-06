package org.example.Lesson_2

fun main() {
    var budgetMainWoker: Int
    var budgetMainJob: Int
    var middlePriceWorker: Int

    budgetMainWoker = (50 * 30000).toInt()
    budgetMainJob = ((30 * 20000) + budgetMainWoker).toInt()
    middlePriceWorker = (budgetMainJob / (50 + 30)).toInt()

    println(budgetMainWoker)
    println(budgetMainJob)
    println(middlePriceWorker)
}