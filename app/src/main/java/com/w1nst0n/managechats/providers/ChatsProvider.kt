package com.w1nst0n.managechats.providers

import android.os.Handler
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import com.w1nst0n.managechats.presenters.ChatsPresenter

class ChatsProvider(var presenter: ChatsPresenter) {

    private val mik: String = "https://sun9-west.userapi.com/sun9-54/s/v1/if2/s2kiBKPehF_uwurmzQhkZ14Qd4sZFcBGbFLz2eAN1MY3VITzz8jABQNPhcEhwTUEg9K63UuY3RGrphQ8NacKBngv.jpg?size=1280x690&quality=95&type=album"
    private val vas: String = "https://sun9-west.userapi.com/sun9-9/s/v1/if2/ddQmqm4sNizgrXAh5y8lC2oL1AM-ET8tMMRuRtwIupqtmhPT-Nn1HsOan2PBI_UmsibvOujPNMugEroNFwUQ6Kl9.jpg?size=400x441&quality=95&type=album"
    private val jul: String = "https://sun9-east.userapi.com/sun9-44/s/v1/ig2/u7YRy8p4dpL01cYnKQZTDFRq1OXv8GgX8sTjNZSG0FyJLT7K56OhSddNE_Pb37hTmo1iZk8DRrM1tBmY2WzGsccD.jpg?size=608x1080&quality=95&type=album"
    private val mike: String = "https://sun9-west.userapi.com/sun9-5/s/v1/ig2/I40STvXv9T-BSRYdWCqmCyDxNsyg8UOBTcGg-zN9soZ1CMflBYs7kCRRp9LcmSRXRzbIofEt_NFzvhiMwjNY4Czu.jpg?size=720x1080&quality=95&type=album"
    private val cat: String = "https://sun9-east.userapi.com/sun9-30/s/v1/if2/C4kWxqlZ2B6O04gGcLNwJbs14ckJklKPBV5tSE14dj9egYz_TlhDBr0Or3Ao7d5n5y_LyFe9Cc7E1DCf8DZ5StdN.jpg?size=804x1080&quality=95&type=album"
    private val dil: String ="https://sun9-west.userapi.com/sun9-13/s/v1/ig2/CRYHvRHidD4NdkMgc_PWKNGZs16KDNuVlfhy8-TfEYldnZ9FU80zUSBo8ccOU_f2IADHL9XN950V0_3427QrE75F.jpg?size=1280x1234&quality=96&type=album"
    private val gal: String = "https://sun1.userapi.com/sun1-94/s/v1/if2/lIdgf1Zzl4g8P7ffAzsTj7JM4corw2vdguTewQoOJx4_pqVbUr4U_T20vSe0C69Z01YNGTpa4zjPutONLPhHx_YK.jpg?size=810x1080&quality=95&type=album"
    private val andr: String = "https://sun9-east.userapi.com/sun9-60/s/v1/if2/nX2kOJJRjz-Tc0d7KS6O3nn8dj5xq3Mu2TykMkN-pBQNJEdRCxXGMiU9aFvLZ5UfFaom-V7fgMgSKd6XCqOJV0En.jpg?size=640x640&quality=96&type=album"
    private val tan: String = "https://sun9-west.userapi.com/sun9-9/s/v1/ig2/4dOUBJfyplLag64YaE2DbitKoM1okVLKxdJrUU328UiRYZHPP-v24meoV5UEm3b-Pfx64qrCuig-Vy7lOyAEdqZq.jpg?size=811x1080&quality=96&type=album"
    private val kris: String ="https://sun9-west.userapi.com/sun9-3/s/v1/ig2/KHCTB3fRqYYTgu2SCD6TXNIZdqIevpD3l4GyeBtuDNjDXuvwPFz7OyBTPmR7yv1QuA44YYa8zf9Z52N0cVXGwy-4.jpg?size=805x1080&quality=96&type=album"
    fun testLoadChats(hasChats: Boolean){
        Handler().postDelayed({
            val chatsList: ArrayList<ChatsModel> = ArrayList()
            if (hasChats){
                val chat0 = ChatsModel("Kristina", "Kashkina", "Спишь?", true,
                    kris, true, "10")
                val chat1 = ChatsModel("Михаил", "Благирев", "Доверься", false,
                    mik, true, "1")
                val chat2 = ChatsModel("Василий", "Принтц", "туру туру туу тутуру туру ту тутутуту", true,
                    vas, false, "2")
                val chat3 = ChatsModel("Юля", "Фомина", "Может тогда сейчас сядешь работать?", false,
                    jul, true, "3")
                val chat4 = ChatsModel("Михаил", "Копотов", "Любой сын маминой подруги меня переплюнет", false,
                    mike, true, "4")
                val chat5 = ChatsModel("Екатерина", "Фомичева", "значит пройдешь", true,
                    cat, false, "5")
                val chat6 = ChatsModel("Диляра", "Невретдинова", "Мне делать разных учеников?", false,
                    dil, true, "6")
                val chat7 = ChatsModel("Галина", "Леонова", "Купи че нибудь себе", false,
                    gal, true, "7")
                val chat8 = ChatsModel("Андрей", "Минаев", "Да)", true,
                    andr, false, "8")
                val chat9 = ChatsModel("Таня", "Копташкина", "Да", false,
                    tan, true, "9")
                chatsList.add(chat0)
                chatsList.add(chat1)
                chatsList.add(chat2)
                chatsList.add(chat3)
                chatsList.add(chat4)
                chatsList.add(chat5)
                chatsList.add(chat6)
                chatsList.add(chat7)
                chatsList.add(chat8)
                chatsList.add(chat9)
            }
            presenter.chatsLoaded(chatList = chatsList)
        }, 200)
    }
}