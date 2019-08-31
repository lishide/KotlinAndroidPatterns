package com.lishide.kotlindp.dp.singleton

import java.io.Serializable

object KSingleton : Serializable {  // 实现 Serializable 序列化接口，通过私有、被实例化的 readResolve 方法控制反序列化

    fun doSomething() {
        println("do some thing")
    }

    private fun readResolve(): Any { // 防止单例对象在反序列化时重新生成对象
        return KSingleton  // 由于反序列化时会调用 readResolve 这个钩子方法，只需要把当前的 KSingleton 对象返回而不是去创建一个新的对象
    }
}

// 在 Kotlin 中使用 KSingleton
fun main(args: Array<String>) {
    KSingleton.doSomething()  // 像调用静态方法一样，调用单例类中的方法
}