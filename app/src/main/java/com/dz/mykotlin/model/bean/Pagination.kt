package com.dz.mykotlin.model.bean

/**
 * @Author: Administrator
 * @Time: 2020/4/29 16:06
 * @Company：ch
 * @Description: 功能描述
 */
data class Pagination<T>(
    val curPage: Int,
    val datas: List<T>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int
)