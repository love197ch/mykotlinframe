package com.dz.mykotlin.ui.activity.main.find

import android.util.Log
import com.dz.mykotlin.R
import com.dz.mykotlin.ui.base.BaseVmFragment
import com.dz.mykotlin.utils.Bus

class FindFragment : BaseVmFragment<FindViewModel>() {

    companion object {
        fun newInstance() = FindFragment()
    }

    override fun layoutRes() = R.layout.fragment_find

    override fun viewModelClass() = FindViewModel::class.java

    override fun initView() {
        Bus.observe<Boolean>("ch1", this) {
            var a = it
            Log.e("发现", it.toString());
        }
    }

}
