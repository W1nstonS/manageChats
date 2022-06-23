package com.w1nst0n.managechats.presenters


import android.os.Handler
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.providers.ChatsProvider
import com.w1nst0n.managechats.views.ChatsView
import moxy.InjectViewState
import moxy.MvpPresenter


@InjectViewState


class ChatsPresenter : MvpPresenter<ChatsView>() {
    fun loadChats() {
        viewState.startLoadind()
        ChatsProvider(this).testLoadChats(true)

    }

//    fun chatsListener( v: View, position: Int ){
//        viewState.selectChat(v, position)
//
//        надо загрузить данные сообщений
//    }

    fun openDialog(holder: RecyclerView.ViewHolder){
        viewState.selectChat(holder = holder)
    }

    fun chatsLoaded(chatList:ArrayList<ChatsModel>){
        viewState.endLoading()
        if (chatList.size == 0){
            viewState.showEmptyList()
            viewState.showError(R.string.has_no_chats)
        }else {
            viewState.showFullList(chatsList = chatList)
        }
    }
}