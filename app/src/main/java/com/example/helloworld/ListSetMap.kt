package com.example.helloworld


fun main() {
    /**
     * List集合
     */
    // 使用listOf创建不可变集合
    val noFruitList = listOf<String>("Apple", "Banana", "Orange", "Pear")
    for (fruit in noFruitList) {
        println(fruit)
    }
    // 使用listOf创建不可变集合
    val fruitList = mutableListOf<String>("Apple", "Banana", "Orange", "Pear")
    fruitList.add("Grape")
    println(fruitList)
    fruitList.add(0, "Grape")
    println(fruitList)
    for (fruit in fruitList) {
        println(fruit)
    }
    /**
     * set集合
     */
    println("*******************set不可变集合********************")
    val noFruitSet = setOf<String>("苹果", "香蕉", "橘子")
    for (fruit in noFruitSet) {
        println(fruit)
    }
    println("*******************set可变集合********************")
    val fruitSet = mutableSetOf<String>("苹果", "香蕉", "橘子")
    fruitSet.add("梨")
    println(noFruitSet)
    fruitSet.add("苹果")
    println(noFruitSet)
    for (fruit in fruitSet) {
        println(fruit)
    }
    /**
     * map集合
     */
    println("*******************map集合********************")
    val fruitMap = mapOf("苹果" to 3.21, "香蕉" to 4.25, "梨" to 3.33)
    println(fruitMap["香蕉"])
    for ((fruit, price) in fruitMap) {
        println("$fruit ￥$price 一斤!")
    }
}