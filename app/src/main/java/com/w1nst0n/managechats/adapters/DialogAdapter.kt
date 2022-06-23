package com.w1nst0n.managechats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import de.hdodenhof.circleimageview.CircleImageView

class DialogAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    var mDialogList:ArrayList<DialogModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflator = LayoutInflater.from(parent.context)
        val itemView = layoutInflator.inflate(R.layout.cell_dialog, parent, false)
        return DialogViewHolder(itemView = itemView)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is DialogViewHolder){
            holder.bind(dialogModel = mDialogList[position])
        }

    }

    override fun getItemCount(): Int {
        return mDialogList.count()
    }

    fun setupDialog(dialogList: ArrayList<DialogModel>){
        //mDialogList.clear()
        mDialogList.addAll(dialogList)
        notifyDataSetChanged()

    }


    class DialogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private var mUserName: TextView = itemView.findViewById(R.id.dialog_txt_name)
        private var mCivAvatar: CircleImageView = itemView.findViewById(R.id.dialog_circle_image)
        private var mTxtMessage: TextView = itemView.findViewById(R.id.dialog_txt_message)

        fun bind(dialogModel: DialogModel){

            Picasso.get().load(dialogModel.avatar).into(mCivAvatar)

            mUserName.text = "${dialogModel.name} ${dialogModel.surname}"
            mTxtMessage.text = "${dialogModel.Messenge}"


        }

    }


}