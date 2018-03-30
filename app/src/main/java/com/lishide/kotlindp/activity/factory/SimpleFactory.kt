package com.lishide.kotlindp.activity.factory

/**
 * Created by lishide on 18-3-30.
 * 工厂角色，实现了根据传入的参数来创建产品的功能
 */
class SimpleFactory {
    fun createProduct(tag: String): Product? {
        var product: Product? = null
        when (tag) {
            "A" -> {
                product = ConcreteProductA()
                println("create ProductA")
            }
            "B" -> {
                product = ConcreteProductB()
                println("create ProductB")
            }
            else -> {
            }
        }

        return product
    }
}