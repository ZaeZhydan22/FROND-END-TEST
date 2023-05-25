package com.zaesapplication.app.modules.iphone8cropphoto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.base.BaseActivity
import com.zaesapplication.app.databinding.ActivityIphone8CropPhotoBinding
import com.zaesapplication.app.modules.iphone8cropphoto.`data`.viewmodel.Iphone8CropPhotoVM
import com.zaesapplication.app.modules.iphone8four.ui.Iphone8FourActivity
import kotlin.String
import kotlin.Unit

class Iphone8CropPhotoActivity :
    BaseActivity<ActivityIphone8CropPhotoBinding>(R.layout.activity_iphone_8_crop_photo) {
  private val viewModel: Iphone8CropPhotoVM by viewModels<Iphone8CropPhotoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8CropPhotoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSimpan.setOnClickListener {
      val destIntent = Iphone8FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE8CROP_PHOTO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone8CropPhotoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
