package com.lishide.kotlindp.entity

/**
 * 主页列表数据
 * Created by bz on 2018/3/17.
 */
class ListItemInfo {

    var title: String? = null
    var subTitle: String? = null

    constructor() {}

    constructor(title: String, subTitle: String) {
        this.title = title
        this.subTitle = subTitle
    }
}
