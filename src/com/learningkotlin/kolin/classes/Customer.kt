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
}

fun main () {
    val customer = Customer()
customer.age = 23
    val secondCustomer = Customer("Gadibia", "18 ijeoma odika street", 78)
    println("${customer.age} and ${secondCustomer.age}")
    val secondaryConstructor = Customer("Oghentevwodaro", 80)
    secondaryConstructor.age
}
