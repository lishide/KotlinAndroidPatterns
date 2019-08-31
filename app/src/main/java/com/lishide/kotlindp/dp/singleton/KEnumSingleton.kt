package com.lishide.kotlindp.dp.singleton

enum class KEnumSingleton {
    INSTANCE;

    fun doSomeThing() {
        println("do some thing")
    }
}

//在 Kotlin 中调用
fun main(args: Array<String>) {
    KEnumSingleton.INSTANCE.doSomeThing()
}