package com.zaesapplication.app.modules.iphone8three.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.base.BaseActivity
import com.zaesapplication.app.databinding.ActivityIphone8ThreeBinding
import com.zaesapplication.app.modules.iphone8changephoto.ui.Iphone8ChangePhotoActivity
import com.zaesapplication.app.modules.iphone8three.`data`.viewmodel.Iphone8ThreeVM
import kotlin.String
import kotlin.Unit

class Iphone8ThreeActivity :
    BaseActivity<ActivityIphone8ThreeBinding>(R.layout.activity_iphone_8_three) {
  private val viewModel: Iphone8ThreeVM by viewModels<Iphone8ThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8ThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleSix.setOnClickListener {
      val destIntent = Iphone8ChangePhotoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE8THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone8ThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
