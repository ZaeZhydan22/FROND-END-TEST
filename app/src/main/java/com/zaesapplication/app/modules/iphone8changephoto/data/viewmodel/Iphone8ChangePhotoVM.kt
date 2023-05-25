package com.zaesapplication.app.modules.iphone8changephoto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zaesapplication.app.modules.iphone8changephoto.`data`.model.Iphone8ChangePhotoModel
import org.koin.core.KoinComponent

class Iphone8ChangePhotoVM : ViewModel(), KoinComponent {
  val iphone8ChangePhotoModel: MutableLiveData<Iphone8ChangePhotoModel> =
      MutableLiveData(Iphone8ChangePhotoModel())

  var navArguments: Bundle? = null
}
