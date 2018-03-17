package com.lishide.kotlindp.activity.builder

/**
 * Created by bz on 2018/3/17.
 */
class PhoneBuilder() {
    var brand: String = ""
    var memory: Int = 0
    var screen: Float = 1f
    fun build(): String {
        if (memory < 3) {
            return "memory 不能小于3"
        }
        return APhone(brand, memory, screen).toString()
    }
}