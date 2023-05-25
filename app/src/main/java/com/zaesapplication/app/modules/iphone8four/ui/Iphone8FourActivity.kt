package com.zaesapplication.app.modules.iphone8four.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.base.BaseActivity
import com.zaesapplication.app.databinding.ActivityIphone8FourBinding
import com.zaesapplication.app.modules.iphone8four.`data`.viewmodel.Iphone8FourVM
import kotlin.String
import kotlin.Unit

class Iphone8FourActivity :
    BaseActivity<ActivityIphone8FourBinding>(R.layout.activity_iphone_8_four) {
  private val viewModel: Iphone8FourVM by viewModels<Iphone8FourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8FourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE8FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone8FourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
