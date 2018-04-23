package com.lishide.kotlindp.activity.afactory

/**
 * Created by lishide on 18-4-23.
 * 具体产品角色B1，实现了 print 方法
 */
class ConcreteProductB1 : AbstractProductB() {
    override fun printB() {
        println("printB of ConcreteProductB1")
    }
}