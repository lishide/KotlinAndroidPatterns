package com.lishide.kotlindp.activity.afactory

/**
 * Created by lishide on 18-4-23.
 * 具体产品角色A1，实现了 print 方法
 */
class ConcreteProductA1 : AbstractProductA() {
    override fun printA() {
        println("printA of ConcreteProductA1")
    }
}