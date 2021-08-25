package com.example.helloworld

class LearnLateinit {

    // 延迟初始化变量
    lateinit var student: Student

    fun info(): String {
        if (!::student.isInitialized) {
            // 如果student没有被初始化过，则在此初始化
            student = Student("10002", 20, "小红", 25)
        }
        return "name: ${student.name}, age: ${student.age}, sno: ${student.sno}, grade: grade: ${student.grade}"
    }
}

fun main() {
    val ll = LearnLateinit()
    // kotlin.UninitializedPropertyAccessException: lateinit property student has not been initialized
//    println(ll.info())
    ll.student = Student("10001", 12, "小明", 23)
    println(ll.info())
}