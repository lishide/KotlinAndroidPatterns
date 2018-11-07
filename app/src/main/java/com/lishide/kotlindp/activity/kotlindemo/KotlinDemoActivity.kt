package com.lishide.kotlindp.activity.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lishide.kotlindp.R
import java.lang.Integer.parseInt

/**
 * Created by bz on 2018/3/21.
 * Kotlin 语言演示
 */
class KotlinDemoActivity : AppCompatActivity(), MyInterface {

    override val prop: Int = 29

    // 非必需
    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation

    // 非必需
    override fun foo() {
        super.foo()
        println("foo 111")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_demo)

        whenExpressionTest(2)
        whenNoParamTest("test", -1)

        forTest1()
        forTest2()
        forTest3()
        forTest4()

        dataTest()
    }

    /**
     * when：任意表达式（而不只是常量） 作为分支条件
     */
    private fun whenExpressionTest(x: Int) {
        val s = "2"
        when (x) {
            parseInt(s) -> println("s encodes x")
            else -> println("s does not encode x")
        }
    }

    /**
     *  when 也可以用来取代 if - else if 链
     */
    private fun whenNoParamTest(x: String, y: Int) {
        when {
            x.isEmpty() -> println("x is empty")
            // Kotlin 中，使用 str1 == str2，比较的只是字符串的内容，此处返回的是 true
            x == "test" -> println("x's text is test")
            y == -1 -> println("y is -1")
            else -> println("otherwise")
        }
    }

    /**
     * for 示例 1：整型区间
     */
    private fun forTest1() {
        for (i in 1..4) println(i) // 输出“1234”
    }

    /**
     * for 示例 2：倒序迭代数字，步长为2
     */
    private fun forTest2() {
        for (i in 8 downTo 1 step 2) {
            println(i)  // 输出“8642”，换行输出
        }
    }

    /**
     * for 示例 3：不包括其结束元素的区间
     */
    private fun forTest3() {
        for (i in 1 until 10) {   // i in [1, 10) 排除了 10
            println(i)
        }
    }

    /**
     * for 示例 4：通过索引遍历一个数组或者一个 list
     */
    private fun forTest4() {
        val array = arrayOf("a", "b", "c")

        for (i in array.indices) {
            println(array[i])
        }
    }

    /**
     * 数据类演示
     */
    private fun dataTest() {

        val kotlin = User("kotlin", 1)
        println(kotlin)

        val kotlin2 = kotlin.copy(age = 2)
        println(kotlin2)
    }
}