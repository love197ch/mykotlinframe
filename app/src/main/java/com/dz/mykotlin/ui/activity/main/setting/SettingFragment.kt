package com.dz.mykotlin.ui.activity.main.setting

import com.dz.mykotlin.R
import com.dz.mykotlin.ui.base.BaseVmFragment

class SettingFragment : BaseVmFragment<SettingViewModel>() {

    companion object {
        fun newInstance() = SettingFragment()
    }

    override fun layoutRes() = R.layout.fragment_setting

    override fun viewModelClass() = SettingViewModel::class.java

    override fun initView() {

    }

}
