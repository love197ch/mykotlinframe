package com.dz.mykotlin.ui.activity.login

import android.content.Intent
import android.widget.Toast
import androidx.lifecycle.Observer
import com.dz.mykotlin.R
import com.dz.mykotlin.ui.activity.main.MainActivity
import com.dz.mykotlin.ui.base.BaseVmActivity
import com.dz.mykotlin.utils.Bus
import kotlinx.android.synthetic.main.activity_login.*

import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : BaseVmActivity<LoginViewModel>() {

    override fun layoutRes() = R.layout.activity_login

    override fun viewModelClass() = LoginViewModel::class.java

    override fun initView() {
        b_login.setOnClickListener {
            mViewModel.getProjectList()
        }
    }

    override fun observe() {
        super.observe()
        mViewModel.run {
            submitting.observe(this@LoginActivity, Observer {
                if (it) showProgressDialog(R.string.logging_in) else hideProgressDialog()
            })
            articleList.observe(this@LoginActivity, Observer {
                if (it.size > 0) {
                    startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                    Bus.postDelay("ch", true)
                    finish()
                }
            })
        }
    }

}
