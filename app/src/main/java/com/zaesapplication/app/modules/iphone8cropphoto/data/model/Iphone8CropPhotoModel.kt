package com.zaesapplication.app.modules.iphone8cropphoto.`data`.model

import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8CropPhotoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPotongGambar: String? = MyApp.getInstance().resources.getString(R.string.lbl_potong_gambar)

)
