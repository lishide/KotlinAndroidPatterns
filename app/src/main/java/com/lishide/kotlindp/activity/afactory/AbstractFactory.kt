package com.lishide.kotlindp.activity.afactory

/**
 * Created by lishide on 18-4-23.
 * 抽象工厂角色，及抽象方法
 */
abstract class AbstractFactory {
    abstract fun createProductA(): AbstractProductA
    abstract fun createProductB(): AbstractProductB
}