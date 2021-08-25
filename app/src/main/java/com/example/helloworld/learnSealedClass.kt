package com.example.helloworld

// sealed定义密封类 密封类及其子类只能定义在kt文件的顶层位置
sealed class Result
class Success(val msg: String) : Result()
class Failure(val error: String) : Result()
class Unknown(val hint: String) : Result()

fun getResultMsg(result: Result) = when (result) {
    is Success -> result.msg
    is Failure -> result.error
    else -> "unknown"
}

fun main() {
    println(getResultMsg(Success(msg = "success")))
    println(getResultMsg(Failure(error = "err")))
    println(getResultMsg(Unknown(hint = "unknown")))
}
