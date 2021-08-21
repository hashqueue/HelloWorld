package com.example.helloworld

class Student(private val sno: String, private val grade: Int, name: String, age: Int) :
    Person(name, age) {
    init {
        //主构造函数
        println("sno is $sno")
        println("grade is $grade")
    }
}

fun main() {
    val s1 = Student("100001", 4, "小明", 25)
    s1.eat()

}
