package com.example.helloworld

// data定义数据类
data class Cellphone(val brand: String, val price: Double)

fun getParams(name: String, age: Int = 23, gender: String): String =
    "name：$name，age：$age，gender：$gender"

fun main() {
    val cellphone1 = Cellphone("小米", 4999.0)
    val cellphone2 = Cellphone("华为", 4999.0)
    val cellphone3 = Cellphone("小米", 4999.0)
    println(cellphone1)
//    println("cellphone1 equals cellphone2 ? " + (cellphone1 == cellphone2))
//    println("cellphone1 equals cellphone3 ? " + (cellphone1 == cellphone3))
    println("cellphone1 equals cellphone2 ? ${cellphone1 == cellphone2}")
    println("cellphone1 equals cellphone3 ? ${cellphone1 == cellphone3}")
    println(getParams(name = "小红", gender = "女"))
}
