package com.w1nst0n.managechats.views


import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

@AddToEndSingle

interface DialogView: MvpView {
    fun startLoading()
    fun endLoading()
    fun showEmptyList()
    fun showFullList(dialogList: ArrayList<DialogModel>)
    fun showError(textResource:Int)
    fun send()
}