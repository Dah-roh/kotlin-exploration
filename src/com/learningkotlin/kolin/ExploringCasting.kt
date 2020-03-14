package com.learningkotlin.kolin

import java.math.BigDecimal
import kotlin.random.Random


fun main() {

    var finalResult: Any
    val randomNumber = Random.nextInt(3)
    finalResult = if(randomNumber == 1) {
        BigDecimal(30)
    }

    else {
        "hello"
    }

    println(finalResult)

    if(finalResult is BigDecimal) {
        finalResult.add(BigDecimal(10))
    }
    else {
        val tempResult = finalResult as String
        finalResult = tempResult.toUpperCase()

    }

    println(finalResult)
}