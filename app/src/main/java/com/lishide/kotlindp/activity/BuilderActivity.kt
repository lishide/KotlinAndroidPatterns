package com.lishide.kotlindp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lishide.kotlindp.R
import com.lishide.kotlindp.activity.builder.demo1.PhoneBuilder
import com.lishide.kotlindp.activity.builder.demo2.Director
import com.lishide.kotlindp.activity.builder.demo2.HonorBuilder
import kotlinx.android.synthetic.main.activity_builder.*
import kotlinx.android.synthetic.main.include_title.*

/**
 * Created by lishide on 18-3-17.
 * 建造者模式 Demo
 */
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

            /**
             * apply 功能：调用某对象的apply函数，在函数块内可以通过 this 指代该对象。返回值为该对象自己。
             */
        }

        val build = HonorBuilder()
        val aDirector: Director = Director(build)
        aDirector.construct("Honor 9", 4, 5.15f)

        /**
         * 注意：
         * 现实开发中，Director 常会被省略，直接使用 Builder 来进行对象的组装（链式调用）,大致如下：
         */
//        build.buildBrand("Honor V10")
//        build.buildMemory(6)
//        build.buildScreen(5.99f)
//        build.buildOS()

        tvBuild2.setOnClickListener {
            tvRes.text = build.create().toString()
        }

    }
}
