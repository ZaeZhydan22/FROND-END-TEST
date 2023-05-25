package com.zaesapplication.app.modules.iphone8one.`data`.model

import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8OneModel(
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

)
