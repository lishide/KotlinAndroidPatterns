package com.lishide.kotlindp.activity

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.lishide.kotlindp.R
import com.lishide.kotlindp.activity.factory.*
import kotlinx.android.synthetic.main.activity_factory.*
import kotlinx.android.synthetic.main.include_title.*

/**
 * Created by lishide on 18-3-30.
 * 工厂方法模式（简单工厂） Demo
 */
class FactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)

        mToolbar.setNavigationIcon(R.mipmap.ic_nav_back_white)
        mToolbar.setNavigationOnClickListener({ onBackPressed() })
        mToolbar.setTitleTextColor(Color.WHITE)
        mToolbar.title = "工厂方法模式"

        val dp1 = "http://p6wpxhpqt.bkt.clouddn.com/img_dp_FactoryMethod.jpg"
        val dp2 = "http://p6wpxhpqt.bkt.clouddn.com/img_dp_SimpleFactory.jpg"
        Glide.with(this)
                .load(dp1)
                .into(ivDp1)

        Glide.with(this)
                .load(dp2)
                .into(ivDp2)

        println("----------工厂方法模式 start----------")
        var factory1: Factory = ConcreteFactoryA()
        var product1 = factory1.factoryMethod()
        product1.print()

        factory1 = ConcreteFactoryB()
        product1 = factory1.factoryMethod()
        product1.print()
        println("----------工厂方法模式   end----------")


        // ===================================================== //
        println("----------简单工厂模式 start----------")
        val factory = SimpleFactory()
        var product: Product? = factory.createProduct("A")
        if (product != null) {
            product.print()
        }
        product = factory.createProduct("B")
        if (product != null) {
            product.print()
        }
        product = factory.createProduct("C")
        if (product != null) {
            product.print()
        }
        println("----------简单工厂模式   end----------")
    }
}
