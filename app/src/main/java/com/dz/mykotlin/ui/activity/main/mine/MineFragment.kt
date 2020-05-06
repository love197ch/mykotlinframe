package com.dz.mykotlin.ui.activity.main.mine

import com.dz.mykotlin.R
import com.dz.mykotlin.ui.base.BaseVmFragment

class MineFragment : BaseVmFragment<MineViewModel>() {

    companion object {
        fun newInstance() = MineFragment()
    }

    override fun layoutRes() = R.layout.fragment_mine

    override fun viewModelClass() = MineViewModel::class.java

    override fun initView() {

    }

}
