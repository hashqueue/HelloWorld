package com.example.helloworld

import kotlin.math.max
import kotlin.math.min


fun largeNumber(number1: Int, number2: Int): Int {
    return max(number1, number2)
}

// 函数语法糖，当函数体内容只有一行时，函数可以简化为一行代码
fun largeNumber1(number1: Int, number2: Int) = min(number1, number2)

fun main() {
    val number1 = 90
    val number2 = 180
    val result = largeNumber(number1, number2)
    val result1 = largeNumber1(number1, number2)
    println("函数largeNumber ===> $number1 和 $number2 中 $result 最大")
    println("函数largeNumber1 ===> $number1 和 $number2 中 $result1 最小")
}
