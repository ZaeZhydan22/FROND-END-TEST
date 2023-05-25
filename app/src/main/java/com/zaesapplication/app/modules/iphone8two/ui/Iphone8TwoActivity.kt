package com.zaesapplication.app.modules.iphone8two.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.base.BaseActivity
import com.zaesapplication.app.databinding.ActivityIphone8TwoBinding
import com.zaesapplication.app.modules.iphone8cropphoto.ui.Iphone8CropPhotoActivity
import com.zaesapplication.app.modules.iphone8one.ui.Iphone8OneActivity
import com.zaesapplication.app.modules.iphone8three.ui.Iphone8ThreeActivity
import com.zaesapplication.app.modules.iphone8two.`data`.viewmodel.Iphone8TwoVM
import kotlin.String
import kotlin.Unit

class Iphone8TwoActivity : BaseActivity<ActivityIphone8TwoBinding>(R.layout.activity_iphone_8_two) {
  private val viewModel: Iphone8TwoVM by viewModels<Iphone8TwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8TwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAmbilDariGallery.setOnClickListener {
      val destIntent = Iphone8CropPhotoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAmbilDariKameraOne.setOnClickListener {
      val destIntent = Iphone8ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      val destIntent = Iphone8OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE8TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone8TwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
