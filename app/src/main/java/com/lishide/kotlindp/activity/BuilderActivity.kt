package com.lishide.kotlindp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lishide.kotlindp.R
import com.lishide.kotlindp.activity.builder.PhoneBuilder
import kotlinx.android.synthetic.main.activity_builder.*
import kotlinx.android.synthetic.main.include_title.*

class BuilderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)

        mToolbar.setNavigationIcon(R.mipmap.ic_nav_back_white)
        mToolbar.setNavigationOnClickListener({ onBackPressed() })
        toolbarTitle.text = "建造者模式"

        tvBuild1.setOnClickListener {
            tvRes.text = PhoneBuilder().apply {
                brand = "华为"
                memory = 3
                screen = 5.5f
            }.build()
        }
        tvBuild2.setOnClickListener {
            tvRes.text = PhoneBuilder().apply {
                brand = "小米"
                memory = 1
                screen = 5.5f
            }.build()
        }

        /**
         * apply 功能：调用某对象的apply函数，在函数块内可以通过 this 指代该对象。返回值为该对象自己。
         */
    }
}
