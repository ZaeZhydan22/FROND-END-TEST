package com.zaesapplication.app.modules.iphone8three.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zaesapplication.app.modules.iphone8three.`data`.model.Iphone8ThreeModel
import org.koin.core.KoinComponent

class Iphone8ThreeVM : ViewModel(), KoinComponent {
  val iphone8ThreeModel: MutableLiveData<Iphone8ThreeModel> = MutableLiveData(Iphone8ThreeModel())

  var navArguments: Bundle? = null
}
