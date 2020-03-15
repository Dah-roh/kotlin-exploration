package com.learningkotlin.kolin.classes

class Customer {
    var name: String = ""
    var address: String = ""
    var age: Int = 0
    constructor()
constructor(name: String, address: String, age: Int) {
    this.name = name
    this.address = address
    this.age = age
}


    constructor(name: String, age: Int): this(name, "", age) {
        println("secondary constructor")
    }

    init {
        println("init block")
    }

    var approved: Boolean = false
        set(value) {
            if (age<=100) {
                field = value
            }
            else {
                println("You can't approve a customer under 100 years old")
            }
        }

    val nextAge
    get() = age + 1
}

fun main () {
    val customer = Customer()
customer.age = 23
    val secondCustomer = Customer("Gadibia", "18 ijeoma odika street", 78)
    secondCustomer.approved = true
    println("${customer.age} is ${customer.approved} and ${secondCustomer.age} ${secondCustomer.approved}")
    val secondaryConstructor = Customer("Oghentevwodaro", 80)
    println("${secondaryConstructor.age}")
}
