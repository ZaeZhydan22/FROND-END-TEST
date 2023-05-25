package com.zaesapplication.app.modules.iphone8four.`data`.model

import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8FourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKelas10IPAEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kelas_10_ipa_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbilDarikame: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ambil_dari_kame2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbilDarikameOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ambil_dari_kame2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbildariGall: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ambil_dari_gall2)

)
