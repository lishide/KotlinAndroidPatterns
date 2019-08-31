package com.lishide.kotlindp.dp.singleton

import java.io.Serializable

class KLazilyDCLSingleton private constructor() : Serializable {  // private constructor() 构造器私有化

    fun doSomething() {
        println("do some thing")
    }

    private fun readResolve(): Any {  // 防止单例对象在反序列化时重新生成对象
        return instance
    }

    companion object {
        // 通过 @JvmStatic 注解，使得在 Java 中调用 instance 直接是像调用静态函数一样，
        // 类似 KLazilyDCLSingleton.getInstance()，
        // 如果不加注解，在 Java 中必须这样调用: KLazilyDCLSingleton.Companion.getInstance().
        @JvmStatic
        //使用 lazy 属性代理，并指定 LazyThreadSafetyMode 为SYNCHRONIZED 模式保证线程安全
        val instance: KLazilyDCLSingleton by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { KLazilyDCLSingleton() }
    }
}

//在 Kotlin 中调用，直接通过 KLazilyDCLSingleton 类名调用 instance
fun main(args: Array<String>) {
    KLazilyDCLSingleton.instance.doSomething()
}