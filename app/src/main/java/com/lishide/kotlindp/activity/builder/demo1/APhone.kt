package com.lishide.kotlindp.activity.builder.demo1

/**
 * Created by bz on 2018/3/17.
 * 数据类
 * 编译器会自动根据主构造函数中声明的所有属性添加如下方法：
 * equals()/hashCode 函数
 * toString 格式是 "User(name=john, age=42)"
 * compontN()functions 行为方法：对应按声明顺序出现的所有属性
 * copy() 函数
 */
data class APhone(
        var brand: String,
        var memory: Int,
        var screen: Float
) {

}
