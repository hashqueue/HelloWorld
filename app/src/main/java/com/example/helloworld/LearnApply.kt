package com.example.helloworld

import java.lang.StringBuilder

fun main() {
    val fruitList = listOf<String>("Apple", "Banana", "Pear", "Orange", "Grape")
    // apply函数无法指定返回值，只会返回调用对象本身
    val result = StringBuilder().apply {
        append("Start eating fruits.\n")
        for (fruit in fruitList) {
            append("$fruit\n")
        }
        append("Ate all fruits.")
    }
    println(result.toString())
}