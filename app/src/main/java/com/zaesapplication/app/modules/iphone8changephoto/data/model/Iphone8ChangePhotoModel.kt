package com.zaesapplication.app.modules.iphone8changephoto.`data`.model

import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8ChangePhotoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGantiFotoProf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ganti_foto_prof)

)
