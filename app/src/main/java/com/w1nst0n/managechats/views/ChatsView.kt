package com.w1nst0n.managechats.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

@AddToEndSingle

interface ChatsView : MvpView {
    fun showError(textResource:Int)
    fun showEmptyList()
    fun showFullList(chatsList: ArrayList<ChatsModel>)
    fun selectChat(holder: RecyclerView.ViewHolder)
    fun startLoadind()
    fun endLoading()


}

