package com.zaesapplication.app.modules.iphone8two.`data`.model

import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGantiFotoProf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ganti_foto_prof)

)
