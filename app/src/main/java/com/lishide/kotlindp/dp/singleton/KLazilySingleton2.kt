package com.lishide.kotlindp.dp.singleton

class KLazilySingleton2 private constructor() {

    fun doSomething() {
        println("KLazilySingleton2 do some thing")
    }

    companion object {
        private var mInstance: KLazilySingleton2? = null
            get() {
                return field ?: KLazilySingleton2()
            }

        fun getInstance(): KLazilySingleton2 {
            return requireNotNull(mInstance)
        }
    }

}

// 在 Kotlin 中调用
fun main(args: Array<String>) {
    KLazilySingleton2.getInstance().doSomething()
}