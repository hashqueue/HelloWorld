package com.example.helloworld

open class Person(val name: String, val age: Int) {

    fun eat() {
        println("$name is eating. He is $age years old.")
    }
}

fun main() {
    val p1 = Person("小花花", 21)
    println(p1.name)
    println(p1.age)
    p1.eat()
    val p2 = Person("大花花", 35)
    println(p2.name)
    println(p2.age)
    p2.eat()
}
