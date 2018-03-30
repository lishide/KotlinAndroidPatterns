package com.lishide.kotlindp.activity.factory

/**
 * Created by lishide on 18-3-30.
 * 具体工厂A
 */
class ConcreteFactoryA : Factory() {
    override fun factoryMethod(): Product {
        println("具体工厂A: create ProductA")

        return ConcreteProductA()
    }
}