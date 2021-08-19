package com.example.helloworld

fun main() {
    println("Hello Kotlin!")
    // 使用var关键字创建可变变量
    var a = 10
    println("a = $a")
    a = 80
    //显示声明变量类型为Int类型
    var b: Int = 20
    b = 40
    println("b = $b")
    // 使用val关键字创建不可变变量
    val b1 = b * 10
    // b1不能再被重新赋值  Val cannot be reassigned
//    b1 = 100
    println("b1 = $b1")
}