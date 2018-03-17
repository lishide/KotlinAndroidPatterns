package com.lishide.kotlindp.activity.builder.demo2

/**
 * Created by lishide on 18-3-17.
 * Director 类，负责构造 Mobile
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