package com.lishide.kotlindp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.ViewGroup
import com.lishide.kotlindp.activity.BuilderActivity
import com.lishide.kotlindp.entity.ListItemInfo
import com.lishide.kotlindp.holder.MainItemHolder
import org.jetbrains.anko.startActivity

class MainAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        @JvmField
        val TYPE_INFOS: Int = 0
    }

    private val mContext = context

    private val mTypes: SparseArray<Int> = SparseArray()

    private val mData: SparseArray<ListItemInfo> = SparseArray()

    private val mCache: ArrayList<ListItemInfo> = ArrayList()

    private var updateType = false


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_INFOS -> MainItemHolder(mContext, parent)
            else -> {
                throw IllegalArgumentException("Illegal type $viewType")
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            TYPE_INFOS -> bindInfos(holder, position)
        }
    }

    private fun bindInfos(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MainItemHolder).let {
            val data = mData[position]
            it.tvTitle.text = data.title
            it.tvSubTitle.text = data.subTitle
            it.itemView.setOnClickListener {
                when (position) {
                    0 -> mContext.startActivity<BuilderActivity>()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        if (updateType) {
            updateType()
            updateType = false
        }
        return mTypes.size()
    }

    override fun getItemViewType(position: Int): Int {
        return mTypes.get(position)
    }

    fun setData(data: List<ListItemInfo>?) {
        mCache.clear()
        if (data != null && data.isNotEmpty()) {
            mCache.addAll(data)
        }
        updateType = true
    }

    private fun updateType() {
        if (mCache.size > 0) {
            var index = 0
            for (p in mCache) {
                mTypes.put(index, TYPE_INFOS)
                mData.put(index, p)
                index += 1
            }
        }
    }
}