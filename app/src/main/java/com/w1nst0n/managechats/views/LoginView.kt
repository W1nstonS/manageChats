package com.w1nst0n.managechats.views


import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

@AddToEndSingle


interface LoginView : MvpView {

    fun startLoading()
    fun endLoading()
    fun showError(text: String)
    fun openChats()

}