package com.lishide.kotlindp.activity.factory

/**
 * Created by lishide on 18-3-30.
 * 具体产品角色B，实现了 print 方法
 */
class ConcreteProductB : Product() {
    override fun print() {
        println("print of ConcreteProductB")
    }
}