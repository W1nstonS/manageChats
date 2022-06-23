package com.w1nst0n.managechats.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.github.rahatarmanahmed.cpv.CircularProgressView

import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.presenters.LoginPresenter
import com.w1nst0n.managechats.views.LoginView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import org.drinkless.td.libcore.telegram.TdApi

class MainActivity : MvpAppCompatActivity(), LoginView {

    private lateinit var mCpvWait: CircularProgressView
    private lateinit var mBtnVk: Button
    private lateinit var mTxtHello: TextView

    @InjectPresenter
    lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTxtHello = findViewById(R.id.txt_login_hello)
        mBtnVk = findViewById(R.id.vk_button)
        mCpvWait = findViewById(R.id.cpv_circule)

        mBtnVk.setOnClickListener {
            loginPresenter.login(true)
        }


    }

    override fun startLoading() {
        mBtnVk.visibility = View.GONE
        mCpvWait.visibility = View.VISIBLE
    }

    override fun endLoading() {
        mBtnVk.visibility = View.VISIBLE
        mCpvWait.visibility = View.GONE
    }

    override fun showError(text: String) {
        Toast.makeText(applicationContext, text , Toast.LENGTH_SHORT).show()
    }

    override fun openChats() {
        startActivity(Intent(applicationContext, ChatsActivity::class.java))
    }
}