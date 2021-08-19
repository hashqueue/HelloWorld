package com.example.helloworld

//逻辑控制

/**
 * 条件语句if
 */

fun largeNumber2(number1: Int, number2: Int): Int {
    // if可以有返回值
    return if (number1 > number2) {
        number1
    } else {
        number2
    }
}

fun largeNumber3(number1: Int, number2: Int) = if (number1 < number2) {
    number1
} else {
    number2
}

fun largeNumber4(number1: Int, number2: Int) = if (number1 > number2) number1 else number2

/**
 * 条件语句when
 */
// when语句精确匹配
fun getScore(name: String): Int = when (name) {
    "Jack" -> 80
    "Tom" -> 50
    "Lily" -> 16
    "Bob" -> 78
    else -> 0
}
//when语句类型匹配
fun getNumberType(number: Number) = when (number) {
    is Int -> println("number is Int.")
    is Double -> println("number is Double.")
    is Float -> println("number is Float.")
    else -> println("no support type whit $number.")
}

fun main() {
    /**
     * 条件语句if
     */
    println("条件语句when")
    val a = 10
    val b = 14
    println(largeNumber2(a, b))
    println(largeNumber3(a, b))
    println(largeNumber4(a, b))
    /**
     * 条件语句when
     */
    println("条件语句when")
    // 精确匹配
    println("when精确匹配")
    println(getScore("Jack"))
    println(getScore("Bob"))
    println(getScore("Tom"))
    // 类型匹配
    println("when类型匹配")
    getNumberType(3.1415926)
    getNumberType(3)
    getNumberType(39999L)
    getNumberType(3.15f)
}
