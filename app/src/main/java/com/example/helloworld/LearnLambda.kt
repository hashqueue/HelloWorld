package com.example.helloworld


fun main() {
    val list1 = listOf<String>("Apple", "Banana", "Orange", "Watermelon", "Pear")
    val maxLengthFruit = list1.maxOf { it.length }
    println(maxLengthFruit)
    val newList1 = list1.map { it.uppercase() }
    println(newList1)
    val newList2 = list1.map { it.lowercase() }
    println(newList2)
    val newList3 = list1.filter { it.length <= 5 }.map { it.uppercase() }
    println(newList3)
    val newList4 = list1.any { it.length <= 5 }
    println(newList4)
    val newList5 = list1.all { it.length <= 5 }
    println(newList5)
    // 开启一个子线程
    Thread {
        println("Thread is running!")
    }.start()
}

