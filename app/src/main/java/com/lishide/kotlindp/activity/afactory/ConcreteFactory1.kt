package com.lishide.kotlindp.activity.afactory

/**
 * Created by lishide on 18-4-23.
 * 具体工厂1
 */
class ConcreteFactory1 : AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        println("create ProductA1")
        return ConcreteProductA1()
    }

    override fun createProductB(): AbstractProductB {
        println("create ProductB1")
        return ConcreteProductB1()
    }
}