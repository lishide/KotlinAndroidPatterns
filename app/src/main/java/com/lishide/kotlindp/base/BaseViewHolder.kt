package com.lishide.kotlindp.base

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

open class BaseViewHolder(
        context: Context,
        layoutResId: Int,
        parent: ViewGroup,
        attach: Boolean) : RecyclerView.ViewHolder(
        LayoutInflater.from(context).inflate(layoutResId, parent, attach)) {

    constructor(context: Context, layoutResId: Int, container: ViewGroup)
            : this(context, layoutResId, container, false)

}