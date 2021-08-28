package com.example.helloworld

object LearnExtensionFunction {
    fun countLetters(str: String): Int {
        var counter: Int = 0
        for (item in str) {
            if (item.isLetter()) {
                counter += 1
            }
        }
        return counter
    }
}

fun main() {
    val str = "ABC123xyz!@#"
    println("字符串$str 中一共有${LearnExtensionFunction.countLetters(str = str)}个字母和数字.")
    println("字符串$str 中一共有${str.letterCounter()}个字母和数字.")
}
