package com.learningkotlin.kolin

fun main() {
    fun addTwoNumbers (one: Double, two: Double) =
    one+two

    println(addTwoNumbers(12.4, 12.7))

    fun doSomeMaths(one: Double, two: Double) =
    println("one - two is ${one - two}")

//    changing the order of the parameters in kotlin
    doSomeMaths(two = 5.0, one = 6.0)




}