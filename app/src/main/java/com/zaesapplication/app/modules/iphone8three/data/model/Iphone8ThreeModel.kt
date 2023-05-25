package com.zaesapplication.app.modules.iphone8three.`data`.model

import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8ThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbilFoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambil_foto)

)
