package com.example.helloworld


fun main() {
    // for循环
    // ..定义全开区间
    println("..定义全开区间")
    val a = 1..10
    for (i in a) {
        println(i)
    }
    // until定义左开右闭区间
    println("until定义左开右闭区间")
    val b = 0 until 10
    for (i in b) {
        println(i)
    }
    // for...in循环定义步长
    println("for...in循环定义步长")
    val c = 0 until 11 step 2
    for (i in c) {
        println(i)
    }
    // downTo定义降序区间
    println("downTo定义降序区间")
    val d = 10 downTo 0 step 3
    for (i in d) {
        println(i)
    }


}