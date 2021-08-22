package com.example.helloworld

import java.lang.StringBuilder

fun main() {
    val fruitList = listOf<String>("Apple", "Banana", "Pear", "Orange", "Grape")
    // run函数不能直接调用，需要使用 对象.run lambda函数 的形式去调用
    val result = StringBuilder().run {
        append("Start eating fruits.\n")
        for (fruit in fruitList) {
            append("$fruit\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
}