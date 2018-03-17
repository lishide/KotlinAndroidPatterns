package com.lishide.kotlindp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.lishide.kotlindp.adapter.MainAdapter
import com.lishide.kotlindp.entity.ListItemInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItems = ArrayList<ListItemInfo>()
        val titles = resources.getStringArray(R.array.main_item_title)
        val titlesDes = resources.getStringArray(R.array.main_item_des)
        for (i in 0 until titles.size) {
            listItems.add(ListItemInfo(titles[i], titlesDes[i]))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        val mAdapter = MainAdapter(this)
        recyclerView.adapter = mAdapter
        mAdapter.setData(listItems)
        mAdapter.notifyDataSetChanged()
    }
}
