package com.w1nst0n.managechats.presenters


import android.os.Handler
import com.w1nst0n.managechats.views.LoginView
import moxy.InjectViewState
import moxy.MvpPresenter


@InjectViewState
class LoginPresenter: MvpPresenter<LoginView>() {
    fun login(isSuccess:Boolean) {
        viewState.startLoading()
        Handler().postDelayed({
            viewState.endLoading()
            if (isSuccess){
                viewState.openChats()
            }else{
                viewState.showError("Неверные поля ввода аккаунта")
            }
        }, 500)

    }

}