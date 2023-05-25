package com.zaesapplication.app.modules.iphone8one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zaesapplication.app.modules.iphone8one.`data`.model.Iphone8OneModel
import org.koin.core.KoinComponent

class Iphone8OneVM : ViewModel(), KoinComponent {
  val iphone8OneModel: MutableLiveData<Iphone8OneModel> = MutableLiveData(Iphone8OneModel())

  var navArguments: Bundle? = null
}
