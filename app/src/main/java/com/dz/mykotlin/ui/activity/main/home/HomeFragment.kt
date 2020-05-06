package com.dz.mykotlin.ui.activity.main.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.dz.mykotlin.R
import com.dz.mykotlin.model.bean.Article
import com.dz.mykotlin.model.bean.Pagination
import com.dz.mykotlin.ui.base.BaseVmFragment
import com.dz.mykotlin.utils.Bus
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseVmFragment<HomeViewModel>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun layoutRes() = R.layout.fragment_home

    override fun viewModelClass() = HomeViewModel::class.java

    override fun initView() {
        Bus.observe<Boolean>("ch", this) {
            var a = it
            Log.e("home里面", it.toString());
        }
        Log.e("home外面", "asdasd");
        b_send.setOnClickListener({
            Bus.postDelay("ch1", true)
        })
    }

}
