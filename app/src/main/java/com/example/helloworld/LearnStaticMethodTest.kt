package com.example.helloworld

fun main() {
    Util().doAction1()
    // 1. kotlin中推荐使用单例类(object)的方式来声明静态函数[本质上并不是静态方法，但是却可以通过 类名.方法名() 的形式来调用该方法]
    LearnStaticMethod.doSomething()
    // 2. 使用object会对该单例类中的所有方法以静态函数的方式进行调用。
    // 如果只想让某个类中的某个方法以静态函数的方式去调用，这需要用到companion object
    Util.doAction2() // doAction2方法实际上是Util类的伴生类的一个实例方法
    // 3. 想真正意义上定义静态方法，可以通过注解和顶层方法来实现
    // 3.1 注解：(@JvmStatic只能用于类和companion object中的方法上)
    Util1.greet()
    // 3.2 顶层方法：(就是在单个kotlin文件File里定义的方法)，Java中没有顶层方法一说
    greet()
}
