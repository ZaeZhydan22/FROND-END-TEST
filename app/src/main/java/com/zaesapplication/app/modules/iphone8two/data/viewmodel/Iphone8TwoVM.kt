package com.zaesapplication.app.modules.iphone8two.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zaesapplication.app.modules.iphone8two.`data`.model.Iphone8TwoModel
import org.koin.core.KoinComponent

class Iphone8TwoVM : ViewModel(), KoinComponent {
  val iphone8TwoModel: MutableLiveData<Iphone8TwoModel> = MutableLiveData(Iphone8TwoModel())

  var navArguments: Bundle? = null
}
