package com.lishide.kotlindp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lishide.kotlindp.R
import com.lishide.kotlindp.activity.factory.*
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
        toolbarTitle.text = "工厂方法模式"

        var factory1: Factory = ConcreteFactoryA()
        var product1 = factory1.factoryMethod()
        product1.print()

        factory1 = ConcreteFactoryB()
        product1 = factory1.factoryMethod()
        product1.print()


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
    }
}
