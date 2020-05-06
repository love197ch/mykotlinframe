package com.dz.mykotlin.ui.activity.login

import com.dz.mykotlin.model.api.RetrofitClient



class LoginRepository {
    suspend fun getProjectList(page: Int) = RetrofitClient.apiService.getProjectList(page).apiData()
}