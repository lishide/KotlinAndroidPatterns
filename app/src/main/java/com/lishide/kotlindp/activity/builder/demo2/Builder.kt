package com.lishide.kotlindp.activity.builder.demo2

/**
 * Created by lishide on 18-3-17.
 * 抽象 Builder 类
 */
abstract class Builder {
    // 设置品牌
    abstract fun buildBrand(brand: String)

    // 设置内存
    abstract fun buildMemory(memory: Int)

    // 设置屏幕
    abstract fun buildScreen(screen: Float)

    // 设置系统
    abstract fun buildOS()

    // 创建 Mobile
    abstract fun create(): Mobile
}