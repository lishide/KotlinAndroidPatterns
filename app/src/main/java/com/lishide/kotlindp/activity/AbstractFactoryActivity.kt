package com.lishide.kotlindp.activity

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.lishide.kotlindp.R
import com.lishide.kotlindp.activity.afactory.AbstractFactory
import com.lishide.kotlindp.activity.afactory.ConcreteFactory1
import com.lishide.kotlindp.activity.afactory.ConcreteFactory2
import kotlinx.android.synthetic.main.activity_factory.*
import kotlinx.android.synthetic.main.include_title.*

/**
 * Created by lishide on 18-4-23.
 * 抽象工厂模式 Demo
 */
class AbstractFactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory_a)

        mToolbar.setNavigationIcon(R.mipmap.ic_nav_back_white)
        mToolbar.setNavigationOnClickListener({ onBackPressed() })
        mToolbar.setTitleTextColor(Color.WHITE)
        mToolbar.title = "抽象工厂模式"

        val dp1 = "http://p6wpxhpqt.bkt.clouddn.com/img_dp_AbatractFactory.jpg"
        Glide.with(this)
                .load(dp1)
                .into(ivDp1)

        println("----------抽象工厂模式 start----------")
        var factory: AbstractFactory = ConcreteFactory1()
        var productA = factory.createProductA()
        var productB = factory.createProductB()
        productA.printA()
        productB.printB()

        factory = ConcreteFactory2()
        productA = factory.createProductA()
        productB = factory.createProductB()
        productA.printA()
        productB.printB()
        println("----------抽象工厂模式   end----------")
    }
}
