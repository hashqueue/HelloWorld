package com.example.helloworld

class Student1(name: String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println("$name is reading.")
    }

    override fun doHomework() {
        println("$name is doing homework.")
    }

}

// 参数类型后边加?代表该参数可以为空
fun doStudy(study: Study?) {
    // ?. 表示对象不为空时调用相应的方法
    study?.readBooks()
    study?.doHomework()
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}

// 获取文件的长度，入参text可以为null
fun getTextLength(text: String?) = text?.length ?: 0

fun main() {
    val student = Student1("小花花", 22)
    doStudy(student)
    val a = getTextLength(null)
    val b = getTextLength("null")
    println(a)
    println(b)
}
