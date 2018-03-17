package com.lishide.kotlindp.activity.builder.demo2

/**
 * Created by lishide on 18-3-17.
 * 具体的 Builder 类，HonorBuilder
 */
class HonorBuilder : Builder() {
    private val mMobile = HonorMobile()
    override fun buildBrand(brand: String) {
        mMobile.setBrand(brand)
    }

    override fun buildMemory(memory: Int) {
        mMobile.setMemory(memory)
    }

    override fun buildScreen(screen: Float) {
        mMobile.setScreen(screen)
    }

    override fun buildOS() {
        mMobile.setOS()
    }

    override fun create(): Mobile {
        return mMobile
    }
}