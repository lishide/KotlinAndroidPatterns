package com.lishide.kotlindp.activity.builder.demo2

/**
 * Created by lishide on 18-3-17.
 * 手机抽象类，即 Product 角色
 */
abstract class Mobile {
    private var mBrand: String? = null
    private var mMemory: Int = 0
    private var mScreen: Float = 1f
    protected var mOS: String? = null

    fun setBrand(brand: String) {
        mBrand = brand
    }

    fun setMemory(memory: Int) {
        mMemory = memory
    }

    fun setScreen(screen: Float) {
        mScreen = screen
    }

    abstract fun setOS()

    override fun toString(): String {
        return "Mobile(mBrand=$mBrand, mMemory=$mMemory, mScreen=$mScreen, mOS=$mOS)"
    }

}