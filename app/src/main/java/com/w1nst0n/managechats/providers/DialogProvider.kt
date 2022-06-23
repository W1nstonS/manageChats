package com.w1nst0n.managechats.providers

import android.os.Handler
import android.util.Log
import com.w1nst0n.managechats.models.ChatsModel
import com.w1nst0n.managechats.models.DialogModel
import com.w1nst0n.managechats.presenters.DialogPresenter

class DialogProvider(var presenter: DialogPresenter) {
    private val dialogList: ArrayList<DialogModel> = ArrayList()
    private val mik: String = "https://sun9-west.userapi.com/sun9-54/s/v1/if2/s2kiBKPehF_uwurmzQhkZ14Qd4sZFcBGbFLz2eAN1MY3VITzz8jABQNPhcEhwTUEg9K63UuY3RGrphQ8NacKBngv.jpg?size=1280x690&quality=95&type=album"
    private val vas: String = "https://sun9-west.userapi.com/sun9-9/s/v1/if2/ddQmqm4sNizgrXAh5y8lC2oL1AM-ET8tMMRuRtwIupqtmhPT-Nn1HsOan2PBI_UmsibvOujPNMugEroNFwUQ6Kl9.jpg?size=400x441&quality=95&type=album"
    private val jul: String = "https://sun9-east.userapi.com/sun9-44/s/v1/ig2/u7YRy8p4dpL01cYnKQZTDFRq1OXv8GgX8sTjNZSG0FyJLT7K56OhSddNE_Pb37hTmo1iZk8DRrM1tBmY2WzGsccD.jpg?size=608x1080&quality=95&type=album"
    private val mike: String = "https://sun9-west.userapi.com/sun9-5/s/v1/ig2/I40STvXv9T-BSRYdWCqmCyDxNsyg8UOBTcGg-zN9soZ1CMflBYs7kCRRp9LcmSRXRzbIofEt_NFzvhiMwjNY4Czu.jpg?size=720x1080&quality=95&type=album"
    private val cat: String = "https://sun9-east.userapi.com/sun9-30/s/v1/if2/C4kWxqlZ2B6O04gGcLNwJbs14ckJklKPBV5tSE14dj9egYz_TlhDBr0Or3Ao7d5n5y_LyFe9Cc7E1DCf8DZ5StdN.jpg?size=804x1080&quality=95&type=album"
    private val dil: String ="https://sun9-west.userapi.com/sun9-13/s/v1/ig2/CRYHvRHidD4NdkMgc_PWKNGZs16KDNuVlfhy8-TfEYldnZ9FU80zUSBo8ccOU_f2IADHL9XN950V0_3427QrE75F.jpg?size=1280x1234&quality=96&type=album"
    private val gal: String = "https://sun1.userapi.com/sun1-94/s/v1/if2/lIdgf1Zzl4g8P7ffAzsTj7JM4corw2vdguTewQoOJx4_pqVbUr4U_T20vSe0C69Z01YNGTpa4zjPutONLPhHx_YK.jpg?size=810x1080&quality=95&type=album"
    private val andr: String = "https://sun9-east.userapi.com/sun9-60/s/v1/if2/nX2kOJJRjz-Tc0d7KS6O3nn8dj5xq3Mu2TykMkN-pBQNJEdRCxXGMiU9aFvLZ5UfFaom-V7fgMgSKd6XCqOJV0En.jpg?size=640x640&quality=96&type=album"
    private val tan: String = "https://sun9-west.userapi.com/sun9-9/s/v1/ig2/4dOUBJfyplLag64YaE2DbitKoM1okVLKxdJrUU328UiRYZHPP-v24meoV5UEm3b-Pfx64qrCuig-Vy7lOyAEdqZq.jpg?size=811x1080&quality=96&type=album"
    private val mine: String = "https://sun9-west.userapi.com/sun9-69/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album"
    private val kris: String ="https://sun9-west.userapi.com/sun9-3/s/v1/ig2/KHCTB3fRqYYTgu2SCD6TXNIZdqIevpD3l4GyeBtuDNjDXuvwPFz7OyBTPmR7yv1QuA44YYa8zf9Z52N0cVXGwy-4.jpg?size=805x1080&quality=96&type=album"
    fun testLoadDialog(hasDialog: Boolean, nameOfDialog: String){
        Handler().postDelayed({

            if (hasDialog){
                when(nameOfDialog){
                    "1" -> {
                        val dialog11 = DialogModel("Никита", "Леонов", "Мишаааа",
                            mine, null)
                        val dialog12 = DialogModel("Никита", "Леонов", "Миииш",
                            mine, null)
                        val dialog13 = DialogModel("Никита", "Леонов", "https://clck.ru/TjefH",
                            mine, null)
                        val dialog14 = DialogModel("Михаил", "Благирев", "Что это?",
                            mik, null)
                        val dialog15 = DialogModel("Никита", "Леонов", "Рецепт неплохой",
                            mine, null)
                        val dialog16 = DialogModel("Михаил", "Благирев", "Чего?",
                            mik, null)
                        val dialog17 = DialogModel("Никита", "Леонов", "Еды",
                            mine, null)
                        val dialog18 = DialogModel("Михаил", "Благирев", "Какой?",
                            mik, null)
                        val dialog19 = DialogModel("Никита", "Леонов", "Зайди, и узнаешь",
                            mine, null)
                        val dialog110 = DialogModel("Михаил", "Благирев", "А давай без коротких ссылок\n" +
                                "У меня фобия",
                            mik, null)
                        val dialog111 = DialogModel("Никита", "Леонов", "Поверь мне, все в порядке",
                            mine, null)
                        val dialog112 = DialogModel("Никита", "Леонов", "просто нажми на нее",
                            mine, null)
                        val dialog113 = DialogModel("Никита", "Леонов", "Доверься",
                            mine, null)
                        dialogList.add(dialog11)
                        dialogList.add(dialog12)
                        dialogList.add(dialog13)
                        dialogList.add(dialog14)
                        dialogList.add(dialog15)
                        dialogList.add(dialog16)
                        dialogList.add(dialog17)
                        dialogList.add(dialog18)
                        dialogList.add(dialog19)
                        dialogList.add(dialog110)
                        dialogList.add(dialog111)
                        dialogList.add(dialog112)
                        dialogList.add(dialog113)

                    }
                    "2" -> {
                        val dialog21 = DialogModel("Василий", "Принтц", "о моя телега",
                            vas, null)
                        val dialog22 = DialogModel("Никита", "Леонов", "Моя тоже",
                            mine, null)
                        val dialog23 = DialogModel("Василий", "Принтц", "вот у нас такая же прям",
                            vas, null)
                        val dialog24 = DialogModel("Василий", "Принтц", "и красная еще рохля",
                            vas, null)
                        val dialog25 = DialogModel("Никита", "Леонов", "Только у меня была подлиннее",
                            mine, null)
                        val dialog26 = DialogModel("Никита", "Леонов", "Вот длинной пиздос как неудобно",
                            mine, null)
                        val dialog27 = DialogModel("Василий", "Принтц", "у нас палеты только одного размера",
                            vas, null)
                        val dialog28 = DialogModel("Василий", "Принтц", "так что нам пофигу там",
                            vas, null)
                        val dialog29 = DialogModel("Никита", "Леонов", "У нас тоже, под одну\n" +
                                "Но длинная рохля может сразу две или три взять",
                            mine, null)
                        val dialog210 = DialogModel("Василий", "Принтц", "как это тащить то",
                            vas, null)
                        val dialog211 = DialogModel("Василий", "Принтц", "блин",
                            vas, null)
                        val dialog212 = DialogModel("Никита", "Леонов", "Весело и задорно",
                            mine, null)
                        val dialog213 = DialogModel("Никита", "Леонов", "Короче",
                            mine, null)
                        val dialog214 = DialogModel("Василий", "Принтц", "я 2 палета по 350 кг каждый не подниму",
                            vas, null)
                        val dialog215 = DialogModel("Никита", "Леонов", "Помню как тащил",
                            mine, null)
                        val dialog216 = DialogModel("Никита", "Леонов", "Тащить надо было минут пять в один конец",
                            mine, null)
                        val dialog217 = DialogModel("Никита", "Леонов", "А длинная рохля неповоротливая",
                            mine, null)
                        val dialog218 = DialogModel("Никита", "Леонов", "И значится\n" +
                                "Пока тащил ее, я представлял себя дальнобойщиком",
                            mine, null)
                        val dialog219 = DialogModel("Василий", "Принтц", "туру туру туу тутуру туру ту тутутуту",
                            vas, null)
                        dialogList.add(dialog21)
                        dialogList.add(dialog22)
                        dialogList.add(dialog23)
                        dialogList.add(dialog24)
                        dialogList.add(dialog25)
                        dialogList.add(dialog26)
                        dialogList.add(dialog27)
                        dialogList.add(dialog28)
                        dialogList.add(dialog29)
                        dialogList.add(dialog210)
                        dialogList.add(dialog211)
                        dialogList.add(dialog212)
                        dialogList.add(dialog213)
                        dialogList.add(dialog214)
                        dialogList.add(dialog215)
                        dialogList.add(dialog216)
                        dialogList.add(dialog217)
                        dialogList.add(dialog218)
                        dialogList.add(dialog219)


                    }
                    "3" -> {
                        val dialog31 = DialogModel("Никита", "Леонов", "Ты все сдашь",
                            mine, null)
                        val dialog32 = DialogModel("Юля", "Фомина", "Ахаахахах хорошо",
                            jul, null)
                        val dialog33 = DialogModel("Юля", "Фомина", "Хорошо бы",
                            jul, null)
                        val dialog34 = DialogModel("Юля", "Фомина", "Почти ничего нет",
                            jul, null)
                        val dialog35 = DialogModel("Юля", "Фомина", "Хз, что с подписями",
                            jul, null)
                        val dialog36 = DialogModel("Никита", "Леонов", "Это надо получить",
                            mine, null)
                        val dialog37 = DialogModel("Никита", "Леонов", "Но чуть позже",
                            mine, null)
                        val dialog38 = DialogModel("Юля", "Фомина", "У меня даже подписи экономички нет))))) спасибо любимая кафедра",
                            jul, null)
                        val dialog39 = DialogModel("Юля", "Фомина", "Я уже задолбалась нервничать",
                            jul, null)
                        val dialog310 = DialogModel("Никита", "Леонов", "Мне бы тоже пора нервничать\n" +
                                "Я же тоже свой проект не доделал",
                            mine, null)
                        val dialog311 = DialogModel("Юля", "Фомина", "Ну на крайний случай тоже скрины",
                            jul, null)
                        val dialog312 = DialogModel("Юля", "Фомина", "Ну а что теперь сделать",
                            jul, null)
                        val dialog313 = DialogModel("Никита", "Леонов", "Ладно\n" +
                                "Я побегу делать",
                            mine, null)
                        val dialog314 = DialogModel("Юля", "Фомина", "Чет нервничаю, что у меня просто не проходит крапивница уже",
                            jul, null)
                        val dialog315 = DialogModel("Никита", "Леонов", "Не обращай внимание\n" +
                                "Иначе ты будешь зацикливаться",
                            mine, null)
                        val dialog316 = DialogModel("Юля", "Фомина", "Вчера я рыдала 4 раза \uD83D\uDE43",
                            jul, null)
                        val dialog317 = DialogModel("Никита", "Леонов", "Бля",
                            mine, null)
                        val dialog318 = DialogModel("Никита", "Леонов", "Может тогда сейчас сядешь работать?",
                            mine, null)


                        dialogList.add(dialog31)
                        dialogList.add(dialog32)
                        dialogList.add(dialog33)
                        dialogList.add(dialog34)
                        dialogList.add(dialog35)
                        dialogList.add(dialog36)
                        dialogList.add(dialog37)
                        dialogList.add(dialog38)
                        dialogList.add(dialog39)
                        dialogList.add(dialog310)
                        dialogList.add(dialog311)
                        dialogList.add(dialog312)
                        dialogList.add(dialog313)
                        dialogList.add(dialog314)
                        dialogList.add(dialog315)
                        dialogList.add(dialog316)
                        dialogList.add(dialog317)
                        dialogList.add(dialog318)

                    }
                    "4" -> {
                        val dialog41 = DialogModel("Никита", "Леонов", "Я поймал дизмораль",
                            mine, null)
                        val dialog42 = DialogModel("Михаил", "Копотов", "я тоже",
                            mike, null)
                        val dialog43 = DialogModel("Никита", "Леонов", "Глянул на гитхабе по поводу вк мессенджера\n" +
                                "Может, чего там возьму из идей",
                            mine, null)
                        val dialog44 = DialogModel("Михаил", "Копотов", "а че так",
                            mike, null)
                        val dialog45 = DialogModel("Никита", "Леонов", "А там неебическое количество классов\n" +
                                "Настолько много, что я в шоке",
                            mine, null)
                        val dialog46 = DialogModel("Михаил", "Копотов", "не пугайся",
                            mike, null)
                        val dialog47 = DialogModel("Никита", "Леонов", "И там же все работает, не то что у меня\n" +
                                "Это выглядит как будто доисторическому человеку показали последнюю модель тесла",
                            mine, null)
                        val dialog48 = DialogModel("Михаил", "Копотов", "думаешь это 1 человек писал?",
                            mike, null)
                        val dialog49 = DialogModel("Никита", "Леонов", "И теперь я боюсь, что я хуй че сделаю",
                            mine, null)
                        val dialog410 = DialogModel("Никита", "Леонов", "В авторах один",
                            mine, null)
                        val dialog411 = DialogModel("Михаил", "Копотов", "у нас не работает 60% выпускных",
                            mike, null)
                        val dialog412 = DialogModel("Михаил", "Копотов", "они говно",
                            mike, null)
                        val dialog413 = DialogModel("Михаил", "Копотов", "расслабься",
                            mike, null)
                        val dialog414 = DialogModel("Никита", "Леонов", "А если меня спросят, мол, покажи\n" +
                                "Я же так охуею с жизни",
                            mine, null)
                        val dialog415 = DialogModel("Михаил", "Копотов", "ну код",
                            mike, null)
                        val dialog416 = DialogModel("Михаил", "Копотов", "ну работает",
                            mike, null)
                        val dialog417 = DialogModel("Никита", "Леонов", "Но тут еще один нюанс есть",
                            mine, null)
                        val dialog418 = DialogModel("Никита", "Леонов", "Мне казалось, что моя работа будет хоть чем то отдаленным похожим, что я могу показать\n" +
                                "Мол\n" +
                                "Вот меня спросят\n" +
                                "\"Никит, ты как программист, что ты сделал. Можешь показать?\"\n" +
                                "А у меня музыкальный плеер, который хуево выглядит но рабочий. Сайт который на пхп написан, сейчас все забрасывают пхп, я уже не выгодно выгляжу. И в довесок полу приложение вк, в котором написано все хуево.",
                            mine, null)
                        val dialog419 = DialogModel("Никита", "Леонов", "Любой сын маминой подруги меня переплюнет",
                            mine, null)

                        dialogList.add(dialog41)
                        dialogList.add(dialog42)
                        dialogList.add(dialog43)
                        dialogList.add(dialog44)
                        dialogList.add(dialog45)
                        dialogList.add(dialog46)
                        dialogList.add(dialog47)
                        dialogList.add(dialog48)
                        dialogList.add(dialog49)
                        dialogList.add(dialog410)
                        dialogList.add(dialog411)
                        dialogList.add(dialog412)
                        dialogList.add(dialog413)
                        dialogList.add(dialog414)
                        dialogList.add(dialog415)
                        dialogList.add(dialog416)
                        dialogList.add(dialog417)
                        dialogList.add(dialog418)
                        dialogList.add(dialog419)

                    }
                    "5" -> {
                        val dialog51 = DialogModel("Никита", "Леонов", "А теперь есть прикол",
                            mine, null)
                        val dialog52 = DialogModel("Никита", "Леонов", "Надо у вк просить доступ к сообщениям",
                            mine, null)
                        val dialog53 = DialogModel("Екатерина", "Фомичева", "долгий процесс?",
                            cat, null)
                        val dialog54 = DialogModel("Никита", "Леонов", "Хз",
                            mine, null)
                        val dialog55 = DialogModel("Никита", "Леонов", "Мое приложение пока что полностью рабочее без внедрения ВК",
                            mine, null)
                        val dialog56 = DialogModel("Екатерина", "Фомичева", "Успел?)",
                            cat, null)
                        val dialog57 = DialogModel("Никита", "Леонов", "Типо механизмы отправки работает",
                            mine, null)
                        val dialog58 = DialogModel("Екатерина", "Фомичева", "Всё готово можно сказать?",
                            cat, null)
                        val dialog59 = DialogModel("Никита", "Леонов", "А мне капец не весело",
                            mine, null)
                        val dialog510 = DialogModel("Никита", "Леонов", "Если меня нахер пошлют, то плакал мой проект",
                            mine, null)
                        val dialog511 = DialogModel("Екатерина", "Фомичева", "молимся",
                            cat, null)
                        val dialog512 = DialogModel("Екатерина", "Фомичева", "подключай параллельно одноклассники",
                            cat, null)
                        val dialog513 = DialogModel("Екатерина", "Фомичева", "там точно скучают в поддержке",
                            cat, null)
                        val dialog514 = DialogModel("Никита", "Леонов", "Да они небось тоже так сделали",
                            mine, null)
                        val dialog515 = DialogModel("Екатерина", "Фомичева", "не бойся, а делай",
                            cat, null)
                        val dialog516 = DialogModel("Екатерина", "Фомичева", "завтра же сдавать проект? ",
                            cat, null)
                        val dialog517 = DialogModel("Никита", "Леонов", "По идее да",
                            mine, null)
                        val dialog518 = DialogModel("Екатерина", "Фомичева", "я чихнула дослушав твое гс",
                            cat, null)
                        val dialog519 = DialogModel("Екатерина", "Фомичева", "значит пройдешь",
                            cat, null)


                        dialogList.add(dialog51)
                        dialogList.add(dialog52)
                        dialogList.add(dialog53)
                        dialogList.add(dialog54)
                        dialogList.add(dialog55)
                        dialogList.add(dialog56)
                        dialogList.add(dialog57)
                        dialogList.add(dialog58)
                        dialogList.add(dialog59)
                        dialogList.add(dialog510)
                        dialogList.add(dialog511)
                        dialogList.add(dialog512)
                        dialogList.add(dialog513)
                        dialogList.add(dialog514)
                        dialogList.add(dialog515)
                        dialogList.add(dialog516)
                        dialogList.add(dialog517)
                        dialogList.add(dialog518)
                        dialogList.add(dialog519)
                    }
                    "6" -> {
                        val dialog61 = DialogModel("Никита", "Леонов", "Спасибо",
                            mine, null)
                        val dialog62 = DialogModel("Диляра", "Невретдинова", "тебе спасибо...",
                            dil, null)
                        val dialog63 = DialogModel("Никита", "Леонов", "Комментарии работают",
                            mine, null)
                        val dialog64 = DialogModel("Никита", "Леонов", "Ну\n" +
                                "Секция оценок полностью рабочая",
                            mine, null)
                        val dialog65 = DialogModel("Никита", "Леонов", "Теперь объясни мне за дневник\n" +
                                "У всех же дз одинаковое?",
                            mine, null)
                        val dialog66 = DialogModel("Диляра", "Невретдинова", "Ахуеть",
                            dil, null)
                        val dialog67 = DialogModel("Диляра", "Невретдинова", "❤",
                            dil, null)
                        val dialog68 = DialogModel("Диляра", "Невретдинова", "Никита!!!!",
                            dil, null)
                        val dialog69 = DialogModel("Никита", "Леонов", "Думаю, тебе пора искать заправку для зажигалок Зиппо",
                            mine, null)
                        val dialog610 = DialogModel("Никита", "Леонов", "Мне бы фирменную от зиппо\n" +
                                "Левые бензины параша",
                            mine, null)
                        val dialog611 = DialogModel("Никита", "Леонов", "Теперь и дневник рабочий",
                            mine, null)
                        val dialog612 = DialogModel("Диляра", "Невретдинова", "Вау",
                            dil, null)
                        val dialog613 = DialogModel("Диляра", "Невретдинова", "Ахуенно",
                            dil, null)
                        val dialog614 = DialogModel("Никита", "Леонов", "Пока что есть нюанс",
                            mine, null)
                        val dialog615 = DialogModel("Никита", "Леонов", "У всех пока что один и тот журнал с оценками",
                            mine, null)
                        val dialog616 = DialogModel("Диляра", "Невретдинова", "Похуй",
                            dil, null)
                        val dialog617 = DialogModel("Диляра", "Невретдинова", "Я буду скрины на одного ученика делать",
                            dil, null)
                        val dialog618 = DialogModel("Никита", "Леонов", "Мне делать разных учеников?",
                            mine, null)




                        dialogList.add(dialog61)
                        dialogList.add(dialog62)
                        dialogList.add(dialog63)
                        dialogList.add(dialog64)
                        dialogList.add(dialog65)
                        dialogList.add(dialog66)
                        dialogList.add(dialog67)
                        dialogList.add(dialog68)
                        dialogList.add(dialog69)
                        dialogList.add(dialog610)
                        dialogList.add(dialog611)
                        dialogList.add(dialog612)
                        dialogList.add(dialog613)
                        dialogList.add(dialog614)
                        dialogList.add(dialog615)
                        dialogList.add(dialog616)
                        dialogList.add(dialog617)
                        dialogList.add(dialog618)

                    }
                    "7" -> {
                        val dialog71 = DialogModel("Галина", "Леонова", "У неё корм кончился?",
                            gal, null)
                        val dialog72 = DialogModel("Никита", "Леонов", "Я ей пакетики беру",
                            mine, null)
                        val dialog73 = DialogModel("Никита", "Леонов", "Perfect fit",
                            mine, null)
                        val dialog74 = DialogModel("Галина", "Леонова", "Она поэтому тебе спать не даёт",
                            gal, null)
                        val dialog75 = DialogModel("Галина", "Леонова", "Там есть в верном небольшой пакет сухого",
                            gal, null)
                        val dialog76 = DialogModel("Никита", "Леонов", "Хорошо",
                            mine, null)
                        val dialog77 = DialogModel("Галина", "Леонова", "Ты понял какой?",
                            gal, null)
                        val dialog78 = DialogModel("Галина", "Леонова", "Он там чёт 120 рублей стоит",
                            gal, null)
                        val dialog79 = DialogModel("Никита", "Леонов", "Меня маслом горячим пульнуло",
                            mine, null)
                        val dialog710 = DialogModel("Галина", "Леонова", "\uD83E\uDD26\uD83C\uDFFB\u200D♀",
                            gal, null)
                        val dialog711 = DialogModel("Никита", "Леонов", "Тупое масло",
                            mine, null)
                        val dialog712 = DialogModel("Галина", "Леонова", "Купи чё нибудь себе",
                            gal, null)
                        val dialog713 = DialogModel("Никита", "Леонов", "Да норм\n" +
                                "Дня три назад доел суп, пожарил макароны с овощами\n" +
                                "Потом пожарил картошку",
                            mine, null)
                        val dialog714 = DialogModel("Никита", "Леонов", "Все съел, ничего выкидывать не надо",
                            mine, null)
                        val dialog715 = DialogModel("Галина", "Леонова", "Я тебе ещё кинула",
                            gal, null)
                        val dialog716 = DialogModel("Никита", "Леонов", "Видел",
                            mine, null)
                        val dialog717 = DialogModel("Галина", "Леонова", "Ты ж мой любимый",
                            gal, null)
                        val dialog718 = DialogModel("Галина", "Леонова", "Купи че нибудь себе",
                            gal, null)


                        dialogList.add(dialog71)
                        dialogList.add(dialog72)
                        dialogList.add(dialog73)
                        dialogList.add(dialog74)
                        dialogList.add(dialog75)
                        dialogList.add(dialog76)
                        dialogList.add(dialog77)
                        dialogList.add(dialog78)
                        dialogList.add(dialog79)
                        dialogList.add(dialog710)
                        dialogList.add(dialog711)
                        dialogList.add(dialog712)
                        dialogList.add(dialog713)
                        dialogList.add(dialog714)
                        dialogList.add(dialog715)
                        dialogList.add(dialog716)
                        dialogList.add(dialog717)
                        dialogList.add(dialog718)

                    }
                    "8" -> {
                        val dialog81 = DialogModel("Никита", "Леонов", "А ты делал нир и практику?",
                            mine, null)
                        val dialog82 = DialogModel("Андрей", "Минаев", "Привет)",
                            andr, null)
                        val dialog83 = DialogModel("Андрей", "Минаев", "Нир вот сел делать ток что))",
                            andr, null)
                        val dialog84 = DialogModel("Андрей", "Минаев", "А практику делал",
                            andr, null)
                        val dialog85 = DialogModel("Андрей", "Минаев", "Ахах\n" +
                                "Понимаю",
                            mine, null)
                        val dialog86 = DialogModel("Андрей", "Минаев", "А так я даже не уверен в своей теме до сих пор, потому что научрук сказал что можно сделать прототип и скинул название с прототипом",
                            andr, null)
                        val dialog87 = DialogModel("Андрей", "Минаев", "А кто то сказал что за слово прототип в теме ебут",
                            andr, null)
                        val dialog88 = DialogModel("Андрей", "Минаев", "И я так и не уточнил до сих пор мне оставлять прототип или нет, лол",
                            andr, null)
                        val dialog89 = DialogModel("Андрей", "Минаев", "А так тоже на самом деле нихуя не понятно, никакой нормальной инфы по диплому, ну классика в целом",
                            andr, null)
                        val dialog810 = DialogModel("Андрей", "Минаев", "Но хоть чето есть, это да",
                            andr, null)
                        val dialog811 = DialogModel("Никита", "Леонов", "По поводу диплома только знаю, что саму прогу смотреть будут на предзащите",
                            mine, null)
                        val dialog812 = DialogModel("Никита", "Леонов", "На самой защите всем будет похую, че там",
                            mine, null)
                        val dialog813 = DialogModel("Никита", "Леонов", "Я уже сам хуй знает когда последний раз играл",
                            mine, null)
                        val dialog814 = DialogModel("Никита", "Леонов", "Тупо по 5 минут в groove coaster поигрываю",
                            mine, null)
                        val dialog815 = DialogModel("Андрей", "Минаев", "Угу, играл немного",
                            andr, null)
                        val dialog816 = DialogModel("Андрей", "Минаев", "Но там вроде как обычно можно разориться на покупке доп паков со всякими коллаборациями и прочим",
                            andr, null)
                        val dialog817 = DialogModel("Никита", "Леонов", "Вообще пофигу\n" +
                                "Можно спиратить",
                            mine, null)
                        val dialog818 = DialogModel("Андрей", "Минаев", "Ну или найти версию где кхм кхм все открыто",
                            andr, null)
                        val dialog819 = DialogModel("Андрей", "Минаев", "Да)",
                            andr, null)

                        dialogList.add(dialog81)
                        dialogList.add(dialog82)
                        dialogList.add(dialog83)
                        dialogList.add(dialog84)
                        dialogList.add(dialog85)
                        dialogList.add(dialog86)
                        dialogList.add(dialog87)
                        dialogList.add(dialog88)
                        dialogList.add(dialog89)
                        dialogList.add(dialog810)
                        dialogList.add(dialog811)
                        dialogList.add(dialog812)
                        dialogList.add(dialog813)
                        dialogList.add(dialog814)
                        dialogList.add(dialog815)
                        dialogList.add(dialog816)
                        dialogList.add(dialog817)
                        dialogList.add(dialog818)
                        dialogList.add(dialog819)

                    }
                    "9" -> {
                        val dialog91 = DialogModel("Таня", "Копташкина", "Никита",
                            tan, null)
                        val dialog92 = DialogModel("Таня", "Копташкина", "Никита",
                            tan, null)
                        val dialog93 = DialogModel("Никита", "Леонов", "Что случилось?",
                            mine, null)
                        val dialog94 = DialogModel("Таня", "Копташкина", "Щас буду свич реанимировать",
                            tan, null)
                        val dialog95 = DialogModel("Таня", "Копташкина", "Мне страшно",
                            tan, null)
                        val dialog96 = DialogModel("Никита", "Леонов", "Я же тебе кидал",
                            mine, null)
                        val dialog97 = DialogModel("Таня", "Копташкина", "А как его ввести в рцм если он в ноль вырублен",
                            tan, null)
                        val dialog98 = DialogModel("Таня", "Копташкина", "Прям вообще не реагирует",
                            tan, null)
                        val dialog99 = DialogModel("Никита", "Леонов", "Подержи его минут десять просто на зарядке",
                            mine, null)
                        val dialog910 = DialogModel("Таня", "Копташкина", "Ага поняла",
                            tan, null)
                        val dialog911 = DialogModel("Таня", "Копташкина", "Так а потом включаю с зажатым р",
                            tan, null)
                        val dialog912 = DialogModel("Таня", "Копташкина", "Правильно?",
                            tan, null)
                        val dialog913 = DialogModel("Никита", "Леонов", "Рцм не забудь",
                            mine, null)
                        val dialog914 = DialogModel("Никита", "Леонов", "TegraRCM",
                            mine, null)
                        val dialog915 = DialogModel("Таня", "Копташкина", "Открыла",
                            tan, null)
                        val dialog916 = DialogModel("Таня", "Копташкина", "Сначала включаю в комп",
                            tan, null)
                        val dialog917 = DialogModel("Таня", "Копташкина", "Потом включаю свич",
                            tan, null)
                        val dialog918 = DialogModel("Таня", "Копташкина", "С зажатым р",
                            tan, null)
                        val dialog919 = DialogModel("Никита", "Леонов", "Да",
                            mine, null)



                        dialogList.add(dialog91)
                        dialogList.add(dialog92)
                        dialogList.add(dialog93)
                        dialogList.add(dialog94)
                        dialogList.add(dialog95)
                        dialogList.add(dialog96)
                        dialogList.add(dialog97)
                        dialogList.add(dialog98)
                        dialogList.add(dialog99)
                        dialogList.add(dialog910)
                        dialogList.add(dialog911)
                        dialogList.add(dialog912)
                        dialogList.add(dialog913)
                        dialogList.add(dialog914)
                        dialogList.add(dialog915)
                        dialogList.add(dialog916)
                        dialogList.add(dialog917)
                        dialogList.add(dialog918)
                        dialogList.add(dialog919)

                    }
                    "10" -> {
                        val dialog101 = DialogModel("Kristina", "Kashkina", "Если у тебя есть чьи-то презв скинь плиз",
                            kris, null)
                        val dialog102 = DialogModel("Kristina", "Kashkina", "Мне некогда писать щас кому-то",
                            kris, null)
                        val dialog103 = DialogModel("Никита", "Леонов", "Ну\n" +
                                "Свою могу кинуть",
                            mine, null)
                        val dialog104 = DialogModel("Kristina", "Kashkina", "Давай",
                            kris, null)
                        val dialog105 = DialogModel("Kristina", "Kashkina", "Может поцдешь сл мной в дис, пока я презентации делаю?\n" +
                                "Ток я сначала котлетки пожаоб, а то кушать хочется",
                            kris, null)
                        val dialog106 = DialogModel("Kristina", "Kashkina", "Эти черти перестали писать",
                            kris, null)
                        val dialog107 = DialogModel("Никита", "Леонов", "Давай\n" +
                                "Только я ненадолго",
                            mine, null)
                        val dialog108 = DialogModel("Kristina", "Kashkina", "Тогда не спи пока",
                            kris, null)
                        val dialog109 = DialogModel("Kristina", "Kashkina", "А то я в этом павнр1пойнте как обезьяна с гранатой",
                            kris, null)
                        val dialog1010 = DialogModel("Kristina", "Kashkina", "Будешь говорить куда тыкать",
                            kris, null)
                        val dialog1011 = DialogModel("Никита", "Леонов", "там не требуют ебейшие презентации",
                            mine, null)
                        val dialog1012 = DialogModel("Kristina", "Kashkina", "Капец я устала блять",
                            kris, null)
                        val dialog1013 = DialogModel("Kristina", "Kashkina", "Черти",
                            kris, null)
                        val dialog1014 = DialogModel("Никита", "Леонов", "Бедненькая(((",
                            mine, null)
                        val dialog1015 = DialogModel("Никита", "Леонов", "Ты хоть котлетки сделала?",
                            mine, null)
                        val dialog1016 = DialogModel("Kristina", "Kashkina", "Делаю",
                            kris, null)
                        val dialog1017 = DialogModel("Kristina", "Kashkina", "Ыыы",
                            kris, null)
                        val dialog1018 = DialogModel("Kristina", "Kashkina", "Шо ты",
                            kris, null)
                        val dialog1019 = DialogModel("Kristina", "Kashkina", "ы",
                            kris, null)

                        dialogList.add(dialog101)
                        dialogList.add(dialog102)
                        dialogList.add(dialog103)
                        dialogList.add(dialog104)
                        dialogList.add(dialog105)
                        dialogList.add(dialog106)
                        dialogList.add(dialog107)
                        dialogList.add(dialog108)
                        dialogList.add(dialog109)
                        dialogList.add(dialog1010)
                        dialogList.add(dialog1011)
                        dialogList.add(dialog1012)
                        dialogList.add(dialog1013)
                        dialogList.add(dialog1014)
                        dialogList.add(dialog1015)
                        dialogList.add(dialog1016)
                        dialogList.add(dialog1017)
                        dialogList.add(dialog1018)
                        dialogList.add(dialog1019)

                    }
                }
                presenter.dialogLoaded(dialogList)

            }

        }, 200)
    }

    fun sendMessage(text:String, nameOfDialog: String) {
        when(nameOfDialog){
            "1" -> {
                val dialog1 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog1)
                Log.i("number of array = ", dialogList.size.toString())
            }
            "2" -> {
                val dialog2 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog2)
            }
            "3" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "4" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "5" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "6" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "7" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "8" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "9" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
            "10" -> {
                val dialog3 = DialogModel("Никита", "Леонов", text,
                    "https://sun9-69.userapi.com/s/v1/ig2/usvZZuZ_ydM8N4LXUA7gepjrFsR9Pk6BLGCA05-NlotqOLL_FybSF38ruQAI0s0_jdYTLEVJGonHmgvWAWFFFstX.jpg?size=1280x1280&quality=96&type=album",
                    null)
                dialogList.add(dialog3)
            }
        }

        presenter.dialogLoaded(dialogList)
    }
    //
}