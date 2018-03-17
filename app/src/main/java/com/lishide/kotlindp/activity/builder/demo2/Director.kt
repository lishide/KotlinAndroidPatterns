package com.lishide.kotlindp.activity.builder.demo2

/**
 * Created by lishide on 18-3-17.
 * Director 类，负责构造 Mobile
 * 通过设置的建造者，创建产品实例
 */
class Director(builder: Builder) {
    private var mBuilder: Builder? = null

    init {
        mBuilder = builder
    }

    /**
     * 构建对象
     */
    fun construct(brand: String, memory: Int, screen: Float) {
        mBuilder?.buildBrand(brand)
        mBuilder?.buildMemory(memory)
        mBuilder?.buildScreen(screen)
        mBuilder?.buildOS()
    }
}