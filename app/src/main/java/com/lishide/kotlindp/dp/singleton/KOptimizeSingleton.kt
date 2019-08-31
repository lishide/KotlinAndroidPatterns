package com.lishide.kotlindp.dp.singleton

import java.io.Serializable

class KOptimizeSingleton private constructor() : Serializable {

    companion object {
        @JvmStatic
        fun getInstance(): KOptimizeSingleton {  // 全局访问点
            return SingletonHolder.mInstance
        }
    }

    fun doSomething() {
        println("do some thing")
    }

    private object SingletonHolder {
        val mInstance: KOptimizeSingleton = KOptimizeSingleton()
    }

    private fun readResolve(): Any {  // 防止单例对象在反序列化时重新生成对象
        return SingletonHolder.mInstance
    }
}

//在 Kotlin 中调用
fun main(args: Array<String>) {
    KOptimizeSingleton.getInstance().doSomething()
}