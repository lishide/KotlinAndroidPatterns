package com.lishide.kotlindp.holder

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import com.lishide.kotlindp.R
import com.lishide.kotlindp.base.BaseViewHolder

class MainItemHolder(context: Context, parent: ViewGroup)
    : BaseViewHolder(context, R.layout.recycle_item_main, parent) {

    lateinit var tvTitle: TextView
    lateinit var tvSubTitle: TextView

    init {
        with(itemView) {
            tvTitle = findViewById(R.id.tvTitle)
            tvSubTitle = findViewById(R.id.tvSubTitle)
        }
    }

}