package com.example.helloworld

import java.lang.StringBuilder

fun main() {
    val fruitList = listOf<String>("Apple", "Banana", "Pear", "Orange", "Grape")
    val result = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (fruit in fruitList) {
            append("$fruit\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
}