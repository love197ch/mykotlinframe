package com.dz.mykotlin.ui.activity.login

import androidx.lifecycle.MutableLiveData
import com.dz.mykotlin.model.bean.Article
import com.dz.mykotlin.ui.base.BaseViewModel

/**
 * @Author: Administrator
 * @Time: 2020/4/29 18:03
 * @Company：ch
 * @Description: 功能描述
 */
class LoginViewModel : BaseViewModel() {
    private var page = 0
    private val latestRepository by lazy { LoginRepository() }

    val articleList = MutableLiveData<MutableList<Article>>(mutableListOf())
    val submitting = MutableLiveData<Boolean>()

    fun getProjectList() {
        submitting.value = true
        launch(
            block = {
                val pagination = latestRepository.getProjectList(page)
                submitting.value = false
                page = pagination.curPage
                articleList.value = pagination.datas.toMutableList()
            },
            error = {
                submitting.value = false
            }
        )
    }
}