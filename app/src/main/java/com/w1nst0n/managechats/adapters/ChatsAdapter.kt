package com.w1nst0n.managechats.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.squareup.picasso.PicassoProvider
import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.activities.DialogActivity
import com.w1nst0n.managechats.models.ChatsModel
import de.hdodenhof.circleimageview.CircleImageView

class ChatsAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mChatsList: ArrayList<ChatsModel> = ArrayList()

    fun setupChat(chatList: ArrayList<ChatsModel>){
        mChatsList.clear()
        mChatsList.addAll(chatList)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflator = LayoutInflater.from(parent.context)
        val itemView = layoutInflator.inflate(R.layout.cell_chats, parent, false)

        return ChatsViewHolder(itemView = itemView)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ChatsViewHolder){
            holder.bind(chatModel = mChatsList[position])
        }

        holder.itemView.setOnClickListener {
            holder ->
            val intent = Intent(holder.context, DialogActivity::class.java)
            Log.i("selected", position.toString() + " "+  mChatsList[position].id_chat)

            intent.putExtra("nameOfDialog", mChatsList[position].id_chat)
            holder.context.startActivity(intent)
        }
    }

//    fun click(holder: RecyclerView.ViewHolder, position: Int){
//        holder.itemView.setOnClickListener {
//                holder ->
//            val intent = Intent(holder.context, DialogActivity::class.java)
//            Log.i("selected", position.toString() + " "+  mChatsList[position].name)
//            Toast.makeText(holder.context, mChatsList[position].name, Toast.LENGTH_SHORT).show()
//            holder.context.startActivity(intent)
//        }
//    }

    override fun getItemCount(): Int {
        return mChatsList.count()
    }
    class ChatsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private var mUserName: TextView = itemView.findViewById(R.id.chats_txt_name)
        private var mCivAvatar: CircleImageView = itemView.findViewById(R.id.chats_circle_image)
        private var mTxtLastMessage: TextView = itemView.findViewById(R.id.chats_txt_lastmessage)
        private var mImgIsOnline: CircleImageView = itemView.findViewById(R.id.chats_is_online)
        private var mImgIsRead: CircleImageView = itemView.findViewById(R.id.chats_is_read)



        fun bind(chatModel: ChatsModel){

            Picasso.get().load(chatModel.avatar).into(mCivAvatar)

            mUserName.text = "${chatModel.name} ${chatModel.surname}"
            mTxtLastMessage.text = "${chatModel.lastMessenge}"

            if (chatModel.isOnline){
                mImgIsOnline.visibility = View.VISIBLE
            }else {
                mImgIsOnline.visibility = View.GONE
            }

            if (chatModel.read){
                mImgIsRead.visibility = View.GONE
            }else {
                mImgIsRead.visibility = View.VISIBLE
            }
        }
        //tut nado
    }
}