package com.w1nst0n.managechats.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.rahatarmanahmed.cpv.CircularProgressView
import com.w1nst0n.managechats.R
import com.w1nst0n.managechats.adapters.ChatsAdapter
import com.w1nst0n.managechats.adapters.DialogAdapter
import com.w1nst0n.managechats.models.DialogModel
import com.w1nst0n.managechats.presenters.ChatsPresenter
import com.w1nst0n.managechats.presenters.DialogPresenter
import com.w1nst0n.managechats.views.DialogView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class DialogActivity : MvpAppCompatActivity(), DialogView {
    private lateinit var mAdapter: DialogAdapter
    private lateinit var mCpvWait: CircularProgressView
    private lateinit var mTxtNoItems: TextView
    private lateinit var mRvDialog: RecyclerView
    private lateinit var mTxtEdit: EditText
    private lateinit var mBtnSend: Button

    @InjectPresenter
    lateinit var dialogPresenter: DialogPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        mRvDialog = findViewById(R.id.recycler_dialog)
        mTxtNoItems = findViewById(R.id.txt_dialog_no_items)
        mCpvWait = findViewById(R.id.cpv_dialog)

        mTxtEdit = findViewById(R.id.editText_dialog)
        mBtnSend = findViewById(R.id.btn_send_dialog)

        dialogPresenter.loadDialogs(intent.getStringExtra("nameOfDialog").toString())
//        chatsPresenter.openDialog()
        mAdapter = DialogAdapter()

        mRvDialog.adapter = mAdapter
        mRvDialog.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        mRvDialog.setHasFixedSize(true)

        mBtnSend.setOnClickListener {
            dialogPresenter.dialogSend(mTxtEdit.text.toString(), intent.getStringExtra("nameOfDialog").toString())
            mTxtEdit.text.clear()
            mRvDialog.scrollToPosition(mAdapter.itemCount - 1)
        }
        
    }

    override fun startLoading() {
        mRvDialog.visibility = View.GONE
        mTxtNoItems.visibility = View.GONE
        mCpvWait.visibility = View.VISIBLE
    }

    override fun endLoading() {
        mCpvWait.visibility = View.GONE
    }

    override fun showEmptyList() {
        mRvDialog.visibility = View.GONE
        mTxtNoItems.visibility = View.VISIBLE
    }

    override fun showFullList(dialogList: ArrayList<DialogModel>) {

//        intent.getStringExtra("nameOfDialog")?.let { dialogPresenter.loadDialogs(it) }
        mRvDialog.visibility = View.VISIBLE
        mTxtNoItems.visibility = View.GONE
        mCpvWait.visibility = View.GONE
        mAdapter.setupDialog(dialogList)
    }

    override fun showError(textResource:Int) {
        mTxtNoItems.text = getString(textResource)
    }

    override fun send() {
        TODO("Not yet implemented")
    }
}