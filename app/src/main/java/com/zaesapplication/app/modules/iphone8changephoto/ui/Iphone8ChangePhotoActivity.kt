package com.zaesapplication.app.modules.iphone8changephoto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.zaesapplication.app.R
import com.zaesapplication.app.appcomponents.base.BaseActivity
import com.zaesapplication.app.databinding.ActivityIphone8ChangePhotoBinding
import com.zaesapplication.app.modules.iphone8changephoto.`data`.viewmodel.Iphone8ChangePhotoVM
import com.zaesapplication.app.modules.iphone8cropphoto.ui.Iphone8CropPhotoActivity
import com.zaesapplication.app.modules.iphone8four.ui.Iphone8FourActivity
import kotlin.String
import kotlin.Unit

class Iphone8ChangePhotoActivity :
    BaseActivity<ActivityIphone8ChangePhotoBinding>(R.layout.activity_iphone_8_change_photo) {
  private val viewModel: Iphone8ChangePhotoVM by viewModels<Iphone8ChangePhotoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8ChangePhotoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.btnSimpan.setOnClickListener {
      val destIntent = Iphone8FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAmbilDariGallery.setOnClickListener {
      val destIntent = Iphone8CropPhotoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE8CHANGE_PHOTO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone8ChangePhotoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
