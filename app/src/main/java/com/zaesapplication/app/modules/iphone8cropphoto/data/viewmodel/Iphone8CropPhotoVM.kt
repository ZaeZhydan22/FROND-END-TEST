package com.zaesapplication.app.modules.iphone8cropphoto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zaesapplication.app.modules.iphone8cropphoto.`data`.model.Iphone8CropPhotoModel
import org.koin.core.KoinComponent

class Iphone8CropPhotoVM : ViewModel(), KoinComponent {
  val iphone8CropPhotoModel: MutableLiveData<Iphone8CropPhotoModel> =
      MutableLiveData(Iphone8CropPhotoModel())

  var navArguments: Bundle? = null
}
