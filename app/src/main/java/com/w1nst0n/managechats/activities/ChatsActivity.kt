package com.w1nst0n.managechats.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.github.rahatarmanahmed.cpv.CircularProgressView
import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.adapters.ChatsAdapter
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import com.w1nst0n.managechats.presenters.ChatsPresenter
import com.w1nst0n.managechats.views.ChatsView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class ChatsActivity : MvpAppCompatActivity(), ChatsView {

    private lateinit var mAdapter: ChatsAdapter
    private lateinit var mCpvWait: CircularProgressView
    private lateinit var mTxtNoItems: TextView
    private lateinit var mRvChats: RecyclerView

    @InjectPresenter
    lateinit var chatsPresenter: ChatsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chats)
        mRvChats = findViewById(R.id.recycler_chats)
        mTxtNoItems = findViewById(R.id.txt_chats_no_items)
        mCpvWait = findViewById(R.id.cpv_chats)
        chatsPresenter.loadChats()
        mAdapter = ChatsAdapter()
        mRvChats.adapter = mAdapter
        mRvChats.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        mRvChats.setHasFixedSize(true)

    }
    override fun showError(textResource: Int) {
        mTxtNoItems.text = getString(textResource)
    }
    override fun showEmptyList() {
        mRvChats.visibility = View.GONE
        mTxtNoItems.visibility = View.VISIBLE
    }
    override fun showFullList(chatsList: ArrayList<ChatsModel>) {
        mRvChats.visibility = View.VISIBLE
        mTxtNoItems.visibility = View.GONE
        mAdapter.setupChat(chatList = chatsList)
    }
    override fun selectChat(holder: RecyclerView.ViewHolder) {
    }
    override fun startLoadind() {
        mRvChats.visibility = View.GONE
        mTxtNoItems.visibility = View.GONE
        mCpvWait.visibility = View.VISIBLE
    }

    override fun endLoading() {
        mCpvWait.visibility = View.GONE
    }


}