package com.learningkotlin.kolin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main() {
//    System.out.println("Hello World");

//    var is for mutable variables and you dont need to specify the variable type
    var name = "Daro"

//    val is for immutable variable
    val surname: String = "Gadibia"

//using string templates which makes it easier to put variables in println
    println("Hello $name ${surname.toUpperCase()}, your surname has ${surname.length} characters")

    val story = """I am a strong man and 
        | i need to do the things i want,
        | and there are several things that
        | i cant do.
    """.trimMargin()

var changedStory = story.replaceAfterLast("i", " wont do")

    println("$story $changedStory")

    val myDouble = 21.6

//    checking the data type
    println("Is my Double a double? ${myDouble is Double}. Yes, it is a ${myDouble.javaClass} and it is a ${myDouble::class.qualifiedName}")

//    converting a double to an int
val convertDoubleToInt = myDouble.toInt()

    val roundDoubleToInt = myDouble.roundToInt();
//rounding up double to int

    println("$convertDoubleToInt $roundDoubleToInt")

    val bd = BigDecimal(12)
    val result = bd.add(bd);

    println(result)




}