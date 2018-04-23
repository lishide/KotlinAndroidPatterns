package com.lishide.kotlindp.activity.afactory

/**
 * Created by lishide on 18-4-23.
 * 具体工厂2
 */
class ConcreteFactory2 : AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        println("create ProductA2")
        return ConcreteProductA2()
    }

    override fun createProductB(): AbstractProductB {
        println("create ProductB2")
        return ConcreteProductB2()
    }
}