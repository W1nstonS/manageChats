package com.w1nst0n.managechats.presenters


import android.os.Handler
import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import com.w1nst0n.managechats.providers.ChatsProvider
import com.w1nst0n.managechats.providers.DialogProvider
import com.w1nst0n.managechats.views.ChatsView
import com.w1nst0n.managechats.views.DialogView
import moxy.InjectViewState
import moxy.MvpPresenter


@InjectViewState

class DialogPresenter : MvpPresenter<DialogView>() {
    //
    fun loadDialogs(nameOfDialog: String) {
        viewState.startLoading()
        DialogProvider(this).testLoadDialog(true, nameOfDialog)
    }
    //
    fun dialogLoaded(dialogList:ArrayList<DialogModel>){
        viewState.endLoading()
        if (dialogList.size == 0){
            viewState.showEmptyList()
            viewState.showError(R.string.has_no_chats)
        }else {
            viewState.showFullList(dialogList)
        }
    }
    //
    fun dialogSend(text: String, nameOfDialog: String){

        DialogProvider(this).sendMessage(text, nameOfDialog)

    }
}